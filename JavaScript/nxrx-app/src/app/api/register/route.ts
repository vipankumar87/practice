import type { NextApiHandler, NextApiRequest, NextApiResponse } from "next";
import bcrypt from 'bcrypt';
import prismadb from '@/lib/prismadb';
import { NextResponse } from "next/server";

type Data = {
    name: String
}

  export async function POST(req: Request) {
    let jsonOutput = await req.json();
    const { email, password, name } = jsonOutput;

    try {
        const existingUser = await prismadb.user.findFirst({
            where: {
                email: email
            }
        });
        
        if(existingUser){
            return NextResponse.json({ error: "Email taken"}, {status: 322});
        }

        const hashedPassword  =  await bcrypt.hash(password, 12);
        try {
            const user = await prismadb.user.create({
              data: {
                email: email || null,
                name: name || '',
                hashedPassword: hashedPassword || null,
                image: null, // Handle as null if no image is passed
                emailVerified: new Date(),
                favoriteIds: [], // Default empty array for new users
              },
            });
          
            return new Response(JSON.stringify(user), { status: 201 });
          } catch (error) {
            console.error('Error details:', error); // Log the entire error for debugging
            return new Response(
              JSON.stringify({ error: 'An error occurred during user creation' }),
              { status: 500 }
            );
          }
          
        // return NextResponse.json(user, {status: 200});
    } catch (error) {
        return NextResponse.json({'error': error, data: {email, name, password} }, {status: 500})
    }
}
    
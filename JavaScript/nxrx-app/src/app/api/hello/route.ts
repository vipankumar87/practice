import type { NextApiHandler, NextApiRequest, NextApiResponse } from "next";

type Data = {
    name: String
}

// File: src/app/api/users/route.js

export async function GET(req: NextApiRequest) {
    return new Response(JSON.stringify({ message: 'Fetching users' }), {
      status: 200,
      headers: {
        'Content-Type': 'application/json',
      },
    });
  }
  
  export async function POST(req: any) {
    const data = await req.json();
    return new Response(JSON.stringify({ message: 'User created', data }), {
      status: 201,
      headers: {
        'Content-Type': 'application/json',
      },
    });
  }
    
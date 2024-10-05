import NextAuth, { NextAuthOptions } from 'next-auth';
import GithubProvider from 'next-auth/providers/github';
import { Provider } from 'next-auth/providers/index';
import Credentials from 'next-auth/providers/credentials';
import prismadb from '../../../lib/prismadb';
import { compare } from 'bcrypt';

// Configure NextAuth options
export const authOptions: NextAuthOptions = {
  // List of authentication providers
  providers: [
    Credentials({
        id: 'credentials',
        name: "Credentials",
        credentials: {
            email: {
                label: 'Email',
                type: 'text',
            },
            password: {
                label: 'Password',
                type: 'password'
            }
        },
        async authorize(credentials) {
            if(!credentials?.email || !credentials?.password){
                throw new Error('Email or password is missing')
            }

            const user = await prismadb.user.findUnique({
                where: {
                    email: credentials.email
                }
            });

            if(!user || !user.hashedPassword){
                throw new Error("Email is not exists")
            }
            const isCorrectPassword = await compare(credentials.password, user.hashedPassword);

            if(!isCorrectPassword){
                throw new Error("Incorrect Password")
            }
            return user;
        }
    })
    // Add more providers here if needed
  ],

//   // Custom callback functions
//   callbacks: {
//     async session({ session, token }) {
//       // Add any extra fields to the session object if needed
//     //   session.id = token.sub;
//       return session;
//     },
//     async jwt({ token, user }) {
//       // Modify JWT token with additional information
//       if (user) {
//         token.id = user.id;
//       }
//       return token;
//     },
//   },

  // Optional: Define custom pages for sign-in, error, etc.
  pages: {
    signIn: '/auth',  // Custom sign-in page
  },
  debug: process.env.NODE_ENV === 'development',
  session: {
    strategy: 'jwt'
  },
  jwt: {
    secret: process.env.NEXTAUTH_JWT_SECRET
  },
  secret: process.env.NEXTAUTH_SECRET
};

// Default export for NextAuth
export default NextAuth(authOptions);

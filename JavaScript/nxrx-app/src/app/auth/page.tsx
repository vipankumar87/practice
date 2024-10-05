"use client"
import React, { useCallback, useState } from 'react'
import Input from '../components/input'
import axios from 'axios';
export default function Page(){
    const [email, setEmail] = useState('');
    const [name, setname] = useState('');
    const [password, setPassword] = useState('');

    const [variant, setVariant] = useState('login');
    // const [password, setPassword] = useState('');
    const toggleVariant = useCallback(()=>{
        setVariant((currentVariant)=> currentVariant == 'login'?'register':'login');
    }, [])
    // const toggleVariant = function(){
    //     setVariant((currentVariant)=> currentVariant == 'login'?'register':'login');
    // }

    const register = useCallback( async () =>{ 
        console.log(email);
        try {
            await axios.post("/api/register", {
                email, 
                name, 
                password
            })
        } catch (error) {
            
        }
    }, []);
return (
    <div className="relative h-full w-full bg-[url('/images/hero.jpg')] bg-no-repeat bg-cover">
        <div className="bg-black w-full h-full lg:bg-opacity-50">
            <nav className='px-12 py-5'>
                <img src='/images/logo.png' alt='logo' className='h-12'/>
                <div className='flex justify-center'>
                    <div className='bg-black bg-opacity-70 px-16 py-16 self-center mt-2 lg:w-2/5 lg:max-w-md rounded-md w-full'>
                        <h2 className='text-white text-4xl mb-8 font-semibold'>
                            {variant == 'login'? 'Sign In':'Register'}
                        </h2>
                        <div className='flex flex-col gap-4'>
                            {variant == 'register' && (
                                <Input type='text' id='name' label='name?' value={name} onChange={(ev: any)=>{ setname(ev.target.value);}}/>
                            )}
                            <Input type='email' id='email' label='Email Address?' value={email} onChange={(ev: any)=>{ setEmail(ev.target.value);}}/>
                            <Input type='password' id='password' label='Password?' value={password} onChange={(ev: any)=>{ setPassword(ev.target.value);}}/>
                        </div>
                        <button onClick={register} className='bg-red-600 py-3 text-white rounded-md w-full mt-10 hover:bg-red-700 transition'>
                            {variant == 'login' ? 'Login' : 'Sign Up'}
                        </button>
                        <p className='text-neutral-500 mt-12'>
                            {variant == 'login' ? 'First time using Netflix?': 'Already have an account?'}
                            <span onClick={toggleVariant} className='text-white ml-1 hover:underline cursor-pointer'>
                                {variant == 'login' ? 'Create new account': 'Login'}
                            </span>
                        </p>
                    </div>
                </div>
            </nav>
        </div>
    </div>
  )
}

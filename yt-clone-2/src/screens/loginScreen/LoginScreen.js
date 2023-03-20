import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { login } from '../../redux/actions/auth.action';
import { useEffect } from 'react'
import { useNavigate } from 'react-router-dom'

import './_loginScreen.scss';

const LoginScreen = () => {
  
  const dispatch = useDispatch()

  const accessToken = useSelector(state=>state.auth.accessToken)

  const handleLogin = () => {
    dispatch(login())
  }

  const navigate = useNavigate()

  useEffect(()=>{

    if(accessToken) {
      navigate('/')
    }
  }, [accessToken, navigate])

  return (
    <div className='login'>
      <div className='login__container'>
        <img
          src='http://pngimg.com/uploads/youtube/youtube_PNG2.png'
          alt=''
        />
        <button onClick = {handleLogin} >Login With Google</button>
        <p>This Project is made using Youtube Data API</p>
      </div>
    </div>
  )
}

export default LoginScreen;
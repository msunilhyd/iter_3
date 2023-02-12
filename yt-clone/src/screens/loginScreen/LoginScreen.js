import React, { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { useHistory } from 'react-router-dom'
import { login } from '../../redux/actions/auth.action'

import './loginScreen.scss'

const LoginScreen = () => {
  
  const dispatch = useDisaptch()

  const accessToken = useSelector(state => state.auth.accessToken)

  const handleLogin = () => {
    dispatch(login())
  }

  const history = useHistory()

  useEffect(() => {
    if (accessToken) {
      history.push('/')
    }
  }, [accessToken, history])

  return (
    <div className='login'>
      <div className='login__container'>
        <h2>Youtube clone</h2>
        <img
          src='http://pngimg.com/uploads/youtube/youtube_PNG2.png'
          alt=''
        />
        <button onClick={handleLogin}>Login With Google</button>
        <p>This Project is made using YOUTUBE DATA API</p>
      </div>
    </div>
  )
}

export default LoginScreen
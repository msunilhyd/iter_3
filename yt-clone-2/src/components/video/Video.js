import React from 'react'
import './_video.scss'
import {AiFillEye} from 'react-icons/ai'

const Video = () => {
  return (
    <div className='video'>
      <div className='video__top'>
        <img src='https://i.ytimg.com/vi/_iMItrc0ChU/hqdefault.jpg?s…AFwAcABBg==&rs=AOn4CLCWPG4KwKEGrN9JIXDGdvBJojrswg' alt='' />
        <span>05:43</span>
      </div>
      <div className='video__title'>
        Creat app in 5 minutes #made by Chintu
      </div>
      <div className='video__details'>
        <span>
          <AiFillEye /> 5m Views
        </span>
        <span>5 days ago</span>
      </div>
      <div className='video__channel'>
        <img src='https://i.ytimg.com/vi/5dVT08FsTas/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBypaRGv2P2zyvzcXsSOkOCm4P03w' alt='' />
        <p>Raibow Hat Jr</p>
      </div>
    </div>
  )
}

export default Video
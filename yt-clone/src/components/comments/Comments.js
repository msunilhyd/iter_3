import React from 'react'
import moment from 'moment'
import './_comment.scss'

const Comment = ({ comment }) => {
  const {
    authorDisplayName,
    authorProfileImageUrl,
    publishedAt,
    textDisplay,
  } = comment

  return (
    <div className='p-2 comment d-flex'>
      <img
        src={authorProfileImageUrl}
        alt=''
        className='mr-3 rounded-cirlce'
      />
      <div className='comment__body'>
        <p className='mb-1 comment__header'>

        </p>
      </div>
    </div>
  )
}
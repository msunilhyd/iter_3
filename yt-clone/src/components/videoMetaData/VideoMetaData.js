import React, { useEffect } from 'react'
import './_videoMetaData.scss'
import moment from 'moment'
import numeral from 'numeral'

import { MdThumbUp, MdThumbDown } from 'react-icons/md'
import ShowMoreText from 'react-show-more-text'
import { useDispatch, useSelector } from 'react-redux'
import { 
  checkSubscriptionStatus,
  getChannelDetails,
} from '../../redux/actions/channel.action'

const videoMetaData = ({ video: { snippet, statistics }, videoId }) => {
  
  const { channelId, channelTitle, description, title, publishedAt } = snippet
  const { viewCount, likeCount, dislikeCount } = statistics

  const dispatch = useDispatch()

  const {
    snippet: channelSnippet,
    statistics: channelStatistics,
  } = useSelector(state => state.channelDetails.channel)

  const subscriptionStatus = useSelector (
    state => state.channelDetails.subscriptionStatus
  )

  useEffect(() => {
    dispatch(getC)
  })
}
import React, { useState } from 'react'
import { useDispatch } from 'react-redux'
import {
  getPopularVideos,
  getVideosByCategory,
} from '../../redux/actions/videos.action'
import './_categoriesBar.scss'

const keywords = [
  'All',
  'React js',
  'Angular js',
  'React Native',
]
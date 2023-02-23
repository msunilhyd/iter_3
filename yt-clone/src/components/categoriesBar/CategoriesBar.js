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
  'use of API',
  'Redux',
  'Music',
  'Algorithm Art',
  'Guitar',
  'Bengali Songs',
  'Coding',
  'Cricket',
  'Football',
  'Real Madrid',
  'Gatsby',
  'Poor Coder',
  'Shwetabh',
]

const CategoriesBar = () => {

  const [activeElement, setActiveElement] = useState('All')

  const dispatch = useDispatch()

  const handleClick = value => {
    setActiveElement(value)
    if (value === 'All') {

    }
  }
}
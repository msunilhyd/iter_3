import React from 'react'
import './_sidebar.scss'

import {
  MdSubscriptions,
  MdExitToApp,
  MdThumbUp,
  MdHistory,
  MdLibraryBooks,
  MdHome,
  MdSentimentDissatisfied,
} from 'react-icons/md'

import { useDispatch } from 'react-redux'
import { log_out } from '../../redux/actions/auth.action'
import { Link } from 'react-router-dom'

const Sidebar = ({ sidebar, handleToggleSidebar }) => {
  const dispatch = useDispatch()
  const logOutHandler = () => {
    dispatch(log_out())
  }
  return (
    <nav 
      className={sidebar ? 'sidebar open' : 'sidebar'}
      onClick={() => handleToggleSidebar(false)}>
        <li>
          <MdHome size={23} />
          <span>Home</span>
        </li>
        <Link to='/feed/subsriptions'>
          <li>
            <MdSubscriptions size={23} />
            <span>Subscriptions</span>
          </li>
        </Link>
        <li>
          <MdThumbUp size={23} />
          <span>Liked Video</span>
        </li>
        <li>
          <MdHistory size={23} />
          <span>History</span>
        </li>
        <li>
          <MdHistoryBooks size={23} />
          <span>Library</span>
        </li>
        <li>
          <MdSentimentDissatisfied size={23} />
          <span>I don't know</span>
        </li>
        
        <hr />
        
        <li onClick={logoutHandler}>
          <MdExitToApp size={23} />
          <span>Log Out</span>
        </li>

        <hr />
      </nav>
  )
}

expor default Sidebar;
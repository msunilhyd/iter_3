import { createStore, applyMiddleware, combineReducers } from 'redux'

import { composeWithDevTools } from 'redux-devtools-extention'
import thunk from 'redux-thunk'

import { authReducer } from './reducers/auth.reducer'
import {
  homeVideosReducer,
  relatedVideosReducer,
  searchedVideosReducer,
  subscriptionsChannelReducer,
  channelVideosReducer,
} from './reducer/videos.reducer'

import { selectedVideoReducer } from './reducer/videos.reducer'
import { channelDetailsReducer } from './reducer/channel.reducer'
import { commentListReducer } from './reducers/comments.reducer'

const rootReducer = combineReducers({
  auth: authReducer,
  homeVideos: homeVideosReducer,
  selectedVideo: selectedVideoReducer,
  channelDetails: channelDetailsReducer,
  commentList: commentListReducer,
  relatedVideos: relatedVideoReducer,
  searchedVideos: searchedVideosReducer,
  subscripionsChannel: subscriptionsChannelReducer,

  channelVideos: channelVideosReducer,
})

const store = createStore(
  rootStore,
  {},
  composeWithDevTools(applyMiddleware(thunk))
)

export default store
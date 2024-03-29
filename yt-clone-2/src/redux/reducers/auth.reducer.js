
import { LOGIN_SUCCESS } from '../actionType';
import { LOGIN_REQUEST } from '../actionType';
import { LOGIN_FAIL } from '../actionType';
import { LOAD_PROFILE } from '../actionType';

const initialState = {
  accessToken: sessionStorage.getItem("ytc-access-token") 
    ? sessionStorage.getItem("ytc-access-token") 
    : null,
  user: sessionStorage.getItem("ytc-user") 
    ? 
    JSON.parse(sessionStorage.getItem("ytc-user")) 
    : null,
  loading: false,
}

export const authReducer = (prevState = initialState, action) => {

  const {type, payload} = action
  
    switch(type) {

      case LOGIN_REQUEST:
        return {
          ...prevState,
          loading: true
        }
      case LOGIN_SUCCESS:
        return {
          ...prevState,
          accessToken: payload,
          loading: false,
        }
      case LOGIN_FAIL:
        return {
          ...prevState,
          accessToken: null,
          loading: false,
          error: payload,
        }
      case LOAD_PROFILE:
        return {
          ...prevState,
          user: payload,
        }
        default: 
          return prevState
    }
}
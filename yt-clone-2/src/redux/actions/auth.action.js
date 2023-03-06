import { 
  GoogleAuthProvider,
  signInWithPopup,
  signInWithRedirect 
} from 'firebase/auth'


import { LOGIN_SUCCESS } from '../actionType';
import { LOGIN_REQUEST } from '../actionType';
import { LOGIN_FAIL } from '../actionType';
import { LOAD_PROFILE } from '../actionType';

import { auth } from '../../firebase'

export const login = () => async dispatch => {
  try {

    dispatch({
      type: LOGIN_REQUEST,
    })
    const provider = new GoogleAuthProvider();
    provider.setCustomParameters({
      prompt: "select_account"
    })

    const res = await signInWithPopup(auth, provider)

    console.log(res)
    const accessToken = res.user.accessToken

    const profile = {
      name: res.user.displayName,
      photoURL: res.user.photoURL,
    }

    sessionStorage.setItem("ytc-access-token", accessToken)
    sessionStorage.setItem("ytc-user", JSON.stringigy(profile))

    dispatch({
      type: LOGIN_SUCCESS,
      payload: accessToken,
    })

    dispatch({
      type: LOAD_PROFILE,
      payload: profile,
    })
  } catch (error) {
    console.log(error)
    dispatch({
      type: LOGIN_FAIL,
      payload: error.message
    })
  }
}
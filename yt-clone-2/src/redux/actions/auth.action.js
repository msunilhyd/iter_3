import { 
  GoogleAuthProvider,
  signInWithPopup,
  signInWithRedirect 
} from 'firebase/auth'

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

    const accessToken = res.credential.accessToken

    const profile = {
      name: res.additionalUserInfo.profile.displayName,
      photoURL: res.additionalUserInfo.profile.photoURL,
    }
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
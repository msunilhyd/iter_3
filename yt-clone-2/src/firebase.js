import { initializeApp } from 'firebase/app'

import { getAuth } from 'firebase/auth'

const firebaseConfig = {
  apiKey: "AIzaSyAgzbxusFd6x6P_BtYkjyY8_FsuwNpFQlQ",
  authDomain: "clone-2-b8194.firebaseapp.com",
  projectId: "clone-2-b8194",
  storageBucket: "clone-2-b8194.appspot.com",
  messagingSenderId: "915900511581",
  appId: "1:915900511581:web:8f500fdc8f6831fdd624b4"
};

const app = initializeApp(firebaseConfig)

export const auth = getAuth(app)
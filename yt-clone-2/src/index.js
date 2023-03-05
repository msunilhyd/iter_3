import { StrictMode } from 'react'
import App from './App'
import { createRoot } from 'react-dom/client'

import 'bootstrap/dist/css/bootstrap.min.css'

import './_base.scss'
import { Provider } from 'react-redux'
import store from './redux/store'

const rootElement = document.getElementById('root');
const root = createRoot(rootElement);

root.render(
  <Provider store={store}>
    <StrictMode>
      <App />
    </StrictMode>
  </Provider>
)
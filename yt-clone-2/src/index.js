import { StrictMode } from 'react'
import App from './App'
import { createRoot } from 'react-dom/client'

import 'bootstrap/dist/css/bootstrap.min.css'

import { BrowserRouter as Router } from 'react-router-dom'

import './_base.scss'
import { Provider } from 'react-redux'
import store from './redux/store'

const rootElement = document.getElementById('root');
const root = createRoot(rootElement);

root.render(
  <Provider store={store}>
    <Router>
      <StrictMode>
        <App />
      </StrictMode>
    </Router>
  </Provider>
)
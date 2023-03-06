import React, { useState } from 'react';
import Header from './components/header/Header'
import Sidebar from './components/sidebar/Sidebar'
import HomeScreen from './screens/homeScreen/HomeScreen'
import LoginScreen from './screens/loginScreen/LoginScreen'
import { Container } from 'react-bootstrap'

import { BrowserRouter as Router, Navigate, Route, Routes } from 'react-router-dom'

import { useSelector } from 'react-redux'
import { useEffect, useHistory } from 'react'

import './_app.scss'

const Layout = ({children}) => {

  const [sidebar, toggleSidebar] = useState(false);

  const handleToggleSidebar = () => toggleSidebar(value => !value)

  return (
    <>
    <Header handleToggleSidebar={handleToggleSidebar} />
    <div className="app__container">
      <Sidebar 
        sidebar={sidebar}
        handleToggleSidebar={handleToggleSidebar}
      />
      <Container fluid className="app__main">
        {children}
      </Container>
    </div>
    </>
  )
}

const App = () => {

  const { accessToken, loading } = useSelector(state => state.auth)

  const history = useHistory()
  
  useEffect(() => {

    if (!loading && !accessToken) {
      history.push('/auth')
    }
  }, [accessToken, loading, history])

  return (
      <Routes>

        <Route path='/' exact element={(
          <Layout>
            <HomeScreen />
          </Layout>
        )}>
        </Route>

        <Route 
          path='/auth' 
          element={(
            <LoginScreen />
          )}>
        </Route>

        <Route 
          path='/search' 
          element={(
            <Layout>
              <h1>Search Results</h1>
            </Layout>
          )}
        >
        </Route>

        <Route 
          path='*'
          element={<Navigate to='/' />} 
        />
      </Routes>
  )
}

export default App
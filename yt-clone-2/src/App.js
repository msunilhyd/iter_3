import React, { useState } from 'react';
import Header from './components/header/Header'
import Sidebar from './components/sidebar/Sidebar'
import HomeScreen from './screens/homeScreen/HomeScreen'
import LoginScreen from './screens/loginScreen/LoginScreen'
import { Container } from 'react-bootstrap'

import { BrowserRouter as Router, Navigate, Route, Routes } from 'react-router-dom'

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

  

  return (

    <Router>

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
    </Router>
  )
}

export default App
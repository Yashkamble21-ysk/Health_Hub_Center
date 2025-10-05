import React from "react";
import "./App.css";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import Banner from "./Components/Banner";
import Navigation from "./Components/Navigation";
import AuthButtons from "./Components/AuthButtons";
import MainContainer from "./Components/MainContainer";
import Services from "./Components/Services";
import Register from "./Components/Register";
import Login from "./Components/Login"; // ✅ Import Login

function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          {/* ✅ Default home route */}
          <Route
            path="/"
            element={
              <>
                <Banner />
                <Navigation />
                <AuthButtons />
                <MainContainer />
                <Services />
              </>
            }
          />

          {/* ✅ When user clicks REGISTER, show only Register component */}
          <Route path="/register" element={<Register />} />

          {/* ✅ When user clicks LOGIN, show only Login component */}
          <Route path="/login" element={<Login />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;

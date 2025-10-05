import React from "react";
import { Link } from "react-router-dom";

const AuthButtons = () => {
  return (
    <div className="buttons">
      <button className="login-btn">
        <Link to="/login">LOGIN</Link>
      </button>
      <button className="register-btn">
        <Link to="/register">REGISTER</Link>
      </button>
    </div>
  );
};

export default AuthButtons;

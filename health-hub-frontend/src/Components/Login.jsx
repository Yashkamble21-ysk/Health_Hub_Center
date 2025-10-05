import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const Login = () => {
  const navigate = useNavigate();
  const [formData, setFormData] = useState({ email: "", password: "" });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    // Add real login logic here later (API call)
    if (formData.email && formData.password) {
      alert("Login Successful!");
      navigate("/"); // redirect to home
    } else {
      alert("Please fill in all fields.");
    }
  };

  const handleBack = () => {
    navigate("/"); // ✅ Go back to home
  };

  return (
    <div className="login-container">
      <div className="login-card">
        <h2>Welcome Back 👋</h2>
        <p>Please log in to your account</p>

        <form onSubmit={handleSubmit} className="login-form">
          <div className="form-group">
            <label>Email</label>
            <input
              type="email"
              name="email"
              placeholder="Enter your email"
              value={formData.email}
              onChange={handleChange}
              required
            />
          </div>

          <div className="form-group">
            <label>Password</label>
            <input
              type="password"
              name="password"
              placeholder="Enter your password"
              value={formData.password}
              onChange={handleChange}
              required
            />
          </div>

          <div className="login-buttons">
            <button type="submit" className="login-btn">Login</button>
            <button
              type="button"
              className="back-btn"
              onClick={handleBack}
            >
              ← Back
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};

export default Login;

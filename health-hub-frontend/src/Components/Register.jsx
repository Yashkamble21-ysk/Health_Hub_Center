import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const Register = () => {
  const navigate = useNavigate();
  const [formData, setFormData] = useState({
    fullName: "",
    email: "",
    phone: "",
    address: "",
    username: "",
    password: "",
    role: "", // 🆕 Added role field
  });

  const [message, setMessage] = useState("");

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch("http://localhost:8080/api/register", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(formData),
      });

      if (response.ok) {
        setMessage("✅ Registration successful!");
        setTimeout(() => navigate("/login"), 1500);
      } else {
        setMessage("❌ Registration failed. Please try again.");
      }
    } catch (error) {
      console.error("Error during registration:", error);
      setMessage("⚠️ Something went wrong. Try again later.");
    }
  };

  return (
    <div className="register-container">
      <h2>Create Account 🩺</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="fullName"
          placeholder="Full Name"
          value={formData.fullName}
          onChange={handleChange}
          required
        />

        <input
          type="email"
          name="email"
          placeholder="Email Address"
          value={formData.email}
          onChange={handleChange}
          required
        />

        <input
          type="tel"
          name="phone"
          placeholder="Phone Number"
          value={formData.phone}
          onChange={handleChange}
          required
        />

        <input
          type="text"
          name="address"
          placeholder="Address"
          value={formData.address}
          onChange={handleChange}
          required
        />

        <input
          type="text"
          name="username"
          placeholder="Username"
          value={formData.username}
          onChange={handleChange}
          required
        />

        <input
          type="password"
          name="password"
          placeholder="Create Password"
          value={formData.password}
          onChange={handleChange}
          required
        />

        {/* 🆕 Role Dropdown */}
        <select
          name="role"
          value={formData.role}
          onChange={handleChange}
          required
        >
          <option value="">Select Role</option>
          <option value="doctor">Doctor</option>
          <option value="patient">Patient</option>
        </select>

        <button type="submit" className="register-btn">
          Register
        </button>
      </form>

      {message && <p className="message">{message}</p>}

      <button className="back-btn" onClick={() => navigate(-1)}>
        ← Back
      </button>
    </div>
  );
};

export default Register;

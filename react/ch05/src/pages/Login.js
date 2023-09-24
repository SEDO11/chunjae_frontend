//Navigate : Route로 설정된 특정 페이지로 이동
import React, { useState } from "react";
import { Navigate } from "react-router-dom";
import '../css/Login.sass'

const Login = ({ authenticated, login }) => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleClick = () => {
    try {
      login({ email, password });
    } catch (e) {
      alert("Failed to login");
      setEmail("");
      setPassword("");
    }
  };
  if (authenticated) return <Navigate to="/login" replace={true} />;
  return (
    <div>
      <h1>Login</h1>
      <input
        value={email}
        onChange={({ target: { value } }) => setEmail(value)}
        type="text"
        placeholder="email"
      />
      <input
        value={password}
        onChange={({ target: { value } }) => setPassword(value)}
        type="password"
        placeholder="password"
      />
      <button 
        onClick={handleClick}>Login</button>
    </div>
  );
};

export default Login;
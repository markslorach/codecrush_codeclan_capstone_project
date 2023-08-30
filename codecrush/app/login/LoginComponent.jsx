import React from "react";
import { UserAuth } from "../context/AuthContext";

export default function LoginComponent() {
  const { user, googleSignIn, logOut } = UserAuth();
  const handleSignIn = async () => {
    try {
      await googleSignIn();
    } catch (error) {
      console.log(error);
    }
  };
  console.log(user);
  return (
    <main>
      <button onClick={handleSignIn}>Login</button>
    </main>
  );
}

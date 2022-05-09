import React, { useState } from "react";
import Post from "./components/post/Post";
import "./App.css";

const  App= () => {
  const [posts, setPosts] = useState([
    {
      username: "blessingthebobo",
      caption: "why is he looking at me ",
      imageUrl:
        "meme.jpeg",
    },
    {
      username: "Jason",
      caption: "Oh, I'm a God!, Season 3 is coming!!!!",
      imageUrl:
        "demonslayer.jpeg",
    },
  ]);
  return (
    <div className="app">
      <div className="app__header">
        <div className="app__headerWrapper">
          <img
            src=" https://www.instagram.com/static/images/web/mobile_nav_type_logo.png/735145cfe0a4.png"
            alt="Instagram original logo"
          />
          <div className="app__headerButtons">
            <button className="primary__button">Log in</button>
            <button className="text__button">Sign up</button>
          </div>
        </div>
      </div>
      <div className="timeline">
        {posts.map((post) => (
          <Post key={post.id}
            username={post.username}
            caption={post.caption}
            imageUrl={post.imageUrl}
          />
        ))}
      </div>
    </div>
  );
}

export default App;
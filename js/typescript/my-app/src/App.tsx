import React, { useState } from "react";
import Post from "./components/post/Post";
import "./App.css";
import { Avatar } from "@material-ui/core";

const  App= () => {
  const [posts, setPosts] = useState([
    {
      id:1,
      username: "blessingthebobo",
      caption: "why is he looking at me ",
      imageUrl:"meme.jpeg",
    },
    {
      id:2,
      username: "Jason",
      caption: "Oh my a God!, Season 3 is coming!!!!",
      imageUrl:"demonslayer.jpeg",
    },
    {
      id:3,
      username: "Pablo",
      caption: "hello enjoy my work",
      imageUrl:"work.jpeg",
    },
  ]);
  
  return (
    <div className="app">
      <div className="app__header">
        <div className="app__headerWrapper">
          <img
            width={90} height={90} src = "Instagram-Logo.png"
          />
          {/* <div className="app__headerButtons">
            <button className="primary__button">Log in</button>
            <button className="text__button">Sign up</button>
          </div> */}
        </div>
        <Avatar
          src="icon.jpeg"
          />
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

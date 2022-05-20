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
      likes: 250,
    },
    {
      id:2,
      username: "Jason",
      caption: "Oh my a God!, Season 3 is coming!!!!",
      imageUrl:"demonslayer.jpeg",
      likes: 1050,
    },
    {
      id:3,
      username: "Pablo",
      caption: "hello enjoy my work",
      imageUrl:"work.jpeg",
      likes: 2345,
    },
  ]);

  const [imageURL,setImageURL] = useState("")

  const handleImage = (e: any) => {
    setImageURL(URL.createObjectURL(e.target.files[0]))
    //The URL.createObjectURL() static method creates a string containing a URL representing the object given in the parameter.
  } 

  const handleSubmit = (e:any) => {
    e.preventDefault()
    const newPost = posts[posts.length -1]
    setPosts(
      [
        {
          id: newPost.id + 1,
          username:"Daniel",
          imageUrl:imageURL,
          caption:e.target.Description.value,
          likes: 0,
        },
        ...posts
      ]
    )

  }
  return (
    <div className="app">
      <div className="app__header">
        <div className="app__headerWrapper">
          <img
            width={90} height={90} src = "Instagram-Logo.png"
          />
           <form style={{padding:"4px 35%"}}> 
          <input name="Search" placeholder="Search"></input>{/* search bar */}
          </form>
          {/* <div className="app__headerButtons">
            <button className="primary__button">Log in</button>
            <button className="text__button">Sign up</button>
          </div> */}
          </div>
          {/* <Avatar
            src="icon.jpeg"
            /> */}
            {/* Profile picture */}
            <Avatar 
            className="post__avatar"
            alt={"Daniel"}
            src="/static/images/avatar/1.jpg"
          />
      </div>
      <div>
        {/* <button onClick={handleClick}>choose a file </button> */}
        <form style={{padding:"5px 45%"}} onSubmit={(e) => handleSubmit(e)}>
        <input type= "file" onChange={handleImage}/>
        <input name="Description" placeholder="Description"/>
        <button>Upload New Post</button>
        </form>
      </div>
      <div className="timeline">
        {posts.map((post) => (
          <Post key={post.id}
            username={post.username}
            caption={post.caption}
            imageUrl={post.imageUrl}
            likes={post.likes}
          />
        ))} 
       </div> 
    </div>
  );
}

export default App;

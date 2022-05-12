import React,{ useState } from 'react';
import './App.css';
import "./Post"
import { TextField } from '@material-ui/core';
import Post from './Post';

const App= () => {
  const [posts, setPosts] = useState([
    {
      id:1,
      username:"blessingthebobo",
      caption:"i am testing",
      ImageUrl:"meme.jpeg"
    },
    {
      id:2,
      username:"Pedro",
      caption:"i am testing this ",
      ImageUrl:"demonslayer.jpeg"
    }
  ]) 
  return (
    <div className="App">
      <div className="insta-header">  {/* the Header */}
        <div className="insta-wrapper"> {/* the image/button of the header*/}
          <img  width={90} height={90} src = "Instagram-Logo.png"/>
          {/* <div className="search">
            <TextField
            id="outline-basic"
            variant="outlined"
            label="Search"
          />
          </div> */}
          <div className="insta_headerButtons">
            <button className="log_button">Log in</button>
            <button className="sign_button">Sign up</button>
          </div>
        </div>
      </div>
      <div className="setupPost">
        {posts.map((post) => (
        <Post key={post.id}
        username={post.username}
        caption={post.caption}
        ImageUrl={post.ImageUrl}
        />
        ))}
      </div>
    </div>
  );
}

export default App;

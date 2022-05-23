import React,{useState} from "react";
import "./Post.css";
import Avatar from "@material-ui/core/Avatar";
import { Checkbox, FormControlLabel } from "@material-ui/core";
import { Favorite, FavoriteBorder } from "@material-ui/icons";

type PostProps = {
  avatar: string|undefined,
  username: string,
  caption: string,
  imageUrl: string,
  likes: number,
}
type PostComment = {
  comment: string
}
const Post = ({username, caption, imageUrl, likes, avatar}: PostProps) => { // the Post propoties.

  const [count,setCount] = useState(0)// the value that starts is 0
  const handleClick= () => {
    alert("i am being clicked")
  }

  return (
    <div className="post">
      <div className="post__header">
        {/* Header: avatar with username / A appendice */}
        <Avatar 
          className="post__avatar"
          alt={avatar}
          src="/static/images/avatar/1.jpg"
        />
        <h3>{username}</h3>
      </div>
      {/* Image */}
      <img className="post__image"  width={200} height={200} src={imageUrl} alt="" />
      {/* A appendice for the like button. */}
      <div style={{
        margin: "left",
        display: "block",
        width: "fit-content"
        }}>
        <FormControlLabel
        control={<Checkbox icon ={<FavoriteBorder/>}
        checkedIcon={<Favorite/>}
        name="checkedH" />}
        label = {likes + count}  // here is where the action happens.
        onClick={() => {setCount(count + 1 )}} //setCount updates the current state(count)
        /> 
      </div>
      {/* Username + caption */}
      <h4 className="post__text">
        <strong>{username}:</strong> {caption}
      </h4>    
      <hr/>
      <form style={{padding:"15px 0%"}}>  {/* comments */}
          <input name="comment" placeholder="Your comment"></input> 
      </form> 
      <li style={{padding:"5px 3%"}}>
        <strong>The lolMAn:</strong> Amazing
      </li>
      <li style={{padding:"5px 3%"}}>
        <strong>The ONe:</strong> sheeeesh
      </li>
      <li style={{padding:"5px 3%"}}>
        <strong>heheBOy:</strong> wow
      </li>

      
    </div>
  );
}

export default Post;
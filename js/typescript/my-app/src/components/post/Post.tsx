import React from "react";
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

const Post = ({username, caption, imageUrl, likes, avatar}: PostProps) => {

  return (
    <div className="post">
      <div className="post__header">
        {/* Header: avatar with username */}
        <Avatar
          className="post__avatar"
          alt={avatar}
          src="/static/images/avatar/1.jpg"
        />
        <h3>{username}</h3>
      </div>
      {/* Image */}
      <img className="post__image"  width={200} height={200} src={imageUrl} alt="" />
      {/* Username + caption */}
      <div style={{
        margin: "left",
        display: "block",
        width: "fit-content"
      }}>
        <FormControlLabel
        control={<Checkbox icon ={<FavoriteBorder/>}
        checkedIcon={<Favorite/>}
        name="checkedH" />}
        label = {likes}
        />
      </div>
      <h4 className="post__text">
        <strong>{username}:</strong> {caption}
      </h4>    
    </div>
  );
}

export default Post;
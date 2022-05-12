import React from "react";
import "./App"
import "./Post.css"

const Post = ({username , caption , imageUrl}) => {
    return(
        <div className="post">
            <div className="post_header">
                <h2>{username}</h2> 
                
            </div>
            <img className="post_image" width={200} height={200} src={"demonslayer.jpeg"} alt="" />
            <h4 className="post_text">
                <strong>{username}:</strong> {caption}
            </h4>
        </div>
    )
}

export default Post;
import React from "react";

const MyHobby = (props) => (
    <div>
      <h3>My Hobbies:</h3>
      {props.myHobby.map(myHobby => <p key={myHobby}>{myHobby}</p>)}
    </div>
  );
export default MyHobby;
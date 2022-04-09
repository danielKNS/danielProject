import React from "react";

const MyHobby = (props) => (
    <div>
      <h1>-----My Hobbies----- :</h1>
      {props.myHobby.map(myHobby => <p key={myHobby}>{myHobby}</p>)} 
      {/* what is happening here ^ */}
    </div>
  );
export default MyHobby;
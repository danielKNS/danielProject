import React from "react";

const MyHobby = (props) => (
    <div>
      <h1>-----My Hobbies----- :</h1>
      {props.myHobby.map(myHobby => <li key={myHobby}>{myHobby}</li>)} 
      {/* what is happening here ^ */}
    </div>
  );
export default MyHobby;

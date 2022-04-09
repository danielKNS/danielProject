import React from "react";

const MyInfo = (props) => {
    const listItems = props.myInfo.map((person) => (
      <div><p key = {person.name}> {person.name}</p> 
      <p> {person.lastName} </p>
      <p>{person.myCurrentAge} </p>
      <p>{person.myBirthDate} </p>
      <p> {person.favoriteColour} </p>
      <p>{person.myDream} </p> </div>)
    );
    return (
      <div>
        <h1>-----About Me----- :</h1>
        {listItems}
      </div>
    );
  }
export default MyInfo ;
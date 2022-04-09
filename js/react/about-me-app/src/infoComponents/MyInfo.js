import React from "react";

const MyInfo = (props) => {
    const listItems = props.myInfo.map((person) => (
      <p key = {person.name}>{person.name}  {person.lastName} {person.myCurrentAge} {person.myBirthDate} {person.favoriteColour} </p>)
    );
    return (
      <div>
        <h1>About Me! :</h1>
        {listItems}
      </div>
    );
  }
export default MyInfo ;
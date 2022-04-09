import React from "react";

const SuperPeople = (props) => {
    const listItems = props.superPeople.map((person) => (
      <p key={person.name}>{person.name} has {person.power}</p>)
    );
    return (
      <div>
        <h3>Heroes and their super Powers</h3>
        {listItems}
      </div>
    );
  }
export default SuperPeople ;


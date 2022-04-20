import React from "react";
import MyFriend3 from "./MyFriend3";

const MyFriendList = () => {
    const friends = [
        {
          id: 1,
          name: "Victoria",
          age: 17,
          favoriteColor: 'blue'
        },
        {
          id: 2,
          name: "Emre",
          age: 20,
          favoriteColor: 'black'
        },
        {
          id: 3,
          name: "Rafael",
          age: 16,
          favoriteColor: 'Purple'
        },
        {
            id: 4,
            name: "Pedro",
            age: 12,
            favoriteColor: 'orange'
          }
      ]
    
    
  // return MUST return 1 single JSX element, and NO JS code is allowed here*
  return (
    <>
      {/* <h1>My friends</h1>

      <h2>Array of objects...</h2>
      <p>my first friend's name: {friends[0].name}</p>
      <p>my first friend's age: {friends[0].age}</p>
      <p>my first friend's favorite color: {friends[0].favoriteColor}</p>

      <hr/>

      <p>my second friend's name: {friends[1].name}</p>
      <p>my second friend's age: {friends[1].age}</p>
      <p>my second friend's favoriteColor: {friends[1].favoriteColor}</p>
     
      <hr/>

      <p>my third friend's name: {friends[2].name}</p>
      <p>my third friend's age: {friends[2].age}</p>
      <p>my third friend's favoriteColor: {friends[2].favoriteColor}</p> */}

    <h2>My Friend List :</h2>
    {friends.map(friend => {
      return (
        <MyFriend3 
          key={friend.id}
          friend={friend}
          anotherProp="hello"
          yetAnotherProp={['red', 'black', 'blue']}
        />
      )
    })}
    </>
  )
}


export default MyFriendList;
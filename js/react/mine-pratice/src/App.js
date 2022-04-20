import React from 'react';
import './App.css';
import Destructuring from './Destructuring'

const App =() => {
  const friends = [
    {
      name: "Victoria",
      age: 17,
      favoriteColor: 'blue',
      favoriteSport: 'VolleyBall'
    },
    {
      name: "Emre",
      age: 20,
      favoriteColor: 'black',
      favoriteSport: 'soccer'
    },
    {
      name: "Rafael",
      age: 16,
      favoriteColor: 'Purple',
      favoriteSport: 'tennis'
    },
    {
        name: "Pedro",
        age: 12,
        favoriteColor: 'orange',
        favoriteSport: 'bowling'
      }
  ]

  return (
    <div>
  
  <h1>My Friends Informations :</h1>
      {friends.map(Myfriend => (
          <Destructuring
          friend={Myfriend}
          />
      )
      )}</div>
      )
}


export default App;

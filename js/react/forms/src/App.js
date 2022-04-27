import React, { useState } from 'react'
import './App.css';

const App =() => {

  const initalPerson = {
    firstName:"Daniel",
    LastName:"Ribeiro",
    Age:"20",
    favoriteColour:"Black",
    country:"USA",
    song:"Animal",
    aboutMe:"ehhhhh bye",
    favoriteIceCream:"Chocolate"

  }

  const [person, setPerson] = useState(initalPerson)


  const handleSubmit = (e) => {
    e.preventDefault()
    console.log("i am being submited by the event:", e)

    const typedFistName = e.target.elements.thisIsTheNameICreated.value
    const typedLastName = e.target.elements.thisIsTheLastName.value
    const typedAge = e.target.elements.thisIsTheAge.value
    const typedfavoriteColour = e.target.elements.thisIsTheFavoriteColour.value
    const typedCountry = e.target.elements.thisIsTheCountry.value
    const typedSong = e.target.elements.thisIsTheSong.value
    const typedaboutMe = e.target.elements.aboutMe.value
    const typedIcedCream = e.target.elements.thisIsTheFavoriteIceCream.value
    const typedIsHungry = e.target.elements.isHungry.checked
    const typedIsThirsty = e.target.elements.isThirsty.checked
    const typedGender = e.target.elements.gender.value
    
    setPerson({
      firstName:typedFistName,
      LastName:typedLastName,
      Age:typedAge,
      favoriteColour:typedfavoriteColour,
      country:typedCountry,
      song:typedSong,
      favoriteIceCream:typedIcedCream,
      aboutMe:typedaboutMe,
      isHungry:typedIsHungry,
      isThirsty:typedIsThirsty,
      gender:typedGender
    })
  } 


  return (
    <div className="App">
       <hr/>
      <h1> this is my form!</h1>

      <form onSubmit={handleSubmit}>
        <p>First Name</p>
        <input type={"text"}name="thisIsTheNameICreated"/>


        <p>Last name </p>
        <input type={"text"}name="thisIsTheLastName"/>

        <p>Age </p>
        <input type={"text"}name="thisIsTheAge"/>

        <p>Favorite Ice Cream </p>
        <select name="thisIsTheFavoriteIceCream">
          <option value="Mint">Mint</option>
          <option value="Banana">Banana</option>
          <option value="Chocolate">Chocolate</option>
        </select>

        <p>Are you Hungry ? <input type={"checkbox"} name={"isHungry"}/></p>
        <p>Are you Thirsty <input type={"checkbox"} name={"isThirsty"}/></p>

        <div>
          <p>Choose your gender</p>
          <input type="radio" value="Male" name="gender" /> Male
          <input type="radio" value="Female" name="gender" /> Female
          <input type="radio" value="Other" name="gender" /> Other
        </div>

        <p>Favorite Colour</p>
        <input type={"text"}name="thisIsTheFavoriteColour"/>

        <p>Country</p>
        <input type={"text"}name="thisIsTheCountry"/>

        <p>Song</p>
        <input type={"text"}name="thisIsTheSong"/>

        <p>About me</p>
        <textarea name ="aboutMe"></textarea>

        <div>
          <button>Click me </button>
        </div>
      </form>
      <div>
        <p>My name is {person.firstName} {person.LastName} with the age of {person.Age}</p>
        
        <p>My favorite Colour is {person.favoriteColour} and my Favorite Ice Cream {person.favoriteIceCream}</p>

        <p>i was born in {person.country} and i listed to {person.song}</p>

        <hr/>

        <p>About me : {person.aboutMe}</p>

        <h1>Chosen gender : {person.gender}</h1>

        <h2> Status = Hunger : {person.isHungry ? "Yes" : "NO"}</h2>
        <h2> Status = Hunger : {person.isThirsty ? "Yes" : "NO"}</h2>

        
      </div>


    </div>
  );
}

export default App;

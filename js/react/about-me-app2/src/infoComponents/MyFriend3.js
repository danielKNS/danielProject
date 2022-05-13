import React from "react";

const MyFriend3 = (props) =>{
const friends = props.friend

    return (
    <div>
        <div>
         my friend name : {friends.name}

        </div>

         <div>
        my friend age : {friends.age}
        </div>

        <div>
        My friend favoriteColour : {friends.favoriteColor}
        </div>
    </div>
    )
}

export default MyFriend3
 
// // Destructuring 
// const person = {
//     name:"lolo",
//     age: 23,
//     favoriteColour:"red"
// }

// const name2 = person.name
// console.log("name2 ", name2)

// const {name, age,favoriteColour} = person
// console.log("name ", name)
// console.log("age ", age)
// console.log("favoriteColour ", favoriteColour)
import React from 'react'

 const Destructuring =(props) =>{
     const friend = props.friend

     return (
         <div>
             <hr/>
             <h2>{friend.name}</h2>
             <p> Age : {friend.age}</p>
             <p>FavoriteColor : {friend.favoriteColor}</p>
             <p>Favorite Sport : {friend.favoriteSport}</p>
         </div>
     )

}
export default Destructuring;



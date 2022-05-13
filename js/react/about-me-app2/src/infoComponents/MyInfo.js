import React,{useState} from "react";


const MyInfo = () => {
  const initalPerson = {
    firstName:"Daniel",
    LastName:"Ribeiro",
    Age:"20",
    favoriteColour:"Black",
    country:"USA",
    song:"Animal",
    aboutMe:"",
    favoriteIceCream:"Chocolate"

  }

  const [person, setPerson] = useState(initalPerson)


  const handleSubmit = (e) => {
    e.preventDefault()
    console.log("i am being submited by the event:", e)
    const typedaboutMe = e.target.elements.aboutMe.value
    
    setPerson({
      aboutMe:typedaboutMe,
    })
  } 

    return(
        <div>
        <div className = "Intro1"> 
        <img width={50} height={50}  src ="MyProfile.jpeg"></img> Brian
        </div>
        <div className = "Intro"> 
         <img width={170} height={170}  src ="MyProfile.jpeg"></img>
         <p>DogLover: this is my dog jonny </p> 
         <form onSubmit={handleSubmit}>
         <textarea name ="aboutMe"></textarea>
         <button>Send</button>
         </form>
         <label> puppy: {person.aboutMe}</label>
         <div> Manbro: wow his cute </div>
         <div> wonderBoy: woooooow his so a good doggo</div>
        </div>
        </div>
        
        
    );
}
export default MyInfo;
import React, { useState } from "react"
// show that tied,show which one win or loses, and have the three option
const ImageGame = () => {

    const [headMessage, SetHeadMessage ] = useState("")
    const [messageColor , SetMessageColor] = useState("blue")

    const handleGameClick = (Hand) =>{ 
        const randomNumber = Math.floor(Math.random() * 3)
        console.log("randomNumber",randomNumber)
        const result = randomNumber === 1 ? "Rock" : "Paper" 
        console.log("result", result)
        console.log("Hand : ",Hand)
        if (Hand === result){
            SetMessageColor("green")
            SetHeadMessage(`YOU choose, ${Hand} , CPU picked ${result}, YOU WON!!`)
        }else {
            SetMessageColor("red")
            SetHeadMessage(`YOU choose, ${Hand} , CPU picked ${result}, LOST!!`) 
        }
    //     if (headMessage === "Rock") {
    //         if (result === "Rock") {
    //         SetMessageColor (`YOU choose, ${Hand} , CPU picked ${result}, TIE!!`)
    //         } else if (result === "Paper") {
    //         SetMessageColor (`YOU choose, ${Hand} , CPU picked ${result}, YOU LOST!!`)
    //         } else if (result === "Scissors") {
    //          SetMessageColor (`YOU choose, ${Hand} , CPU picked ${result}, YOU WON!!`)
    //     } 
    // }
    }


    return(
        <div className="intro">
            <h1 style={{color:"yellow"}}> Let the game BEGIN!!</h1>
            <h2 style={{color:"purple"}}> Rock Paper or Scissor :</h2>
            <h3 style={{color:"red"}}> Choose wisely my friend!</h3>
            <div>
                <button onClick={(Hand) => handleGameClick("Rock")}>
                    <img width={100} height={150} alt= "ImageGame" src ="ImageRock.webp"></img> 
                </button>
                <button onClick={(Hand) => handleGameClick("Paper")}> 
                    <img width={100} height={150} alt= "ImageGame" src ="imagePaper.webp"></img> 
                </button>
                <button onClick={(Hand) => handleGameClick("Scissor")}> 
                    <img width={100} height={150} alt= "ImageGame" src ="ImageScissor.webp"></img> 
                </button>
            </div>
            <div>
                <p style= {{color: "blue"}}>The results :</p>
                {/* <h2 style={{color: "green"}}>{headMessage} </h2> */}
                <p style={{
                    display:"flex",
                    justifyContent: "left",
                    color: messageColor,
                }}>
                    {headMessage}
                </p>
            </div>
        </div>
        
    );
}





export default ImageGame;
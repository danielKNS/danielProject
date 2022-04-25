import React, { useEffect, useState } from "react";

const Practice = () => {

    const [userChoice, setUserChoise] = useState("")
    const [computerChoice, setComputerChoise] = useState("")
    const [result, setResult] = useState("")
    const choices = ["Rock", "Paper", "Scissors"]


    const handleClick = (value) => {
        setUserChoise(value)
        computerChoices() 
    }

    const computerChoices = () => {
        const randomChoice = choices[Math.floor(Math.random() * choices.length)]
        setComputerChoise(randomChoice)

    }

    useEffect(() => {
    {
        switch(userChoice + computerChoice){
            case "ScissorsPaper":
            case "RockScissors":
            case "PaperRock":
                setResult("YOU WON")
                break
            case "PaperScissors":
            case "ScissorsRock":
            case "RockPaper":
                setResult("YOU LOST")
                break
            case "RockRock":
            case "PaperPaper":
            case "ScissorsScissors":
                setResult("TIE")
                break
        }
    }
    },[computerChoice,userChoice])



    return (
        <div>
            <h1 style = {{backgroundColor: "black", display: "grid" }}>hehe</h1>
            <h1>Practice :</h1>
            <h2> user choice is : {userChoice}</h2>
            <h2> computer choice :{computerChoice}</h2>
            {choices.map((choice, index) => <button  key={index} onClick={() => handleClick(choice)}>  {choice}  </button>)}

            <h2>{result}</h2>
        </div> 
    )

}

export default Practice
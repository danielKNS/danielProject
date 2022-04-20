import React from 'react'
// import React, {useState} from 'react'
// import React, { BoilingVerdict } from 'react'
import TemperatureInput from './TemperatureInput';
import './App.css';

// const  Calculator = () => {

// const BoilingVerdict =(props) =>{
// if (props.celsius >= 100) {
//   return <p> Water would boil</p>;
// }
//   return<p> Water would NOT boil </p>;
// }

// const handleChange =(e) => {
//   this.setState({temperature: e.target.value});
//   handleChange = handleChange.bind();
// }

// const  state =() => {
// state = {temperature: ""}
// }

// const temperature = state.temperature;

//   return (
//     <fieldset>
//       <legend> Enter temperature in Celsius:</legend>
//       <input 
//       value = {temperature}
//       onChange = {handleChange}/>
//       <BoilingVerdict
//       celsius = {parseFloat(temperature)}/>
//     </fieldset>
//   );
// }
 




const Calculator1 = () => {

  // const [temperature, setTemperature] = useState(0)// initial value/state of your variable
  // console.log("temperature",temperature)

  // const handleChange = (e) => {
  //   setTemperature(e.target.value)
  // }

  return (
    // <fieldset>
    //   <legend>Enter temperature in Celsius:</legend>
    //   <input
    //     value={temperature}
    //     onChange={handleChange} />
    //   <BoilingVerdict
    //     celsius={parseFloat(temperature)} 
    //     />
    // </fieldset>
    <div>
        <TemperatureInput scale="c" />
        <TemperatureInput scale="f" />
      </div>
    
  );
}
export default Calculator1
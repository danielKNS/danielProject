import React from 'react';

// const MyAwesomeFirstComponent = () => <div><p>How you doin... </p></div>
// const MyAwesomeFirstComponent = (props) => <div><p>How you doin... {props.name} </p></div>
// const MyAwesomeFirstComponent = () => (
//     <div>
//       <SuperPeople name="Thanos" />
//       <SuperPeople name="Iron Man" />
//       <SuperPeople name="Dr Strange" />
//     </div>
//   )

export default MyAwesomeFirstComponent;

import SuperPeople from './SuperPeople.js';

const superPeople = [
    {
      name: 'Thanos',
      power: 'The Snap!'
    },
    {
      name: 'Iron Man',
      power: 'Intelligence x 3000'
    },
    {
      name: 'Dr Strange',
      power: 'the Time Stone'
    }
  ];
  const restaurants = ['Cosmic Stones Wings', 'BK', 'Rye of Agamotto']
  
  
  const MyAwesomeFirstComponent = () => (
    <div>
      <SuperPeople
        superPeople={superPeople}
        restaurants={restaurants}
      />
    </div>
  )

import SuperPeople from './SuperPeople.js'
import Restaurants from './Restaurants.js'

const MainComponent = (props) => (
  <div>
    <SuperPeople
      superPeople={superPeople}
    />
    <Restaurants
      restaurants={restaurants}
    />
  </div>
)
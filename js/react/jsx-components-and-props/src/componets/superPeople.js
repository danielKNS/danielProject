// const SuperPeople = (props) => (
//     <div><p>How you doin... {props.name} </p></div>
// )
const SuperPeople = (props) => {
    const listItems = props.superPeople.map((person) => (
      <p key={person.name}>{person.name} has {person.power}</p>)
    );
    return (
      <div>
        <h3>Super people</h3>
        {listItems}
        <h3> Best Restaurants </h3>
        {props.restaurants.map(restaurant => <p key={restaurant}>{restaurant}</p>)}
      </div>
    );
  }

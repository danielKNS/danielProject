class Square extends React.Componet {
    render(){
        return (
            <button className ="square">
                {this.props.value}
            </button>
        );
    }
}


class Board extends React.Componet {
    renderSquare(i){
        return <Square value={i} />;
    }
}


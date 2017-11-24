class MyComponent extends React.Component {
    constructor(props) {
        super(props);
            this.state = {
            score: 0
        };
    }

    increment() {
        this.setState({
            score: this.state.score+1
        });
    }

    render() {
        return (
        React.createElement("div", null, 
            React.createElement("h3", null, "Current score: ", this.state.score, "."), 
            React.createElement("button", {onClick: this.increment.bind(this)}, "Increment")
        )
        );
    }
}

React.render(
    React.createElement(MyComponent, null),
    document.getElementById('content')
);
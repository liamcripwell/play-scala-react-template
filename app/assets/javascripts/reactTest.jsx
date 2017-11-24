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
        <div>
            <h3>Current score: {this.state.score}.</h3>
            <button onClick={this.increment.bind(this)}>Increment</button>
        </div>
        );
    }
}

React.render(
    <MyComponent />,
    document.getElementById('content')
);
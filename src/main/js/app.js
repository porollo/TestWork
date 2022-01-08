class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {articles: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/articles'}).done(response => {
            this.setState({articles: response.entity._embedded.articles});
        });
    }

    render() { (3)
        return (
            <ArticleList articles={this.state.articles}/>
        )
    }
}
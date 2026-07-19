import React, { Component } from 'react';

export class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            error: null
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Failed to fetch posts');
                }
                return response.json();
            })
            .then(data => {
                this.setState({ posts: data });
            })
            .catch(error => {
                this.setState({ error: error.message });
                alert('Error loading posts: ' + error.message);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        this.setState({ error: error.toString() });
        alert('Component Error: ' + error.toString());
    }

    render() {
        if (this.state.error) {
            return (
                <div style={{ color: 'red', padding: '20px' }}>
                    <h2>An error occurred: {this.state.error}</h2>
                </div>
            );
        }

        return (
            <div style={{ padding: '20px' }}>
                <h1 style={{ color: 'DarkBlue' }}>Blog Posts</h1>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ borderBottom: '1px solid #ccc', padding: '10px 0' }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

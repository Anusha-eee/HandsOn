import React, { Component } from 'react';

class FlightDetails extends Component {
    render() {
        const flights = [
            { id: 'AI-101', from: 'Chennai', to: 'Mumbai', departure: '10:00 AM' },
            { id: '6E-202', from: 'Bangalore', to: 'Delhi', departure: '02:30 PM' },
            { id: 'SG-303', from: 'Hyderabad', to: 'Kolkata', departure: '06:15 PM' }
        ];

        return (
            <div style={{ marginTop: '20px' }}>
                <h3>Flight Schedule (View Only)</h3>
                <table border="1" cellPadding="5" style={{ width: '100%', borderCollapse: 'collapse' }}>
                    <thead>
                        <tr style={{ backgroundColor: '#f2f2f2' }}>
                            <th>Flight ID</th>
                            <th>From</th>
                            <th>To</th>
                            <th>Departure</th>
                        </tr>
                    </thead>
                    <tbody>
                        {flights.map(f => (
                            <tr key={f.id}>
                                <td>{f.id}</td>
                                <td>{f.from}</td>
                                <td>{f.to}</td>
                                <td>{f.departure}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

class BookingForm extends Component {
    handleSubmit = (e) => {
        e.preventDefault();
        alert('Ticket successfully booked!');
    }

    render() {
        return (
            <div style={{ marginTop: '20px', border: '1px solid #ccc', padding: '15px', borderRadius: '5px' }}>
                <h3>Book Your Flight</h3>
                <form onSubmit={this.handleSubmit}>
                    <div style={{ marginBottom: '10px' }}>
                        <label>Flight ID: </label>
                        <select required style={{ marginLeft: '10px' }}>
                            <option value="AI-101">AI-101 (Chennai to Mumbai)</option>
                            <option value="6E-202">6E-202 (Bangalore to Delhi)</option>
                            <option value="SG-303">SG-303 (Hyderabad to Kolkata)</option>
                        </select>
                    </div>
                    <div style={{ marginBottom: '10px' }}>
                        <label>Passenger Name: </label>
                        <input type="text" placeholder="Enter name" required style={{ marginLeft: '10px' }} />
                    </div>
                    <button type="submit" style={{ backgroundColor: '#4CAF50', color: 'white', border: 'none', padding: '5px 10px', cursor: 'pointer' }}>Book Now</button>
                </form>
            </div>
        );
    }
}

export class TicketBooking extends Component {
    constructor(props) {
        super(props);
        this.state = {
            isLoggedIn: false
        };
    }

    handleLogin = () => {
        this.setState({ isLoggedIn: true });
    }

    handleLogout = () => {
        this.setState({ isLoggedIn: false });
    }

    render() {
        return (
            <div style={{ padding: '20px', maxWidth: '600px', margin: 'auto' }}>
                <h1 style={{ color: 'DarkCyan' }}>Ticket Booking Portal</h1>
                <div style={{ textAlign: 'right', marginBottom: '15px' }}>
                    {this.state.isLoggedIn ? (
                        <div>
                            <span>Welcome, User! </span>
                            <button onClick={this.handleLogout} style={{ padding: '5px 10px', cursor: 'pointer', marginLeft: '10px' }}>Logout</button>
                        </div>
                    ) : (
                        <div>
                            <span>Please log in to book tickets. </span>
                            <button onClick={this.handleLogin} style={{ padding: '5px 10px', cursor: 'pointer', backgroundColor: '#008CBA', color: 'white', border: 'none', marginLeft: '10px' }}>Login</button>
                        </div>
                    )}
                </div>

                <FlightDetails />

                {this.state.isLoggedIn ? (
                    <BookingForm />
                ) : (
                    <div style={{ marginTop: '20px', padding: '15px', backgroundColor: '#ffe6e6', color: '#cc0000', borderRadius: '5px' }}>
                        <strong>Notice:</strong> You must be logged in to book flights.
                    </div>
                )}
            </div>
        );
    }
}

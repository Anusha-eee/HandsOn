import React, { Component } from 'react';

export class OfficeSpace extends Component {
    render() {
        const src = "https://images.unsplash.com/photo-1604328698692-f76ea9498e76?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80";
        const element = "Office Space";
        const jsxatt = <img src={src} width="25%" height="25%" alt="Office Space"/>;
        
        const offices = [
            { Name: "DBS", Rent: 80000, Address: "Chennai" },
            { Name: "Commons", Rent: 45000, Address: "Bangalore" },
            { Name: "Workafella", Rent: 55000, Address: "Hyderabad" },
            { Name: "Regus", Rent: 90000, Address: "Mumbai" }
        ];

        return (
            <div style={{ padding: '20px' }}>
                <h1>{element}, at Affordable Range</h1>
                {jsxatt}
                <h2>Office Spaces Available:</h2>
                {offices.map((office, index) => {
                    const color = office.Rent <= 60000 ? "red" : "green";
                    return (
                        <div key={index} style={{ borderBottom: '1px solid #ddd', padding: '10px 0' }}>
                            <h3>Name: {office.Name}</h3>
                            <h4 style={{ color: color }}>Rent: Rs. {office.Rent}</h4>
                            <h4>Address: {office.Address}</h4>
                        </div>
                    );
                })}
            </div>
        );
    }
}
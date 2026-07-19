import React from 'react';
import styles from './CohortDetails.module.css';

export function CohortDetails() {
    const cohorts = [
        { id: 1, name: 'React Development', start: '10-Jul-2026', end: '15-Aug-2026', status: 'ongoing' },
        { id: 2, name: 'Spring Boot Microservices', start: '01-Jun-2026', end: '30-Jun-2026', status: 'completed' },
        { id: 3, name: 'Angular Core Concepts', start: '20-Jul-2026', end: '25-Aug-2026', status: 'ongoing' }
    ];

    return (
        <div style={{ padding: '20px' }}>
            <h2>Academy Cohorts Dashboard</h2>
            {cohorts.map(c => (
                <div key={c.id} className={styles.box}>
                    <h3 style={{ color: c.status === 'ongoing' ? 'green' : 'blue' }}>
                        {c.name}
                    </h3>
                    <dl>
                        <dt>Start Date:</dt>
                        <dd>{c.start}</dd>
                        <dt>End Date:</dt>
                        <dd>{c.end}</dd>
                        <dt>Status:</dt>
                        <dd>{c.status}</dd>
                    </dl>
                </div>
            ))}
        </div>
    );
}

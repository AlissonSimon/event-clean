-- V1__CREATE_TABLE_EVENT.sql
CREATE TABLE tb_events (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    identifier VARCHAR(255) NOT NULL UNIQUE,
    location VARCHAR(255) NOT NULL,
    organizer VARCHAR(255) NOT NULL,
    capacity INTEGER NOT NULL,
    type VARCHAR(50) NOT NULL,
    started_at TIMESTAMP NOT NULL,
    finished_at TIMESTAMP NOT NULL
);

-- Создание таблицы users
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       guid UUID UNIQUE NOT NULL DEFAULT gen_random_uuid(),
                       full_name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       phone VARCHAR(20),
                       user_type ENUM('student', 'employee') NOT NULL,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
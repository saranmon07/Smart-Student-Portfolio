
CREATE DATABASE IF NOT EXISTS smart_portfolio;
USE smart_portfolio;

CREATE TABLE IF NOT EXISTS users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role ENUM('STUDENT', 'PLACEMENT_OFFICER', 'ADMINISTRATOR') NOT NULL
);

CREATE TABLE IF NOT EXISTS students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL UNIQUE,
    roll_no VARCHAR(30) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    semester INT,
    cgpa DECIMAL(4,2),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS placement_officers (
    officer_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL UNIQUE,
    department VARCHAR(100),
    contact_no VARCHAR(20),
    officer_email VARCHAR(150),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS administrators (
    admin_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL UNIQUE,
    admin_name VARCHAR(100) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS profiles (
    profile_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT NOT NULL UNIQUE,
    phone VARCHAR(20),
    address VARCHAR(255),
    dob DATE,
    linkedin_url VARCHAR(255),
    github_url VARCHAR(255),
    FOREIGN KEY (student_id) REFERENCES students(student_id)
);

CREATE TABLE IF NOT EXISTS skills (
    skill_id INT PRIMARY KEY AUTO_INCREMENT,
    skill_name VARCHAR(100) NOT NULL,
    category VARCHAR(100),
    level VARCHAR(50),
    experience DECIMAL(4,1)
);

CREATE TABLE IF NOT EXISTS student_skills (
    student_id INT NOT NULL,
    skill_id INT NOT NULL,
    PRIMARY KEY (student_id, skill_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (skill_id) REFERENCES skills(skill_id)
);

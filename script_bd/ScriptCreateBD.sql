-- Base de datos

DROP DATABASE IF EXISTS bdbank;
CREATE DATABASE IF NOT EXISTS bdbank;
USE bdbank;

-- Tabla de Clientes
CREATE TABLE IF NOT EXISTS Customers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,    
    dni VARCHAR(20) NOT NULL UNIQUE, 
    name VARCHAR(100) NOT NULL,                      
    last_name VARCHAR(100) NOT NULL,                         
    email VARCHAR(100) NOT NULL
);

-- Tabla de Cuentas Bancarias
CREATE TABLE IF NOT EXISTS BankAccounts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,  
    id_customer BIGINT NOT NULL,
    account_number VARCHAR(20) NOT NULL UNIQUE,        
    balance DOUBLE NOT NULL DEFAULT 0.0,                
    account_type ENUM('AHORROS', 'CORRIENTE') NOT NULL,
    FOREIGN KEY (id_customer) REFERENCES Customers(id) ON DELETE CASCADE
);




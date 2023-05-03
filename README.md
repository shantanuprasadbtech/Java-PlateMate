# Restaurant Management System

This repository contains the source code for a Java-based restaurant management system, developed as part of the PlateMate project. It is designed to provide a comprehensive solution to manage a restaurant's daily operations from taking orders to managing the inventory.

## Repository Structure

Here is a basic overview of the project's structure:


```Java-PlateMate
│
└───src
│   └───main
│       └───java
│           └───edu
│               └───symbi
│                   └───aiml2021
│                       └───platemate
│                           │   Main.java
│                           │   ... (other java files)
│
└───.gitignore
└───README.md


The `src/main/java` directory contains the main source code for the project. Within it, the `edu/symbi/aiml2021/platemate` directory houses the specific implementation of the restaurant management system.

## Features

### Order Management

This system enables the restaurant staff to efficiently take orders from customers and manage them effectively. It ensures seamless communication between the kitchen and the service staff to deliver a smooth dining experience.

### User-friendly Interface

The application has a user-friendly interface that allows employees to quickly understand and adapt to the system, minimizing the training period.

## Getting Started

To get started with the project:

1. *Clone the Repository* 

    On your local machine, open the terminal in the directory where you want to clone the repository and run the following command:

    
    git clone https://github.com/shantanuprasadbtech/Java-PlateMate.git
    

2. *Open the Project*

    Open the cloned repository in your preferred Java IDE (like IntelliJ IDEA, Eclipse, etc).

3. *Build the Project*

    Build the project using your IDE's build functionality. This will compile the Java files.

4. *Run the Application*

    To run the application, navigate to the `Main.java` file in the `edu/symbi/aiml2021/platemate` directory and run it directly from your IDE.

## Contributing

We welcome contributions of all kinds from the open-source community. Whether you want to fix bugs, add new features, propose changes, or improve the documentation, your contributions are appreciated!

Before you start, please read our [Code of Conduct](#). We expect all our contributors to respect these guidelines.

To contribute:

1. Fork the repository
2. Create a new branch for your feature or bug fix
3. Commit your changes
4. Push to your branch
5. Create a pull request against the master branch

Please note that your code should follow the existing style to make the review process faster.

## PLATEMATE
# RESTAURANT MANAGEMENT SYSTEM IN JAVA

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## database preparartion
-install mysql
-in mysql terminal
>create user 'restaurant'@'%' identified by 'restaurant';
- GRANT INSERT ON *.* TO 'restaurant'@'%';
- mysql -u restaurant -p
#Type password as 'restaurant'
- create a database named `platemate`
>create database platemate;

>use platemate; 

>create table menucard (id int primary key auto_increment, name varchar(20),  price numeric, description varchar(100), status boolean);

- insert items with  following commands
> insert into menucard (name, price, description, status) values ('Veg Biryani', 200, 'Gourmet Veg Biryani ', true);

> insert into menucard (name, price, description, status) values ('Veg Paneer Biryani', 200, 'Gourmet Biryani with Cotton Cheese', true);

> insert into menucard (name, price, description, status) values ('Pav Bhaji', 200, 'Spiced Vegetable curry with buttery bread roll', true);

> insert into menucard (name, price, description, status) values ('Veg Pulao', 200, 'One pot rice Dish infused with fragrant spices. ', true);

> insert into menucard (name, price, description, status) values ('Veg Fried Rice', 200, 'lightly spice rice served with vibrant array of sauteed veggies', true);

## Maven commands
- mvn clean install
- mvn spring-boot:run

## Swagger
- http://localhost:8080/swagger-ui.html

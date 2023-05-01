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

# Java Fundamentals Assessment

## Getting Started
    
- clone this repo to your projects directory
- open it in your editor
- follow the directions specifically.
- create a branch called your firstname-lastname.
- write code
- run tests
- commit your work and push it to a branch called firstname-lastname where firstname is your first name and lastname is your last name.

## Problems

Write methods with the following names and behavior

- Create a class named `Assessment` inside of the `src/main/java` folder. Add the following methods:
    - Write a static method called square(param1) accepts an integer as input and returns that number times itself.  
    - Write a static method sum(param1, param2) method that works with both integers and doubles (use method overloading) and returns the result.
    - Write a static method called average(arrayOfIntegers) that takes in an array of integers and returns the average as a double.
    - You may write a `main` method on this class in order to run code that tests the above methods.
 
- Create a class named `Person` inside of `src/main/java`.
   - Add firstName and lastName as protected properties.
   - Add a constructor method that takes in two strings that are firstName and lastName.
   - The firstName and lastName properties cannot be null.
   - If the firstName or lastName inputs are null, be sure to throw an IllegalArgumentException inside of the constructor.
   - Write a getter and setter for the firstName property as well as a getter and setter for lastName.
    
- Create a class called `User` that inherits from `Person`.
    - Add a protected property called `isAdmin` that is a boolean.
    - Write the constructor on `User` so that it extends from `Person` and accepts a 3rd parameter, a boolean of whether or not that user is an administrator.
    - Write a method on the `User` class called `isAdmin()` that returns a boolean if the contact is an administrator.

- Create an interface called `Greeter`. 
    - Greeter interface should specify a method called `sayHello()`.
    - Go to your `Person` class and ensure that it implements the `Greeter` interface.
    - The implementation of `sayHello()` method on Person class should produce "Hello from `firstName`  `lastName`" using the class properties to display the assigned values.
     
- On your `Assessment` class create a method called `capitalizeRecords`.
    - The method takes in an ArrayList of  User objects. The `capitalizeRecords` method should check to make sure that each Object's firstName and lastName property are capitalized. If they are not, use the setter to capitalize the first letter of each firstName and lastName and the method should return a copy of the arrayList.

## Testing
Soon...
## Grading
Soon...
## License
Soon...
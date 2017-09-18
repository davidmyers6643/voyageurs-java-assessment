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

- Create a class named `Main` inside of the `src/main/java` folder. Add the following methods:
    - Create a static method called isNegative() that takes in an object of any data type and returns a boolean whether or not the value is true or false. 
    - Write a static method called square(integer) accepts an integer as input and returns that number times itself.  
    - Write a static method sum() method that works with both integers and doubles (method overloading)
    - Write a static method called average(arrayOfIntegers) that takes in an array of integers and returns the average.
    - You may write a `main` method on this class in order to run code that tests the above methods.
 
- Create a class named `Person` inside of `src/main/java`.
   - add firstName and lastName as protected properties.
   - add a constructor method that takes in two strings that are firstName and lastName.
   
- Create a class called `User` that inherits from `Person`.
    - add a protected property called `isAdmin` that is a boolean.
    - Write the constructor on `User` so that it extends from `Contact` and accepts a 3rd parameter, a boolean of whether or not that user is an administrator.
    - Write a getter and setter for the firstName property as well as a getter and setter for lastName
    - Write a method on the `User` class called `isAdmin()` that returns a boolean if the contact is an administrator.

- Create an interface called `Greeter`. 
    - Greeter interface should specify a method called `sayHello()`.
    - Go to your `Person` class and ensure that it implements the `Greeter` interface.
    - The implementation of `sayHello()` method on Person class should produce "Hello from " + firstName + " " + lastName.
     
- On your `Main` class, add a method called `capitalizeRecords` that takes in an ArrayList of Person objects or User objects.
- `capitalizeRecords` should check to make sure that each Object's firstName and lastName property are capitalized. If they are not, use the setter to capitalize the first letter of each firstName and lastName. 

// we need another problem for HashMaps.

## Testing
 
## Grading

## License
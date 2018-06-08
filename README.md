# Java Fundamentals Assessment

## Setup

1. Clone this repo to your `IdeaProjects` directory
1. Open the directory in IntelliJ
1. Configure IntelliJ
   - Mark the `src` directory as the sources root (right click on `src` -> "Mark
     Directory as...")
   - Configure the project sdk (File -> Project Structure), Choose 1.8 or 9
1. Create a branch named `firstname-lastname` with your first and last names
1. Write your code and commit on your branch, but don't push your branch until
   the assessment is over
1. When the assessment is over, push your branch to GitHub. Verify that your
   branch is present on GitHub.

## Problems

1. Create a class named `Assessment` inside of the `src` directory.

    - Write a public static method named `square` that accepts an integer as
      input and returns that number times itself.
    - Write a public static method named `sum` that accepts two arguments and
      that works with both integers and doubles (use method overloading) and
      returns the result of adding the two passed numbers.
    - Write a public static method named `average` that takes in an array of integers
      (not a `List`, an array) and returns the average as a double.

1. Create a class named `Person` inside of `src`.

   - The class should define two instance properties of type `String` named
     `firstName`, and `lastName`. These properties should not be accessible
     outside of the `Person` class.
   - Add a constructor method that takes in two strings and sets the `firstName`
     and `lastName` properties based on the passed arguments.
   - If either of the passed `firstName` or `lastName` arguments are `null`, the
     constructor should throw an `IllegalArgumentException`.
   - Write a getter and setter for the `firstName` property as well as a getter
     and setter for `lastName`.

1. Create a class named `User` that inherits from `Person`.

    - Add a protected instance property named `admin` that is a boolean.
    - Write a constructor on the `User` class that accepts 3 parameters, the
      first name and last name of the user, as well as a boolean value
      indicating whether or not that user is an administrator.
    - Write an instance method on the `User` class named `isAdmin` that accpets
      no arguments and returns a boolean if the contact is an administrator,
      based on the `admin` property.

1. Create an interface named `Greeter`.

    - The Greeter interface should specify an instance method named `sayHello`
      that accepts no arguments and returns a String.
	- Change your `Person` class so that it implements the `Greeter` interface.
    - The implementation of the `sayHello` method on Person class should return
      the message "Hello from `firstName` `lastName`" using the instance
      properties to display the assigned values.

1. On your `Assessment` class create a static method named `capitalizeRecords`.

    This method should:

    - Take in an List of User objects
    - Check to make sure that each User's firstName and lastName property are
      capitalized
    - If they are not, use the setter to capitalize the first letter of each
      firstName and lastName.
    - The method should return a list of User objects where each user object's
      firstName and lastName properties are capitalized.

## Grading

A Total of 5 Points are available. One point will be awarded per problem if the
provided solution fulfills all of the specifications for the problem.

**If a class does not compile, no points can be awarded for it.** It would be
wise to spend the last ~15 minutes of the assessment ensuring that your code is
error-free.

## Testing your Code

You can (and are encouraged to) write a `main` method on any or all of your
classes to test the code that you have written. The presence or absence of a
`main` method will not affect your grade.

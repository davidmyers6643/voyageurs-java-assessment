import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by moon on 9/26/17.
 */
public class MainTest {

    @Test
    public void it_squares_10() throws Exception {
        int expected = 100;
        int actual = Main.square(10);
        assertEquals("Expected the square method to return " + expected, expected, actual);
    }

    @Test
    public void it_squares_negative_integer() throws Exception {
        int input = -5;
        int expected = 25;

        int actual = Main.square(input);

        assertEquals("Expected the square method to return " + expected, expected, actual);
    }

    @Test
    public void it_squares_random_integer() throws Exception {
        // arrange
        int randomInt = (int) Math.floor(Math.random() * 100);
        int expected = randomInt * randomInt;

        // act
        int actual = Main.square(randomInt);

        // assert (message, expected, actual)
        assertEquals("Expected the square method to return " + expected + " when passed " + randomInt, expected, actual);
    }

    @Test
    public void sum_adds_two_random_integers() throws Exception {
        int firstRandomInteger = (int) Math.floor(Math.random() * 100);
        int secondRandomInteger = (int) Math.floor(Math.random() * -100);
        int expected = firstRandomInteger + secondRandomInteger;

        // act
        int actual = Main.sum(firstRandomInteger, secondRandomInteger);

        // assert
        assertEquals("Expected the sum method to return " + expected, expected, actual);
    }

    @Test
    public void sum_adds_two_and_three() throws Exception {
        int expected = 5;
        int actual = Main.sum(2, 3);

        assertEquals("Expected the sum method to return 5 when passed 2 and 3", expected, actual);
    }

    @Test
    public void sum_adds_two_random_doubles() throws Exception {
        // arrange
        double firstRandomDouble = Math.floor(Math.random() * 100);
        double secondRandomDouble = Math.floor(Math.random() * 100);
        double expected = firstRandomDouble + secondRandomDouble;
        // act
        double actual = Main.sum(firstRandomDouble, secondRandomDouble);

        // assert
        assertEquals(
                "Expected the sum method to return the double " + expected + " when passed the doubles " + firstRandomDouble + " and " + secondRandomDouble,
                expected, actual, 0.1);
    }

    @Test
    public void sum_returns_zero_when_passed_two_zeros() throws Exception {
        int actual = Main.sum(0, 0);
        assertEquals("Expected the sum method to return 0 when passed 0 and 0 as arguments", 0, actual );
    }

    @Test
    public void sum_adds_two_doubles() throws Exception {
        // arrange
        double first = 0.1;
        double second = 0.2;
        double expected = 0.3;

        // act
        double actual = Main.sum(first, second);

        // assert
        assertEquals("Expected sum method to return " + expected + " when passed .1 and .2", expected, actual, 0.1);
    }

    @Test
    public void average_returns_0_for_empty_array() throws Exception {
        // arrange
        double expected = 0;
        double[] inputArray = {};

        // act
        double actual = Main.average(inputArray);

        // assert
        assertEquals("Expected average method to return 0 when passed an empty array", expected, actual, 0.1);
    }

    @Test
    public void average_returns_value_when_array_has_one_element() throws Exception {
        int randomInt = (int) Math.floor(Math.random() * 100);
        double[] inputArray = {randomInt};
        double expected = randomInt;

        // act
        double actual = Main.average(inputArray);

        // assert
        assertEquals("Expected average method to return the value when passed an array of one value", expected, actual, 0.1);
    }

    @Test
    public void average_returns_0_when_passed_array_of_zeros() throws Exception {
        // arrange
        double expected = 0;
        double[] inputArray = {0, 0, 0};

        // act
        double actual = Main.average(inputArray);

        // assert
        assertEquals("Expected average method to return 0 when passed an array containing only zeros", expected, actual, 0.1);
    }

    @Test
    public void average_returns_the_mean_when_passed_array_of_numbers() throws Exception {
         double[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         double expected = 5.5;

         double actual = Main.average(inputArray);

         assertEquals("Expected average method to return 5.5 when passed the array of integers 1 through 10", expected, actual, 0.1);
    }
}

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by moon on 9/26/17.
 */
public class MainCapitalizationTest {
    @Test
    public void it_returns_empty_array_list_when_passed_an_empty_array_list() throws Exception {
        ArrayList<Person> expected = new ArrayList<>();

        ArrayList<Person> actual = Main.capitalizeRecords(new ArrayList<>());

        assertEquals("Expected capitalizeRecords method on Main class to return an empty ArrayList when passed an EmptyArrayList", expected, actual);
    }

    @Test
    public void it_returns_the_same_array_list_when_properties_already_capitalized_() throws Exception {
        Person inputPerson = new Person("Mickey", "Mouse");
        Person outputPerson = new Person("Mickey", "Mouse");

        ArrayList<Person> inputList = new ArrayList<>();
        inputList.add(inputPerson);

        ArrayList<Person> expectedList = new ArrayList<>();
        expectedList.add(outputPerson);

        // act
        ArrayList<Person> actualList = Main.capitalizeRecords(inputList);

        // assert
        assertEquals("Expected capitalizeRecords method to return an arrayList with a Person object's firstName and lastName property capitalized.", expectedList, actualList);
    }

    @Test
    public void it_returns_array_list_with_capitalized_first_and_last_names() throws Exception {
        // arrange
        Person inputPerson = new Person("mickey", "mouse");
        Person outputPerson = new Person("Mickey", "Mouse");

        Person inputPerson = new Person("Mickey", "Mouse");
        inputList.add(inputPerson);

        ArrayList<Person> expectedList = new ArrayList<>();
        expectedList.add(outputPerson);

        // act
        ArrayList<Person> actualList = Main.capitalizeRecords(inputList);

        // assert
        assertEquals("Expected capitalizeRecords method to return an arrayList with a Person object's firstName and lastName property capitalized.", expectedList, actualList);
    }

    @Test
    public void it_returns_array_list_with_capitalized_properties_for_users() throws Exception {
        // arrange inputs and expected outputs
        Person inputPerson = new Person("mickey", "mouse");
        Person outputPerson = new Person("Mickey", "Mouse");

        User inputUser = new User("zach", "zulde", true);
        User outputUser = new User("Zach", "Gulde", true);


        ArrayList<Person> inputList = new ArrayList<>();
        inputList.add(inputPerson);
        inputList.add(inputUser);

        ArrayList<Person> expectedList = new ArrayList<>();
        expectedList.add(outputPerson);
        expectedList.add(outputUser);

        // act
        ArrayList<Person> actualList = Main.capitalizeRecords(inputList);

        // assert
        assertEquals("Expected capitalizeRecoreds methods to capitalize first and last names on an array list of User and Person objects", expectedList, actualList);
    }
}

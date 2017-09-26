import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by moon on 9/26/17.
 */
public class PersonTest {

    private Person person;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        person = new Person("Luis", "Montealegre");
    }

    @Test
    public void it_gets_first_name() {
        // arrange
        String expected = "Luis";

        // act
        String actual = person.getFirstName();

        // assert
        assertEquals("Expected getFirstName to return the first name of the Person object", expected, actual);
    }

    @Test
    public void it_gets_last_name() throws Exception {
        String expected = "Montealegre";

        String actual = person.getLastName();

        assertEquals("Expected getLastName to return the last name of the Person object", expected, actual);
    }

    @Test
    public void it_throws_exception_when_passed_null() throws Exception {
        // Setup to use the Rule to listen for exceptions
        exception.expect(IllegalArgumentException.class);

        Person nullPerson = new Person(null, "Bob");


    }
}
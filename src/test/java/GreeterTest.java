import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by moon on 9/26/17.
 */
public class GreeterTest {

    @Test
    public void it_says_hello_to_person() throws Exception {

        // arrange
        Person person = new Person("Justin", "Reich");
        String expected = "Hello from Justin Reich";

        // act
        String actual = person.sayHello();

        // assert that sayHello returns a greeting from that person object
        assertEquals("Expected 'Hello from Justin Reich' when Person object is created with that firstName and lastName", expected, actual);
        assertTrue(person instanceof Greeter);
    }

}

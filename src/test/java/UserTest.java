import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by moon on 9/26/17.
 */
public class UserTest {

    protected User admin;
    protected User guest;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        admin = new User("Luis", "Montealegre", true);
        guest = new User("Ryan", "Orsinger", false);
    }

    @Test
    public void is_inherited_from_person_class() throws Exception {
        assertTrue(admin instanceof Person);
    }

    @Test
    public void it_gets_first_and_last_name() throws Exception {
        String expectedFirstName = "Luis";
        String expectedLastName = "Montealegre";

        // act
        String actualFirstName = admin.getFirstName();
        String actualLastName = admin.getLastName();

        // assert
        assertEquals("Expected getFirstName to return the User's first name property", expectedFirstName, actualFirstName);
        assertEquals("Expected getLastName to return the User's last name property", expectedLastName, actualLastName);
    }

    @Test
    public void it_throws_exception_when_passed_only_two_arguments() throws Exception {
        exception.expect(IllegalArgumentException.class);

        User newUser = new User(null, null, false);
    }

    @Test
    public void it_returns_true_when_admin() throws Exception {
        assertTrue(admin.isAdmin());
    }

    @Test
    public void it_returns_false_when_not_admin() throws Exception {
        assertFalse(guest.isAdmin());
    }
}
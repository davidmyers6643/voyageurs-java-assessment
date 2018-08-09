public class Person implements Greeter {

   public String lastName;
   public String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (firstName == null) {
            throw new IllegalArgumentException("IAE 'firstName null' thrown");
        }
        if (lastName == null) {
            throw new IllegalArgumentException("IAE 'lastName null' thrown");
        }


        }
    @Override
    public String sayHello() {
        return "hello " + firstName + " " + lastName;
    }
}

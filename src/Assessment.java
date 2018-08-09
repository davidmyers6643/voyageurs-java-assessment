import java.util.*;


public class Assessment {
    public static void main(String[] args) {


		Person dude = new Person("joe", "schmoe");
		System.out.println(dude.sayHello());
		System.out.println(square(7));
		System.out.println(sum(8, 4)); //int int
		System.out.println(sum(7.1, 1.1));// double double
		System.out.println(sum(6.3, 8)); // double int
		int[] numberList = {1, 2, 3, 4, 5};
		System.out.println(average(numberList));

    }


public static int square(int a) {
    return a * a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return ((double) sum) / array.length;
    }

    public static ArrayList<Person> capitalizeRecords(ArrayList<Person> users) {
        ArrayList<Person> usersCopy = new ArrayList<>();
        for (Person user : users) {
            usersCopy.add(new Person(user.getFirstName(), user.getLastName()));
        }
        for(Person user : usersCopy) {
            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String pattern = "[a-z].*";
            if (firstName.matches(pattern)) {
                firstName = capitalizeName(firstName);
                user.setFirstName(firstName);
            }
            if (lastName.matches(pattern)) {
                lastName = capitalizeName(lastName);
                user.setLastName(lastName);
            }
        }
        return usersCopy;
    }
    public static String capitalizeName(String nameToCapitalize) {
        return nameToCapitalize.toUpperCase().charAt(0) + nameToCapitalize.substring(1).toLowerCase();
    }

}

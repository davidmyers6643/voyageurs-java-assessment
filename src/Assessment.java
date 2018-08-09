import java.util.*;


public class Assessment {
    public static void main(String[] args) {


//        		Person person = new Person("Justin", "Reich");
//		System.out.println(person.sayHello());

//		Person person = new Person("Luis", "Montealegre");
//		System.out.println(person.getFirstName());
//		System.out.println(person.getLastName());
//		Person nullPerson = new Person(null, "Bob");
//		System.out.println(nullPerson);
//
//        Person inputPerson = new Person("Mickey", "Mouse");
//        ArrayList<Person> inputList = new ArrayList<>();
//        inputList.add(inputPerson);
////        Person outputPerson = new Person("Mickey", "Mouse");
//        ArrayList<Person> expectedList = new ArrayList<>();
//        ArrayList<Person> actualList = capitalizeRecords(inputList);
//        System.out.println(actualList);
//        System.out.println(expectedList);


		Person dude = new Person("joe", "schmoe");
		System.out.println(dude.sayHello());
		System.out.println(square(5));
		System.out.println(sum(5, 5)); //int int
		System.out.println(sum(6.0, 6.0));// double double
		System.out.println(sum(6.0, 2)); // double int
		int[] numberList = {1, 2, 3, 4, 5};
		System.out.println(average(numberList));

//		String[] peoples = {}
//		User dudette = new User("sammy", "sammerson", true);
//		User dudette1 = new User("sammy1", "sammerson1", true);
//		User dudette2 = new User("sammy2", "sammerson2", true);
//		User dudette3 = new User("sammy3", "sammerson3", true);
//		ArrayList<User> peoples = new ArrayList<>();
//		peoples.add(dudette);
//		peoples.add(dudette1);
//		peoples.add(dudette2);
//		peoples.add(dudette3);
//		System.out.println(capitalizeRecords(peoples));
//		ArrayList<User> newList = capitalizeRecords(peoples);
//		System.out.println(newList.toString());
//		System.out.println(dudette.firstName);
//		System.out.println(dudette.lastName);
//		System.out.println(dudette.admin);
//		System.out.println(capitalizeName(peoples.getFirstName() + " " + peoples.getLastName()));


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

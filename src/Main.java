public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(21, "Iustin", 195.2);
        Person person2 = new Person(30, "Tudor", 165.3);

        System.out.println("Person 1 Details:");
        person1.displayDetails();
        System.out.println();

        System.out.println("Person 2 Details:");
        person2.displayDetails();
    }
}

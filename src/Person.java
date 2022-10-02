public class Person {
    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void changePerson(Person person){ //к заданию 9
        person = new Person("Ilya", "Lagutenko");
    }

    public static void changePersonsName(Person person){ //к заданию 10
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

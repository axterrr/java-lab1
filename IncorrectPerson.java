public class IncorrectPerson {

    private String firstName;
    private String lastName;
    private int age;

    public IncorrectPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}

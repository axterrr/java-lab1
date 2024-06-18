import java.util.Objects;

public class CorrectPerson {

    private String firstName;
    private String lastName;
    private int age;

    public CorrectPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        CorrectPerson other = (CorrectPerson) obj;
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}

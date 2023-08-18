import java.time.LocalDate;

public class Person {
    private  String firstName;
    private String LastName;
    private LocalDate dateofBritht;

    public Person(String firstName, String lastName, LocalDate dateofBritht) {
        this.firstName = firstName;
        LastName = lastName;
        this.dateofBritht = dateofBritht;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateofBritht() {
        return dateofBritht;
    }

    public void setDateofBritht(LocalDate dateofBritht) {
        this.dateofBritht = dateofBritht;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", dateofBritht=" + dateofBritht +
                '}';
    }
}

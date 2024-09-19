package study_group.model;

public class User {
    private String firstName;

    private String secondName;
    private String lastName;
    private int age;

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(String firstName, String secondName, String lastName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName + ", age="+ age + "]";
    }

}
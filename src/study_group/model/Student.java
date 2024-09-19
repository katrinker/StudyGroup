package study_group.model;

public class Student extends User implements Comparable<Student> {
    private int studentId;


    public Student(int studentId, String firstName, String secondName, String lastName, int age) {
        super(firstName, secondName, lastName, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", firstName=" + super.getFirstName() + ", secondName=" + super.getSecondName()
                + ", lastName=" + super.getLastName() + ", age="+ super.getAge() + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.getStudentId())
            return 1;
        if (studentId < o.getStudentId())
            return -1;

        return 0;

    }

}
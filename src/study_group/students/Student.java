package study_group.students;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int age;

    public Student(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}

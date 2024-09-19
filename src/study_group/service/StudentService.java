package study_group.service;

import study_group.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public void add(String firstName, String secondName, String lastName, int age) {

        int maxID = 0;
        for (Student student : studentList) {
            if (maxID < student.getStudentId()) {
                maxID = student.getStudentId();
            }

        }
        studentList.add(new Student(++maxID, firstName, secondName, lastName, age));

    }

    public List<Student> getStudentList() {
        return studentList;
    }

}
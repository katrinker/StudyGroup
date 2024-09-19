package study_group.controllers;

import study_group.model.Student;
import study_group.service.StudentService;
import study_group.view.StudentView;

public class StudentControler implements UserControler<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();


    @Override
    public void add(String firstName, String secondName, String lastName, int age) {
        studentService.add(firstName, secondName, lastName, age);

    }

    @Override
    public void sendOnConsole() {

        studentView.sendOnConsole(studentService.getStudentList());

    }

}

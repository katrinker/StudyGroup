package study_group.controllers;

import study_group.model.Teacher;
import study_group.service.TeacherService;
import study_group.view.TeacherView;

public class TeacherControler implements UserControler<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void add(String firstName, String secondName, String lastName, int age) {
        teacherService.add(firstName, secondName, lastName, age);

    }

    @Override
    public void sendOnConsole() {

        teacherView.sendOnConsole(teacherService.getTeachersList());
    }

}


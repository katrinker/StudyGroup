package study_group.service;

import study_group.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {



    private final List<Teacher> teachersList = new ArrayList<>();

    public TeacherService() {
    }

    @Override
    public void add(String firstName, String secondName, String lastName, int age) {
        int maxID = 0;
        for (Teacher teacher : teachersList) {
            if (maxID < teacher.getTeacherID()) {
                maxID = teacher.getTeacherID();
            }

        }
        teachersList.add(new Teacher(++maxID,firstName, secondName, lastName, age));

    }
    public List<Teacher> getTeachersList() {
        return teachersList;
    }


}
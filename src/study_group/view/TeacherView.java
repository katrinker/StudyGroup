package study_group.view;
import study_group.model.Teacher;

import java.util.List;


public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);

        }
    }


}

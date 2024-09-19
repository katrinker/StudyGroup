package study_group;

import study_group.controllers.StudentControler;
import study_group.controllers.TeacherControler;

public class Main {
    public static void main(String[] args) {
        StudentControler controler = new StudentControler();
        controler.add("Виктор", "Алексеевич", "Птицын", 17);
        controler.add("Александр", "Семенович", "Часовой", 18);
        controler.add("Илья", "Александрович", "Кононов", 20);
        controler.add("Никита", "Евгеньевич", "Журавлев",18);

        controler.sendOnConsole();
        System.out.println();


        TeacherControler teacherControler = new TeacherControler();
        teacherControler.add("Татьяна", "Петровна", "Семёнова", 49);
        teacherControler.add("Игорь", "Семёнович", "Воронин", 52);
        teacherControler.add("Людмила", "Ильинична", "Сомова", 62);
        teacherControler.add("Елена", "Николаевна", "Радыбина", 48);
        teacherControler.sendOnConsole();

    }


}

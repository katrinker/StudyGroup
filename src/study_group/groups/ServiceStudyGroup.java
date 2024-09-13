package study_group.groups;

import study_group.students.Student;

public class ServiceStudyGroup {
    private int genId;
    private StudyGroup group;

    public ServiceStudyGroup(){
        group = new StudyGroup();
    }

    public void addStudent(String name, int age){
        Student student = new Student(genId++, name, age);
        group.addStudent(student);
    }

    public void sortByName(){
        group.sortByName();
    }

    public void sortByAge(){
        group.sortByAge();
    }

    public String getStudentListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");
        for (Student student: group){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

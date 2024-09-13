package study_group.groups;

import study_group.students.Student;
import study_group.students.StudentComparatorByAge;
import study_group.students.StudentComparatorByName;
import study_group.students.StudentIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;
    private int studyGroupID;
    private String nameGroup;

    public int getStudyGroupID() {
        return studyGroupID;
    }

    public void setStudyGroupID(int studyGroupID) {
        this.studyGroupID = studyGroupID;
    }

    public StudyGroup(int studyGroupID, String nameGroup) {
        this.studyGroupID = studyGroupID;
        this.nameGroup = nameGroup;
    }

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge());
    }

    @Override
    public String toString() {
        return "StudyGroup [ID=" + studyGroupID + ", name=" + nameGroup + "]";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }
}

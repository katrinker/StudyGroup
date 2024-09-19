package study_group.service;

import study_group.sort.UserComparatorByAge;
import study_group.sort.UserComparatorByName;
import study_group.sort.StudentIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends StudyGroupElement> implements Iterable<E> {
    private List<E> list;
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
        list = new ArrayList<>();
    }

    public void addStudent(E student){
        list.add(student);
    }

    public List<E> getList(){
        return list;
    }

    public void sortByName(){
        list.sort(new UserComparatorByName<>());
    }

    public void sortByAge(){
        list.sort(new UserComparatorByAge<>());
    }

    @Override
    public String toString() {
        return "StudyGroup [ID=" + studyGroupID + ", name=" + nameGroup + "]";
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new StudentIterator<>(list);
    }
}

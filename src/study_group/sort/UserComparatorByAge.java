package study_group.sort;

import study_group.service.StudyGroupElement;

import java.util.Comparator;

public class UserComparatorByAge<E extends StudyGroupElement> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
       return Integer.compare(o1.getAge(), o2.getAge());
    }
}

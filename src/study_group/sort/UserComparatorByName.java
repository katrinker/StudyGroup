package study_group.sort;

import study_group.service.StudyGroupElement;

import java.util.Comparator;

public class UserComparatorByName<E extends StudyGroupElement> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

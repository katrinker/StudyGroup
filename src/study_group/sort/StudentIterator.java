package study_group.sort;

import study_group.service.StudyGroupElement;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<E extends StudyGroupElement> implements Iterator<E> {

    private int index;
    private List<E> list;

    public StudentIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}


package study_group;

import study_group.groups.StudyGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{
    private int streamNumber;
    private List<StudyGroup> groupList;
    List<Stream> streams = List.of();

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }


    public Stream(int streamNumber, List<StudyGroup> groupList) {
        this.streamNumber = streamNumber;
        this.groupList =  new ArrayList<StudyGroup>();;
    }

    public List<StudyGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudyGroup> groupList) {
        this.groupList = groupList;
    }

    public void addStudyGroup(StudyGroup group) {
        groupList.add(group);

    }


    @Override
    public String toString() {
        return "Stream №" + streamNumber + ":" +groupList ;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groupList.iterator();
    }
}

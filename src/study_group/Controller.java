package study_group;

import study_group.groups.ServiceStudyGroup;

public class Controller {
    private ServiceStudyGroup serviceStudyGroup = new ServiceStudyGroup();

    public void getStudentListInfo(){
        serviceStudyGroup.getStudentListInfo();
    }
}

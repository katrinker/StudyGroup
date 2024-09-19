package study_group.view;

import study_group.model.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);

}
package study_group.service;

import study_group.model.User;

public interface UserService <T extends User>{
    void add(String firstName, String secondName, String lastName, int age);

}

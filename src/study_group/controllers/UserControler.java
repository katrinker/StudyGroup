package study_group.controllers;

import study_group.model.User;

public interface UserControler<T extends User> {
    void add(String firstName, String secondName, String lastName, int age);

    void sendOnConsole();

}
package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.UserService;

public class UserServiceImpl implements UserService {

    private User users;

    @Override
    public User getUser(int id) {
        return users;
    }

    @Override
    public User getUser(String name) {
        return users;
    }

    @Override
    public void addUser(User users) {
        this.users = users;
    }

    @Override
    public void deleteUser(User users) {
        this.users = null;
    }

    @Override
    public void updateUser(User users) {

    }


}

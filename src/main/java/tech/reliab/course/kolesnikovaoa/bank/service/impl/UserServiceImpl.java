package tech.reliab.course.kolesnikovaoa.bank.service.impl;

import tech.reliab.course.kolesnikovaoa.bank.entity.Bank;
import tech.reliab.course.kolesnikovaoa.bank.entity.User;
import tech.reliab.course.kolesnikovaoa.bank.service.UserService;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private User users;
    public UserServiceImpl(){
        this.users = null;
    }

    @Override
    public User createUser(int userId,
                           String userName,
                           LocalDate userBirthdate,
                           String userWorkplace,
                           Bank userBank) {
        this.users = new User(
                userId,
                userName,
                userBirthdate,
                userWorkplace,
                userBank);
        return this.users;
    }

    @Override
    public void addUser(User user) {
        this.users = user;
    }

    @Override
    public User getUser(int userId) {
        if (this.users.getUserId() == userId) {
            return this.users;
        }
        return null;
    }

    @Override
    public User getUser(String userName) {
        if (this.users.getUserName().equals(userName)) {
            return this.users;
        }
        return null;
    }

    @Override
    public void updateUser(User user) {
        if(this.users.getUserId() == user.getUserId()){
            this.users = user;
        }
    }

    @Override
    public void deleteUser(int userId) {
        if (this.users.getUserId() == userId) {
            this.users = null;
        }
    }

    @Override
    public void deleteUser(String userName) {
        if (this.users.getUserName().equals(userName)) {
            this.users = null;
        }
    }
}

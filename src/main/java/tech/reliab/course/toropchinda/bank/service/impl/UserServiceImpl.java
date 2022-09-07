package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.UserService;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private User users;
    public UserServiceImpl(){
        this.users = null;}

    @Override
    public void createUser(int userId,
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
    public void updateUser(int userId,
                           String userName,
                           LocalDate userBirthdate,
                           String userWorkplace,
                           Bank userBank) {
        this.users.setUserId(userId);
        this.users.setUserName(userName);
        this.users.setUserBirthdate(userBirthdate);
        this.users.setUserWorkplace(userWorkplace);
        this.users.setUserBank(userBank);
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

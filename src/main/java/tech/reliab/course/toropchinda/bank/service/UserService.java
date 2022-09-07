package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.User;

import java.time.LocalDate;

public interface UserService {

    /**
     * создать клиента
     * получить клиента по id
     * получить клиента по имени
     * обновить клиента
     * удалить клиента по id
     * удалить клиента по имени
     */

    void createUser(int userId,
                    String userName,
                    LocalDate userBirthdate,
                    String userWorkplace,
                    Bank userBank);

    User getUser(int userId);
    User getUser(String userName);
    void updateUser(int userId,
                    String userName,
                    LocalDate    userBirthdate,
                    String userWorkplace,
                    Bank userBank);
    void deleteUser(int userId);
    void deleteUser(String userName);




}

package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.User;

import java.time.LocalDate;

public interface UserService {

    /**
     * Создание нового клиента с помещением его в коллекцию в сервисе
     * @param userId id клиента
     * @param userName ФИО клиента
     * @param userBirthdate Дата рождения клиента
     * @param userWorkplace Место работы клиента
     * @param userBank Банк клиента
     */
    User createUser(int userId,
                    String userName,
                    LocalDate userBirthdate,
                    String userWorkplace,
                    Bank userBank);

    /**
     * Добавление в коллекцию в сервисе клиента, который уже был где-то создан
     * @param user объект клиент
     */
    void addUser(User user);

    /**
     * Получение клиента по id
     * @param userId id клиента
     * @return возвращает или клиента или null
     */
    User getUser(int userId);

    /**
     * Получение клиента по ФИО
     * @param userName ФИО клиента
     * @return возвращает или клиента или null
     */
    User getUser(String userName);

    /**
     * Перезапись клиента новым, с изменёнными полями
     * @param user новый клиент
     */
    void updateUser(User user);

    /**
     * Удалить клиента по id
     * @param userId id клиента
     */
    void deleteUser(int userId);

    /**
     * Удалить клиента по имени
     * @param userName имя клиента
     */
    void deleteUser(String userName);


}

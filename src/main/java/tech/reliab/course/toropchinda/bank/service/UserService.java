package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.User;

public interface UserService {

 /**
  *
  * @param id Получение клиента банка по id
  * @return объект клиента или null
  */
 User getUser(int id);

 /**
  *
  * @param name Получение клиента банка по ФИО
  * @return
  */
 User getUser(String name);

 /**
  * Добавление нового клиента банка
  * @param users
  */
 void addUser(User users);

 /**
  * Удаление клиента банка
  * @param users
  */
 void deleteUser(User users);

void updateUser(User users);


}

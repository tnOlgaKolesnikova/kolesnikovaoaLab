package tech.reliab.course.kolesnikovaoa.bank.service;

import tech.reliab.course.kolesnikovaoa.bank.entity.BankOffice;
import tech.reliab.course.kolesnikovaoa.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    /**
     * Создание нового сотрудника с помещением его в коллекцию в сервисе
     * @param employeeId
     * @param employeeName
     * @param employeeBirthdate
     * @param employeePosition
     * @param isWorkRemote
     * @param employeeBankOffice
     * @param isCreditIssuer
     * @param employeeSalary
     * @return
     */
    Employee createEmployee (int employeeId,
                             String employeeName,
                             LocalDate employeeBirthdate,
                             String employeePosition,
                             boolean isWorkRemote,
                             BankOffice employeeBankOffice,
                             boolean isCreditIssuer,
                             int employeeSalary);

    /**
     * Добавление в коллекцию в сервисе сотрудника, который уже был где-то создан
     * @param employee
     */
    void addEmployee (Employee employee);

    /**
     * Получение сотрудника по id
     * @param id id сотрудника
     * @return сотрудника или null
     */
    Employee getEmployee (int id);

    /**
     * Получение сотрудника по ФИО
     * @param name ФИО сотрудника
     * @return сотрудника или null
     */
    Employee getEmployee (String name);

    /**
     * Перезапись сотрудника новым, с изменёнными полями
     * @param employee сотрудник
     */
    void updateEmployee (Employee employee);

    /**
     * Удаление сотрудника из коллекции в сервисе по id
     * @param Id Id сотрудника
     */
    void deleteEmployee (int Id);

    /**
     * Удаление сотрудника из коллекции в сервисе по ФИО
     * @param employeeName ФИО сотрудника
     */
    void deleteEmployee (String employeeName);


}

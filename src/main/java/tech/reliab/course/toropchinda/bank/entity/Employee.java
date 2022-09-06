package tech.reliab.course.toropchinda.bank.entity;

import java.util.Date;

public class Employee {

    /**
     * Поле Id сотрудника
     */
    private int employeeId;
    /**
     * Поле ФИО
     */
    private String employeeName;
    /**
     * Поле Дата рождения
     */
    private Date employeeBirthdate;
    /**
     * Поле Должность
     */
    private String employeePosition;
    /**
     * Поле Работает ли в банковском офисе или удаленно? (да/нет)
     */
    private boolean employeeTypeWork;
    /**
     * Поле Банковский офис, в котором работает
     */
    private Bank employeeBankOffice;
    /**
     * Поле Может ли выдавать кредиты? (да/нет)
     */
    private boolean employeeStatus;
    /**
     * Поле Размер зарплаты
     */
    private int employeeSalary;





}

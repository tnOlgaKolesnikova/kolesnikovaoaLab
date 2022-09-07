package tech.reliab.course.toropchinda.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
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
    private LocalDate employeeBirthdate;
    /**
     * Поле Должность
     */
    private String employeePosition;
    /**
     * Поле Работает ли в банковском офисе или удаленно? (да/нет)
     */
    private boolean isWorkRemote;
    /**
     * Поле Банковский офис, в котором работает
     */
    private BankOffice employeeBankOffice;
    /**
     * Поле Может ли выдавать кредиты? (да/нет)
     */
    private boolean isCreditIssuer;
    /**
     * Поле Размер зарплаты
     */
    private int employeeSalary;

    /**
     * Конструктор создание нового объекта сотрудник банка
     */

    public Employee(int employeeId, String employeeName, LocalDate employeeBirthdate, String employeePosition, boolean isWorkRemote, BankOffice employeeBankOffice, boolean isCreditIssuer, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthdate = employeeBirthdate;
        this.employeePosition = employeePosition;
        this.isWorkRemote = isWorkRemote;
        this.employeeBankOffice = employeeBankOffice;
        this.isCreditIssuer = isCreditIssuer;
        this.employeeSalary = employeeSalary;
    }
}

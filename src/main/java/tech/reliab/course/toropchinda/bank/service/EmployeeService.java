package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    /**
     * создать объект сотрудник
     * получить сотрудника по id
     * получить сотрудника по имени
     * обновить объект сотрудник
     * удалить объект сотрудник по id
     * удалить объект сотрудник по имени
     */


    Employee createEmployee (int employeeId,
                         String employeeName,
                         LocalDate employeeBirthdate,
                         String employeePosition,
                         boolean isWorkRemote,
                         BankOffice employeeBankOffice,
                         boolean isCreditIssuer,
                         int employeeSalary);
    Employee getEmployee (int id);
    Employee getEmployee (String name);
    void updateEmployee (int employeeId,
                         String employeeName,
                         LocalDate employeeBirthdate,
                         String employeePosition,
                         boolean isWorkRemote,
                         BankOffice employeeBankOffice,
                         boolean isCreditIssuer,
                         int employeeSalary);
void deleteEmployee (int Id);
void deleteEmployee (String employeeName);


}

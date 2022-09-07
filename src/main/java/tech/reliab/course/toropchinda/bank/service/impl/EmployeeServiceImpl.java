package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.BankAtm;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.service.EmployeeService;

import java.time.LocalDate;

public class EmployeeServiceImpl implements EmployeeService {
    private Employee employees;

    public EmployeeServiceImpl(){
        this.employees = null;
    }
    @Override
    public Employee createEmployee(int employeeId,
                               String employeeName,
                               LocalDate employeeBirthdate,
                               String employeePosition,
                               boolean isWorkRemote,
                               BankOffice employeeBankOffice,
                               boolean isCreditIssuer,
                               int employeeSalary) {
        this.employees = new Employee(
                employeeId,
                employeeName,
                employeeBirthdate,
                employeePosition,
                isWorkRemote,
                employeeBankOffice,
                isCreditIssuer,
                employeeSalary);
        return this.employees;
    }

    @Override
    public Employee getEmployee(int id) {
        if (this.employees.getEmployeeId() == id) {
            return this.employees;
        }
        return null;
    }

    @Override
    public Employee getEmployee(String name) {
        if (this.employees.getEmployeeName().equals(name)) {
            return this.employees;
        }
        return null;
    }

    @Override
    public void updateEmployee(int employeeId,
                               String employeeName,
                               LocalDate employeeBirthdate,
                               String employeePosition,
                               boolean isWorkRemote,
                               BankOffice employeeBankOffice,
                               boolean isCreditIssuer,
                               int employeeSalary) {
        this.employees.setEmployeeId(employeeId);
        this.employees.setEmployeeName(employeeName);
        this.employees.setEmployeeBirthdate(employeeBirthdate);
        this.employees.setEmployeePosition(employeePosition);
        this.employees.setWorkRemote(isWorkRemote);
        this.employees.setEmployeeBankOffice(employeeBankOffice);
        this.employees.setCreditIssuer(isCreditIssuer);
        this.employees.setEmployeeSalary(employeeSalary);


    }

    @Override
    public void deleteEmployee(int Id) {
        if (this.employees.getEmployeeId() == Id) {
            this.employees = null;
        }
    }

    @Override
    public void deleteEmployee(String employeeName) {
        if (this.employees.getEmployeeName().equals(employeeName)) {
            this.employees = null;
        }
    }
}

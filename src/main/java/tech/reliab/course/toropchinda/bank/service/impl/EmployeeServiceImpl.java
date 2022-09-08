package tech.reliab.course.toropchinda.bank.service.impl;
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
    public void addEmployee(Employee employee) {
     this.employees = employee;
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
    public void updateEmployee(Employee employee) {
        if(this.employees.getEmployeeId() == employee.getEmployeeId()){
            this.employees = employee;
        }
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

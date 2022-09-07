package tech.reliab.course.toropchinda.bank;

import tech.reliab.course.toropchinda.bank.entity.*;

import tech.reliab.course.toropchinda.bank.service.impl.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankServiceImpl banks = new BankServiceImpl();
        Bank bank = banks.addBank("Открытие");
        BankOfficeServiceImpl offices = new BankOfficeServiceImpl();
        BankOffice office = offices.createBankOffice(
                1,
                "Главный офис",
                "ул. Пушкина",
                BankOfficeStatus.WORK,
                true,
                0,
                true,
                true,
                true, Math.round(bank.getBankMoneyCount() / 2),
                3000
        );
        bank.setBankOfficeCount(1);
        EmployeeServiceImpl staff = new EmployeeServiceImpl();
        Employee worker = staff.createEmployee(
                1,
                "Василий Петрович",
                LocalDate.of(1995, 5, 29),
                "Старший по младшим",
                true,
                office,
                true,
                3000
        );
        bank.setBankEmployeeCount(1);
        AtmServiceImpl atms = new AtmServiceImpl();
        atms.createBankAtm(
                1,
                "Банкомат Первый",
                BankAtmStatus.NO_MONEY,
                bank,
                office,
                worker,
                true,
                true,
                0,
                3000
        );
        UserServiceImpl us = new UserServiceImpl();
        us.createUser(1,
                "Первый клиент",
                LocalDate.of(1991, 1, 15),
                "РУСЬ",
                bank
        );

        /** Payment acc*/
        /** Credit acc*/

        System.out.println(bank);
    }
}

package tech.reliab.course.kolesnikovaoa.bank;

import tech.reliab.course.kolesnikovaoa.bank.entity.*;

import tech.reliab.course.kolesnikovaoa.bank.service.impl.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /** Создание банка */
        BankServiceImpl banks = new BankServiceImpl();
        Bank bank = banks.createBank("Открытие");
        /** Создание офиса и оповещение об этом банка */
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
        bank.setBankOfficeCount(bank.getBankOfficeCount() + 1);
        /** Создание работника банка и оповещение об этом банка */
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
        bank.setBankEmployeeCount(bank.getBankEmployeeCount() + 1);
        /** Создание банкомата и оповещение об этом банка */
        AtmServiceImpl atms = new AtmServiceImpl();
        BankAtm atm = atms.createBankAtm(
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
        bank.setBankAtmCount(bank.getBankAtmCount() + 1);
        /** Создание клиента и оповещение об этом банка */
        UserServiceImpl users = new UserServiceImpl();
        User user = users.createUser(1,
                "В.С.А.",
                LocalDate.of(1991, 1, 15),
                "ooo русь",
                bank
        );
        bank.setBankUserCount(bank.getBankUserCount() + 1);
        /** Создание дебетового счета и перенос на него всей месячной зарплаты клиента */
        PaymentAccountServiceImpl paymentAccounts = new PaymentAccountServiceImpl();
        PaymentAccount payAcc = paymentAccounts.createPaymentAccount(1,
                user,
                "Открытие");
        payAcc.setPaymentAccountAmount(user.getUserMonthlyIncome());
        /** Оповещение юзера о его дебетовом счёте */
        user.setUserPaymentAccount(payAcc);
        /** Создание кредитного счёта и привязка его погашения к дебетовому счёту */
        CreditAccountServiceImpl creditAccounts = new CreditAccountServiceImpl();
        CreditAccount credAccount = creditAccounts.createCreditAccount(1,
                user,
                bank.getBankName(),
                LocalDate.of(2020, 1, 15),
                LocalDate.of(2042, 2, 5),
                20000,
                bank.getBankRate(),
                worker,
                Integer.toString(payAcc.getPaymentAccountId()));
        user.setUserCreditAccount(credAccount);

        banks.updateBank(bank);
        users.updateUser(user);
        System.out.println(bank);
        System.out.println(user);
    }
}

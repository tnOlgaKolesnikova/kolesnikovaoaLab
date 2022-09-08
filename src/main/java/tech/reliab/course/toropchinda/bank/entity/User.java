package tech.reliab.course.toropchinda.bank.entity;

import lombok.Data;
import tech.reliab.course.toropchinda.bank.utils.RandomGenerator;

import java.time.LocalDate;

@Data
public class User {
    /**
     * Поле Id клиента
     */
    private int userId;
    /**
     * Поле ФИО
     */
    private String userName;
    /**
     * Поле Дата рождения
     */
    private LocalDate userBirthdate;
    /**
     * Поле Место работы
     */
    private String userWorkplace;
    /**
     * Поле Ежемесячный доход (генерируется рандомно, но не более 10 000)
     */
    private int userMonthlyIncome;
    /**
     * Поле Банки, которыми он пользуется
     */
    private Bank userBank;
    /**
     * Поле Кредитные счета (по умолчанию пусто)
     */
    private CreditAccount userCreditAccount;
    /**
     * Поле Платежные счета (по умолчанию пусто)
     */
    private PaymentAccount userPaymentAccount;
    /**
     * Кредитный рейтинг для банка (генерируется рандомно исходя из
     * ежемесячного дохода, от меньше 1 000 – 100, от 1 000 до 2 000 – 200 и т.д.
     * вплоть до 10 000
     */
    private int userBanksCreditRating;

    /**
     * @param userId        Id клиента
     * @param userName      ФИО
     * @param userBirthdate Дата рождения
     * @param userWorkplace Место работы
     * @param userBank      Банки, которыми клиент пользуется
     */
    public User(int userId, String userName, LocalDate userBirthdate, String userWorkplace, Bank userBank) {
        this.userId = userId;
        this.userName = userName;
        this.userBirthdate = userBirthdate;
        this.userWorkplace = userWorkplace;
        this.userMonthlyIncome = RandomGenerator.generateInt(1, 10000);
        this.userBank = userBank;
        this.userCreditAccount = null;
        this.userPaymentAccount = null;
        this.userBanksCreditRating = RandomGenerator.generateCreditRating(this.userMonthlyIncome);
    }

    @Override
    public String toString() {
        return "Клиент " + this.userName + " с датой рождения " + this.userBirthdate +
                " работающий в " + this.userWorkplace + "\n имеет доход " + this.userMonthlyIncome +
                " рублей.\n" + "У клиента заведены счета в банке " + this.userBank.getBankName() +
                ".\n Дебетовые счета: " + this.userPaymentAccount.getPaymentAccountId() +
                "\n Кредитные счета: " + this.userCreditAccount.getCreditAccountId() +
                "\n Кредитный рейтинг клиента составляет " + this.userBanksCreditRating + "\n";
    }
}

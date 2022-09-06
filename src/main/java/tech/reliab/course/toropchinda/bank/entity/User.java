package tech.reliab.course.toropchinda.bank.entity;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.toropchinda.bank.utils.RandomGenerator;

import java.util.Date;

@Getter
@Setter
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
    private Date userBirthdate;
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
    private String userPaymentAccount;
    /**
     * Кредитный рейтинг для банка (генерируется рандомно исходя из
     * ежемесячного дохода, от меньше 1 000 – 100, от 1 000 до 2 000 – 200 и т.д.
     * вплоть до 10 000
     */
    private int userBanksCreditRating;

    public User(int userId, String userName, Date userBirthdate, String userWorkplace, Bank userBank) {
        this.userId = userId;
        this.userName = userName;
        this.userBirthdate = userBirthdate;
        this.userWorkplace = userWorkplace;
        this.userMonthlyIncome = RandomGenerator.generateInt(1, 10000);
        this.userBank = userBank;
        this.userCreditAccount = null;
        this.userPaymentAccount = "";
        this.userBanksCreditRating = RandomGenerator.generateCreditRating(this.userMonthlyIncome);
    }
}

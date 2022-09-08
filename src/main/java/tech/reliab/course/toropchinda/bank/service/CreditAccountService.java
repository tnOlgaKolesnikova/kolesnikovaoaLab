package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.CreditAccount;
import tech.reliab.course.toropchinda.bank.entity.Employee;
import tech.reliab.course.toropchinda.bank.entity.User;

import java.time.LocalDate;

public interface CreditAccountService {

    /**
     *Создание нового кредитного счета с помещением его в коллекцию в сервисе
     * @param id
     * @param user
     * @param bankName
     * @param startDate
     * @param endDate
     * @param creditAmount
     * @param creditBankRate
     * @param creditIssuer
     * @param loanRepayment
     * @return
     */
    CreditAccount createCreditAccount(int id,
                                      User user,
                                      String bankName,
                                      LocalDate startDate,
                                      LocalDate endDate,
                                      int creditAmount,
                                      int creditBankRate,
                                      Employee creditIssuer,
                                      String loanRepayment);

    /**
     * Добавление в коллекцию в сервисе кредитного счета, который уже был где-то создан
     * @param creditAccount
     */
    void addCreditAccount(CreditAccount creditAccount);

    /**
     * Получение кредитного счета по id
     * @param id
     * @return
     */
    CreditAccount getCreditAccount(int id);

    /**
     * Перезапись кредитного счета новым, с изменёнными полями
     * @param creditAccounts
     */
    void updateCreditAccount(CreditAccount creditAccounts);

    /**
     * Удаление кредитного счета
     * @param id кредитного счета
     */
    void deleteCreditAccount(int id);

}

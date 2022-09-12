package tech.reliab.course.kolesnikovaoa.bank.service;

import tech.reliab.course.kolesnikovaoa.bank.entity.CreditAccount;
import tech.reliab.course.kolesnikovaoa.bank.entity.Employee;
import tech.reliab.course.kolesnikovaoa.bank.entity.User;

import java.time.LocalDate;

public interface CreditAccountService {

    /**
     *Создание нового кредитного счета с помещением его в коллекцию в сервисе
     * @param id id кредитного счета
     * @param user клиент, зак оторым закреплен счет
     * @param bankName банк, в котором открыт счет
     * @param startDate Дата начала кредита
     * @param endDate Дата окончания кредита
     * @param creditAmount Сумма кредита
     * @param creditBankRate Процентная ставка
     * @param creditIssuer Сотрудник, который выдал кредит
     * @param loanRepayment Платежный счет в банке с которого будет осуществляться погашение данного кредита
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

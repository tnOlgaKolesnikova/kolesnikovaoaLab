package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;

public interface PaymentAccountService {
    /**
     * Добавить новый платежный счет
     * @param id
     * @return
     */
    PaymentAccount createPaymentAccount(int id, User user, String bankName);

    /**
     * Добавить в коллекцию сервиса счёт, уже где-то созданный
     * @param acc
     */
    void addPaymentAccount(PaymentAccount acc);

    /**
     *Получить платежный счет
      * @return объект платежный счет или null
     */
    PaymentAccount getPaymentAccount(int id);

    /**
     * Обновить платежный счет
     * @param paymentAccounts
     */
    void updatePaymentAccount(PaymentAccount paymentAccounts);

    /**
     * Удалить платежный счет
     * @param id
     */
    void deletePaymentAccount(int id);




}

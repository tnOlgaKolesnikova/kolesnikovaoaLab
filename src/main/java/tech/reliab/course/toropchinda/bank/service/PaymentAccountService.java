package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;

public interface PaymentAccountService {
    /**
     *Получить платежный счет
      * @return объект платежный счет или null
     */
    PaymentAccount getPaymentAccount(int id);

    /**
     * Добавить новый платежный счет
     * @param id
     * @return
     */
    PaymentAccount addPaymentAccount(int id);

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


    /**
     * Получить все платежные счета клиента??
     */


}

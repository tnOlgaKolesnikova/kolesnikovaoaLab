package tech.reliab.course.kolesnikovaoa.bank.entity;

import lombok.Data;

@Data
public class PaymentAccount {

    /**
     * Id платёжного счета
     */
    private int paymentAccountId;
    /**
     * Пользователь, за которым закреплен этот платежный счет
     */
    private User paymentUser;
    /**
     * Поле Название банка, в котором открыт этот счет
     */
    private String paymentAccountBankName;
    /**
     * Сумма, которая лежит в данный момент на счету (по умолчанию 0)
     */
    private int paymentAccountAmount;

    /**
     * Конструктор создание нового объекта платежный счет
     * @param id Id платёжного счета
     * @param user Пользователь, за которым закреплен этот платежный счет
     * @param bankName Название банка, в котором открыт этот счет
     */

    public PaymentAccount(int id, User user, String bankName) {
        this.paymentAccountId = id;
        this.paymentUser = user;
        this.paymentAccountBankName = bankName;
        this.paymentAccountAmount = 0;
    }
}

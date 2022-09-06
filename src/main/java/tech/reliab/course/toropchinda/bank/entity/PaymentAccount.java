package tech.reliab.course.toropchinda.bank.entity;

public class PaymentAccount {

    /**
     * Id платёжного счета
     */
    private int paymentAccountId;
    /**
     * Пользователь, за которым закреплен этот платежный счет
     */
    private String userPaymentAccount;
    /**
     * Поле Название банка, в котором открыт этот счет
     */
    private Bank paymentAccountBank;
    /**
     * Сумма, которая лежит в данный момент на счету (по умолчанию 0)
     */
    private int paymentAccountAmount;

}

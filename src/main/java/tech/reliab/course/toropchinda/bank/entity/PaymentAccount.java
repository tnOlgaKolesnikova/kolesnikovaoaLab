package tech.reliab.course.toropchinda.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
     *
     */
    public PaymentAccount(int id, User user, String bankName) {
        this.paymentAccountId = id;
        this.paymentUser = user;
        this.paymentAccountBankName = bankName;
        this.paymentAccountAmount = 0;
    }
}

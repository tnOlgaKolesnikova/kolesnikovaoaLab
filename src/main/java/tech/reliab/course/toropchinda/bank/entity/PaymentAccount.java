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
    public PaymentAccount() {
        this.paymentAccountId = paymentAccountId;
        this.paymentUser = paymentUser;
        this.paymentAccountBankName = paymentAccountBankName;
        this.paymentAccountAmount = 0;
    }
}

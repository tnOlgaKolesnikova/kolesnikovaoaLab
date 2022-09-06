package tech.reliab.course.toropchinda.bank.entity;

public class PaymentAccount {
    /*
  Id платёжного счета
• Пользователь, за которым закреплен этот платежный счет
• Название банка, в котором открыт этот счет
• Сумма, которая лежит в данный момент на счету (по умолчанию 0)
     */

    public int paymentAccountId;
    public String userPaymentAccount;
    public String paymentAccountBank;
    public int paymentAccountAmount;

}

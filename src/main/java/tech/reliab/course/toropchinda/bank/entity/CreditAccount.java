package tech.reliab.course.toropchinda.bank.entity;

import java.util.Date;

 class CreditAccount {
    /**
     * Поле Id кредитного счета
     */
    private int creditAccountId;
    /**
     * Пользователь, за которым закреплен этот кредитный счет
     */
    private User creditAccountUser;
    /**
     * Поле Название банка, где взят кредит
     */
    private Bank creditAccountBank;
    /**
     * Поле Дата начала кредита
     */
    private Date creditBeginning;
    /**
     * Поле Дата окончания кредита
     */
    private Date creditEnding;
    /**
     * Поле Кол-во месяцев, на которые взят кредит
     */
    private short creditCountMonths;
    /**
     * Поле Сумма кредита
     */
    private int creditAmount;
    /**
     * Поле Ежемесячный платеж
     */
    private int creditMonthlyPayment;
    /**
     * Поле Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже)
     */
    private Bank creditBankRate;
    /**
     * Сотрудник, который выдал кредит
     */
    private Employee employeeIssueCredit;
    /**
     * Поле Платежный счет в банке с которого будет осуществляться погашение данного кредита
     */
    private int loanRepayment;
}

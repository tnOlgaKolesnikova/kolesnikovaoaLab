package tech.reliab.course.toropchinda.bank.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
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
    private String creditAccountBankName;
    /**
     * Поле Дата начала кредита
     */
    private Date creditStartDate;
    /**
     * Поле Дата окончания кредита
     */
    private Date creditEndDate;
    /**
     * Поле Кол-во месяцев, на которые взят кредит
     */
    private short creditCountMonths;
    /**
     * Поле Сумма кредита
     */
    private float creditAmount;
    /**
     * Поле Ежемесячный платеж
     */
    private float creditMonthlyPayment;
    /**
     * Поле Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже)
     */
    private float creditBankRate;
    /**
     * Сотрудник, который выдал кредит
     */
    private Employee creditIssuer;
    /**
     * Поле Платежный счет в банке с которого будет осуществляться погашение данного кредита
     */
    private String loanRepayment;

   /**
    *
    * @param creditAccountId Id кредитного счета
    * @param creditAccountUser Пользователь, за которым закреплен этот кредитный счет
    * @param creditAccountBankName Название банка, где взят кредит
    * @param creditStartDate Дата начала кредита
    * @param creditEndDate Дата окончания кредита
    * @param creditCountMonths Кол-во месяцев, на которые взят кредит
    * @param creditAmount Сумма кредита
    * @param creditBankRate Поле Процентная ставка (должна быть равной процентной ставке банка, в котором взят кредит или ниже)
    * @param creditIssuer Сотрудник, который выдал кредит
    * @param loanRepayment латежный счет в банке с которого будет осуществляться погашение данного кредита
    */
   public CreditAccount(int creditAccountId, User creditAccountUser, String creditAccountBankName, Date creditStartDate, Date creditEndDate, short creditCountMonths, float creditAmount, float creditBankRate, Employee creditIssuer, String loanRepayment) {
      this.creditAccountId = creditAccountId;
      this.creditAccountUser = creditAccountUser;
      this.creditAccountBankName = creditAccountBankName;
      this.creditStartDate = creditStartDate;
      this.creditEndDate = creditEndDate;
      this.creditCountMonths = creditCountMonths;
      this.creditAmount = creditAmount;
      this.creditMonthlyPayment = creditAmount/creditCountMonths;
      this.creditBankRate = creditBankRate;
      this.creditIssuer = creditIssuer;
      this.loanRepayment = loanRepayment;
   }
}

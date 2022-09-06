package tech.reliab.course.toropchinda.bank.entity;

import javax.swing.plaf.PanelUI;
import java.util.Date;

public class CreditAccount {
/*
• Id кредитного счета
• Пользователь, за которым закреплен этот кредитный счет
• Название банка, где взят кредит
• Дата начала кредита
• Дата окончания кредита
• Кол-во месяцев, на которые взят кредит
• Сумма кредита
• Ежемесячный платеж
• Процентная ставка (должна быть равной процентной ставке банка, в
котором взят кредит или ниже)
• Сотрудник, который выдал кредит
• Платежный счет в банке с которого будет осуществляться погашение
данного кредита
 */

public int creditAccountId;
public String creditAccountUser;
public String creditAccountBank;
public Date creditBeginning;
public Date creditEnding;
public short creditCountMonths;
public int creditAmount;
public int creditMonthlyPayment;
public float creditBankRate;
public int employeeIssueCredit;
public int loanRepayment;
}

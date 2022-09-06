package tech.reliab.course.toropchinda.bank.entity;

public class User {
    /*
  Id клиента
• ФИО
• Дата рождения
• Место работы
• Ежемесячный доход (генерируется рандомно, но не более 10 000)
• Банки, которыми он пользуется
• Кредитные счета (по умолчанию пусто)
• Платежные счета (по умолчанию пусто)
• Кредитный рейтинг для банка (генерируется рандомно исходя из
ежемесячного дохода, от меньше 1 000 – 100, от 1 000 до 2 000 – 200 и т.д.
вплоть до 10 000
     */
    public int userId;
    public String userName;
    public String userWorkplace;
    public int userMonthlyRevenue;
    public int userUsedBank;
    public int userCreditAccount;
    public int userPaymentAccount;
    public float userBanksCreditRating;


}

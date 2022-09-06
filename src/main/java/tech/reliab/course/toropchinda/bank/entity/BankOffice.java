package tech.reliab.course.toropchinda.bank.entity;

public class BankOffice {
    /**
     * Поле Id банковского офиса
     */
    private int bankOfficeId;
    /**
     * Поле Название офиса
     */
    private String bankOfficeName;
    /**
     * Поле Адрес банковского офиса
     */
    private String bankOfficeAddress;
    /**
     * Поле Статус (работает/не работает)
     */
    private boolean bankOfficeStatus;
    /**
     * Поле Можно ли разместить банкомат? (да/нет)
     */
    private boolean bankOfficeDeploymentBankAtm;
    /**
     * Поле Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка)
     */
    private int bankOfficeCountBankAtm;
    /**
     * Поле Можно ли оформить кредит в данном офисе? (да/нет)
     */
    private boolean bankOfficeCredit;
    /**
     * Поле Работает ли на выдачу денег? (да/нет)
     */
    private boolean bankOfficePaymentOfTheMoney;
    /**
     * Поле Можно ли внести деньги? (да/нет)
     */
    private boolean bankOfficeDepositMoney;
    /**
     * Поле Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег в банке)
     */
    private Bank bankOfficeMoneyCapacity;
    /**
     * Поле Стоимость аренды банковского офиса
     */
    private int bankOfficeRentCost;
}

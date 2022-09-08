package tech.reliab.course.toropchinda.bank.entity;


import lombok.Data;

@Data
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
    private BankOfficeStatus bankOfficeStatus;
    /**
     * Поле Можно ли разместить банкомат? (да/нет)
     */
    private boolean isPossibleBankAtmPlaced;
    /**
     * Поле Кол-во банкоматов в данном офисе (напрямую зависит от общего числа банкоматов у банка)
     */
    private int bankOfficeCountBankAtm;
    /**
     * Поле Можно ли оформить кредит в данном офисе? (да/нет)
     */
    private boolean isPossibleCredit;
    /**
     * Поле Работает ли на выдачу денег? (да/нет)
     */
    private boolean isPossibleCashGet;
    /**
     * Поле Можно ли внести деньги? (да/нет)
     */
    private boolean isPossibleCashIn;
    /**
     * Поле Кол-во денег в банковском офисе (напрямую зависит от поля «Всего денег в банке)
     */
    private int bankOfficeMoneyCount;

    /**
     * Поле Стоимость аренды банковского офиса
     */
    private int bankOfficeRentCost;

    /**
     * Конструктор создание нового объекта офис банка
     */
    public BankOffice(int bankOfficeId, String bankOfficeName, String bankOfficeAddress, BankOfficeStatus bankOfficeStatus, boolean isPossibleBankAtmPlaced, int bankOfficeCountBankAtm, boolean isPossibleCredit, boolean isPossibleCashGet, boolean isPossibleCashIn, int bankOfficeMoneyCount, int bankOfficeRentCost) {
        this.bankOfficeId = bankOfficeId;
        this.bankOfficeName = bankOfficeName;
        this.bankOfficeAddress = bankOfficeAddress;
        this.bankOfficeStatus = bankOfficeStatus;
        this.isPossibleBankAtmPlaced = isPossibleBankAtmPlaced;
        this.bankOfficeCountBankAtm = bankOfficeCountBankAtm;
        this.isPossibleCredit = isPossibleCredit;
        this.isPossibleCashGet = isPossibleCashGet;
        this.isPossibleCashIn = isPossibleCashIn;
        this.bankOfficeMoneyCount = bankOfficeMoneyCount;
        this.bankOfficeRentCost = bankOfficeRentCost;
    }
}

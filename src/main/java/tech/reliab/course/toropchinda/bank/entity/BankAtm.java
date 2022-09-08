package tech.reliab.course.toropchinda.bank.entity;

import lombok.Data;

@Data
public class BankAtm {
    /**
     * Поле id банкомата
     */
    private int bankAtmId;
    /**
     * Поле Имя банкомата
     */
    private String bankAtmName;
    /**
     * Поле Адрес (сопадает с адресом банковского офиса)
     */
    private String bankAtmAddress;
    /**
     * Поле Статус (работает/не работает/нет денег)
     */
    private BankAtmStatus bankAtmStatus;
    /**
     * Поле Банк, которому принадлежит банкомат
     */
    private Bank bankAtmAcquiring;
    /**
     * Поле Расположение банкомата (банкомат может быть расположен только в банковском офисе)
     */
    private BankOffice bankAtmLocation;
    /**
     * Поле Обслуживающий сотрудник
     */
    private Employee bankAtmEmployee;
    /**
     * Поле Работает ли на выдачу денег? (да/нет)
     */
    private boolean isGiveMoney;
    /**
     * Поле Можно ли внести деньги? (да/нет)
     */
    private boolean isTakeMoney;
    /**
     * Поле Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке)
     */
    private int bankAtmMoneyCount;
    /**
     * Поле Стоимость обслуживания банкомата
     */
    private int bankAtmServiceCost;

    /**
     * Конструктор создание нового объекта банкомат
     * @param bankAtmId id банкомата
     * @param bankAtmName Имя банкомата
     * @param bankAtmStatus Статус банкомата
     * @param bankAtmAcquiring  Банк, которому принадлежит банкомат
     * @param bankAtmLocation Расположение банкомата
     * @param bankAtmEmployee Обслуживающий сотрудник
     * @param isGiveMoney Работает ли банкомат на выдачу денег
     * @param isTakeMoney Можно ли внести деньги в банкомат
     * @param bankAtmMoneyCount Кол-во денег в банкомате
     * @param bankAtmServiceCost Стоимость обслуживания банкомата
     */
    public BankAtm(int bankAtmId, String bankAtmName, BankAtmStatus bankAtmStatus, Bank bankAtmAcquiring, BankOffice bankAtmLocation, Employee bankAtmEmployee, boolean isGiveMoney, boolean isTakeMoney, int bankAtmMoneyCount, int bankAtmServiceCost) {
        this.bankAtmId = bankAtmId;
        this.bankAtmName = bankAtmName;
        this.bankAtmAddress = bankAtmLocation.getBankOfficeAddress();
        this.bankAtmStatus = bankAtmStatus;
        this.bankAtmAcquiring = bankAtmAcquiring;
        this.bankAtmLocation = bankAtmLocation;
        this.bankAtmEmployee = bankAtmEmployee;
        this.isGiveMoney = isGiveMoney;
        this.isTakeMoney = isTakeMoney;
        this.bankAtmMoneyCount = bankAtmMoneyCount;
        this.bankAtmServiceCost = bankAtmServiceCost;
    }
}

package tech.reliab.course.toropchinda.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankAtm {
    /**
     * Поле id банкомата
     */
    private int bankAtmId;
    /**
     * Поле Имя банкомата
     */
    private int bankAtmName;
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

    public BankAtm(int bankAtmId, int bankAtmName, BankAtmStatus bankAtmStatus, Bank bankAtmAcquiring, BankOffice bankAtmLocation, Employee bankAtmEmployee, boolean isGiveMoney, boolean isTakeMoney, int bankAtmMoneyCount, int bankAtmServiceCost) {
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

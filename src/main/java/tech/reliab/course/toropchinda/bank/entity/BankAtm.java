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
    private int bankName;
    /**
     * Поле Адрес (сопадает с адресом банковского офиса)
     */
    private BankOffice bankAtmIdAddress;
    /**
     * Поле Статус (работает/не работает/нет денег)
     */
    private String bankAtmIdStatus;
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
    private boolean bankAtmPaymentOfTheMoney;
    /**
     * Поле Можно ли внести деньги? (да/нет)
     */
    private boolean bankAtmDepositMoney;
    /**
     * Поле Кол-во денег в банкомате (напрямую зависит от поля «Всего денег в банке)
     */
    private Bank bankAtmMoneyCapacity;
    /**
     * Поле Стоимость обслуживания банкомата
     */
    private int bankAtmServiceCost;


}

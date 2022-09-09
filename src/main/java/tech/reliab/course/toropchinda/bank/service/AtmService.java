package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.*;

public interface AtmService {

    /**
     * Создание нового банкомата с помещением его в коллекцию в сервисе
     * @param bankAtmId id банкомата
     * @param bankAtmName имя банкомата
     * @param bankAtmStatus статус банкомата
     * @param bankAtmAcquiring принимает ли
     * @param bankAtmLocation Расположение банкомата
     * @param bankAtmEmployee обслуживающий сотрудник
     * @param isGiveMoney Работает ли на выдачу денег
     * @param isTakeMoney Можно ли внести деньги
     * @param bankAtmMoneyCount Кол-во денег в банкомате
     * @param bankAtmServiceCost Стоимость обслуживания банкомата
     * @return
     */
    BankAtm createBankAtm(
            int bankAtmId,
            String bankAtmName,
            BankAtmStatus bankAtmStatus,
            Bank bankAtmAcquiring,
            BankOffice bankAtmLocation,
            Employee bankAtmEmployee,
            boolean isGiveMoney,
            boolean isTakeMoney,
            int bankAtmMoneyCount,
            int bankAtmServiceCost
    );

    /**
     * Добавление в коллекцию в сервисе банкомата, который уже был где-то создан
     * @param atm
     */
    void addBankAtm(BankAtm atm);

    /**
     * Получение банкомата по id
     * @param id id банкомата
     * @return банкомат или null
     */
    BankAtm getBankAtm(int id);

    /**
     * Получение банкомата по имени
     * @param name имя банкомата
     * @return банкомат или null
     */
    BankAtm getBankAtm(String name);

    /**
     * Перезапись банкомата новым, с изменёнными полями
     * @param atm
     */
    void updateBankAtm(BankAtm atm);

    /**
     * Удаление банкомата из коллекции в сервисе по id
     * @param bankAtmId
     */
    void deleteBankAtm(int bankAtmId);

}

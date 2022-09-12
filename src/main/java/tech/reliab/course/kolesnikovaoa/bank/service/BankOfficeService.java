package tech.reliab.course.kolesnikovaoa.bank.service;

import tech.reliab.course.kolesnikovaoa.bank.entity.BankOffice;
import tech.reliab.course.kolesnikovaoa.bank.entity.BankOfficeStatus;

public interface BankOfficeService {
    /**
     * Cоздание нового офиса банка с помещением его в коллекцию в сервисе
     * @param bankOfficeId
     * @param bankOfficeName
     * @param bankOfficeAddress
     * @param bankOfficeStatus
     * @param isPossibleBankAtmPlaced
     * @param bankOfficeCountBankAtm
     * @param isPossibleCredit
     * @param isPossibleCashGet
     * @param isPossibleCashIn
     * @param bankOfficeMoneyCount
     * @param bankOfficeRentCost
     * @return
     */
    BankOffice createBankOffice(int bankOfficeId,
                          String bankOfficeName,
                          String bankOfficeAddress,
                          BankOfficeStatus bankOfficeStatus,
                          boolean isPossibleBankAtmPlaced,
                          int bankOfficeCountBankAtm,
                          boolean isPossibleCredit,
                          boolean isPossibleCashGet,
                          boolean isPossibleCashIn,
                          int bankOfficeMoneyCount,
                          int bankOfficeRentCost);

    /**
     * Добавление в коллекцию в сервисе офиса банка, который уже был где-то создан
     * @param office
     */
   void addBankOffice(BankOffice office);

    /**
     * Получение офиса банка по id
     * @param id
     * @return
     */
    BankOffice getBankOffice(int id);

    /**
     * Получение офиса банка по имени
     * @param name
     * @return
     */
    BankOffice getBankOffice(String name);

    /**
     * Перезапись офиса банка новым, с изменёнными полями
     * @param bankOffice
     */
    void updateBankOffice(BankOffice bankOffice);

    /**
     * Удаление банкомата из коллекции в сервисе по id
     * @param id
     */
    void deleteBankOffice(int id);

    /**
     * Удаление банкомата из коллекции в сервисе по имени
     * @param name
     */
    void deleteBankOffice(String name);

}

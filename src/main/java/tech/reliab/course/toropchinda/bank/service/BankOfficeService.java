package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.BankOfficeStatus;

public interface BankOfficeService {
    /**
     * создать новый офис
     * получить офис по id
     * получить офис по имени
     * изменить офис по id
     * удалить офис по имени
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

    BankOffice getBankOffice(int id);

    BankOffice getBankOffice(String name);

    void updateBankOffice(int bankOfficeId,
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

    void deleteBankOffice(int id);

    void deleteBankOffice(String name);

}

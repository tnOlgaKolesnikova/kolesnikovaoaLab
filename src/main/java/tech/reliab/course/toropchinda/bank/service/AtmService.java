package tech.reliab.course.toropchinda.bank.service;

import tech.reliab.course.toropchinda.bank.entity.*;

public interface AtmService {
    /**
     * получить банкомат по id
     * получить банкомат по имени
     * создать банкомат
     * удалить банкомат
     * обновить банкомат
     */
    BankAtm getBankAtm(int id);

    BankAtm getBankAtm(String name);

    void createBankAtm(int bankAtmId,
                       String bankAtmName,
                       BankAtmStatus bankAtmStatus,
                       Bank bankAtmAcquiring,
                       BankOffice bankAtmLocation,
                       Employee bankAtmEmployee,
                       boolean isGiveMoney,
                       boolean isTakeMoney,
                       int bankAtmMoneyCount,
                       int bankAtmServiceCost);

    void deleteBankAtm(int bankAtmId);

    void deleteBankAtm(String bankAtmName);

    void updateBankAtm(int bankAtmId,
                       String bankAtmName,
                       BankAtmStatus bankAtmStatus,
                       Bank bankAtmAcquiring,
                       BankOffice bankAtmLocation,
                       Employee bankAtmEmployee,
                       boolean isGiveMoney,
                       boolean isTakeMoney,
                       int bankAtmMoneyCount,
                       int bankAtmServiceCost);

}

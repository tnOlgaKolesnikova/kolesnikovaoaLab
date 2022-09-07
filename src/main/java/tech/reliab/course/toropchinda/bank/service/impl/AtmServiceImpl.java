package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.*;
import tech.reliab.course.toropchinda.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    private BankAtm bankAtms;

    public AtmServiceImpl() {
        this.bankAtms = null;
    }

    @Override
    public BankAtm getBankAtm(int id) {
        if (this.bankAtms.getBankAtmId() == id) {
            return this.bankAtms;
        }
        return null;
    }

    @Override
    public BankAtm getBankAtm(String name) {
        if (this.bankAtms.getBankAtmName().equals(name)) {
            return this.bankAtms;
        }
        return null;
    }

    @Override
    public void createBankAtm(int bankAtmId,
                              String bankAtmName,
                              BankAtmStatus bankAtmStatus,
                              Bank bankAtmAcquiring,
                              BankOffice bankAtmLocation,
                              Employee bankAtmEmployee,
                              boolean isGiveMoney,
                              boolean isTakeMoney,
                              int bankAtmMoneyCount,
                              int bankAtmServiceCost) {
        this.bankAtms = new BankAtm(
                bankAtmId,
                bankAtmName,
                bankAtmStatus,
                bankAtmAcquiring,
                bankAtmLocation,
                bankAtmEmployee,
                isGiveMoney,
                isTakeMoney,
                bankAtmMoneyCount,
                bankAtmServiceCost);
    }

    @Override
    public void deleteBankAtm(int bankAtmId) {
        if (this.bankAtms.getBankAtmId() == bankAtmId) {
            this.bankAtms = null;
        }
    }

    @Override
    public void deleteBankAtm(String bankAtmName) {
        if (this.bankAtms.getBankAtmName().equals(bankAtmName)) {
            this.bankAtms = null;
        }
    }

    @Override
    public void updateBankAtm(int bankAtmId, String bankAtmName, BankAtmStatus bankAtmStatus, Bank bankAtmAcquiring, BankOffice bankAtmLocation, Employee bankAtmEmployee, boolean isGiveMoney, boolean isTakeMoney, int bankAtmMoneyCount, int bankAtmServiceCost) {
        this.bankAtms.setBankAtmId(bankAtmId);
        this.bankAtms.setBankAtmName(bankAtmName);
        this.bankAtms.setBankAtmStatus(bankAtmStatus);
        this.bankAtms.setBankAtmAcquiring(bankAtmAcquiring);
        this.bankAtms.setBankAtmLocation(bankAtmLocation);
        this.bankAtms.setBankAtmEmployee(bankAtmEmployee);
        this.bankAtms.setGiveMoney(isGiveMoney);
        this.bankAtms.setTakeMoney(isTakeMoney);
        this.bankAtms.setBankAtmMoneyCount(bankAtmMoneyCount);
        this.bankAtms.setBankAtmServiceCost(bankAtmServiceCost);
    }
}

package tech.reliab.course.kolesnikovaoa.bank.service.impl;

import tech.reliab.course.kolesnikovaoa.bank.entity.*;
import tech.reliab.course.kolesnikovaoa.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    private BankAtm bankAtms;

    public AtmServiceImpl() {
        this.bankAtms = null;
    }

    @Override
    public BankAtm createBankAtm(int bankAtmId,
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
        return this.bankAtms;
    }

    @Override
    public void addBankAtm(BankAtm atm){
        this.bankAtms = atm;
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
    public void updateBankAtm(BankAtm atm){
        if(this.bankAtms.getBankAtmId() == atm.getBankAtmId()){
            this.bankAtms = atm;
        }
    }

    @Override
    public void deleteBankAtm(int bankAtmId) {
        if (this.bankAtms.getBankAtmId() == bankAtmId) {
            this.bankAtms = null;
        }
    }
}

package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.BankAtm;
import tech.reliab.course.toropchinda.bank.entity.BankOffice;
import tech.reliab.course.toropchinda.bank.entity.BankOfficeStatus;
import tech.reliab.course.toropchinda.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {
    private BankOffice bankOffices;

    public BankOfficeServiceImpl() {
        this.bankOffices = null;
    }

    @Override
    public BankOffice createBankOffice(int bankOfficeId,
                                 String bankOfficeName,
                                 String bankOfficeAddress,
                                 BankOfficeStatus bankOfficeStatus,
                                 boolean isPossibleBankAtmPlaced,
                                 int bankOfficeCountBankAtm,
                                 boolean isPossibleCredit,
                                 boolean isPossibleCashGet,
                                 boolean isPossibleCashIn,
                                 int bankOfficeMoneyCount,
                                 int bankOfficeRentCost) {
        this.bankOffices = new BankOffice(bankOfficeId, bankOfficeName, bankOfficeAddress, bankOfficeStatus, isPossibleBankAtmPlaced, bankOfficeCountBankAtm, isPossibleCredit, isPossibleCashGet, isPossibleCashIn, bankOfficeMoneyCount, bankOfficeRentCost);
        return this.bankOffices;
    }

    @Override
    public BankOffice getBankOffice(int id) {
        if (this.bankOffices.getBankOfficeId() == id) {
            return this.bankOffices;
        }
        return null;
    }

    @Override
    public BankOffice getBankOffice(String name) {
        if (this.bankOffices.getBankOfficeName().equals(name)) {
            return this.bankOffices;
        }
        return null;
    }

    @Override
    public void updateBankOffice(int bankOfficeId,
                                 String bankOfficeName,
                                 String bankOfficeAddress,
                                 BankOfficeStatus bankOfficeStatus,
                                 boolean isPossibleBankAtmPlaced,
                                 int bankOfficeCountBankAtm,
                                 boolean isPossibleCredit,
                                 boolean isPossibleCashGet,
                                 boolean isPossibleCashIn,
                                 int bankOfficeMoneyCount,
                                 int bankOfficeRentCost) {
        this.bankOffices.setBankOfficeId(bankOfficeId);
        this.bankOffices.setBankOfficeName(bankOfficeName);
        this.bankOffices.setBankOfficeAddress(bankOfficeAddress);
        this.bankOffices.setBankOfficeStatus(bankOfficeStatus);
        this.bankOffices.setPossibleBankAtmPlaced(isPossibleBankAtmPlaced);
        this.bankOffices.setBankOfficeCountBankAtm(bankOfficeCountBankAtm);
        this.bankOffices.setPossibleCredit(isPossibleCredit);
        this.bankOffices.setPossibleCashGet(isPossibleCashGet);
        this.bankOffices.setPossibleCashIn(isPossibleCashIn);
        this.bankOffices.setBankOfficeMoneyCount(bankOfficeMoneyCount);
        this.bankOffices.setBankOfficeRentCost(bankOfficeRentCost);
    }

    @Override
    public void deleteBankOffice(int id) {
        if (this.bankOffices.getBankOfficeId() == id) {
            this.bankOffices = null;
        }
    }

    @Override
    public void deleteBankOffice(String name) {
        if (this.bankOffices.getBankOfficeName().equals(name)) {
            this.bankOffices = null;
        }
    }


}

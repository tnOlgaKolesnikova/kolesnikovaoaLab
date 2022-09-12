package tech.reliab.course.kolesnikovaoa.bank.service.impl;
import tech.reliab.course.kolesnikovaoa.bank.entity.BankOffice;
import tech.reliab.course.kolesnikovaoa.bank.entity.BankOfficeStatus;
import tech.reliab.course.kolesnikovaoa.bank.service.BankOfficeService;

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
    public void addBankOffice(BankOffice office) {
        this.bankOffices = office;
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
    public void updateBankOffice(BankOffice bankOffice) {
        if(this.bankOffices.getBankOfficeId() == bankOffice.getBankOfficeId()){
            this.bankOffices = bankOffice;
        }
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

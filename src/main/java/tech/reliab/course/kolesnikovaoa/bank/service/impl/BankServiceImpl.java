package tech.reliab.course.kolesnikovaoa.bank.service.impl;

import tech.reliab.course.kolesnikovaoa.bank.entity.Bank;
import tech.reliab.course.kolesnikovaoa.bank.service.BankService;

public class BankServiceImpl implements BankService {

    private Bank banks;

    public BankServiceImpl() {
        this.banks = null;
    }

    @Override
    public Bank createBank(String name) {
        this.banks = new Bank(1, name);
        return this.banks;
    }

    @Override
    public void addBank(Bank bank) {
        this.banks = bank;
    }

    @Override
    public Bank getBank(int id) {
        if (this.banks.getBankId() == id) {
            return this.banks;
        } else {
            return null;
        }
    }

    @Override
    public Bank getBank(String name) {
        if (this.banks.getBankName().equals(name)) {
            return this.banks;
        } else {
            return null;
        }
    }

    @Override
    public void updateBank(Bank bank) {
        if (this.banks.getBankId() == bank.getBankId()) {
            this.banks = bank;
        }
    }

    @Override
    public void deleteBank(String name) {
        this.banks = null;
    }
}

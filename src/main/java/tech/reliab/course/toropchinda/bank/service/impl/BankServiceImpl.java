package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.service.BankService;

public class BankServiceImpl implements BankService {

    private Bank banks;

    public BankServiceImpl(){
        this.banks = null;
    }

    @Override
    public Bank getBank(int id) {
        if (this.banks.getBankId() == id){
            return this.banks;
        } else {
            return null;
        }
    }

    @Override
    public Bank getBank(String name) {
        if (this.banks.getBankName().equals(name)){
            return this.banks;
        } else {
            return null;
        }
    }

    @Override
    public Bank addBank(String name) {
        this.banks = new Bank(1, name);
        return this.banks;
    }

    @Override
    public void deleteBank(String name) {
        this.banks = null;
    }
    @Override
    public void updateBank(Bank banks)
    {

    }

    @Override
    public void addOfficeInBank(String name) {
        if(this.banks.getBankName().equals(name)){
            this.banks.setBankOfficeCount(this.banks.getBankOfficeCount()+1);
        }
    }

    @Override
    public void deleteOfficeInBank(String name) {
        if(this.banks.getBankName().equals(name) && this.banks.getBankOfficeCount() >= 1){
            this.banks.setBankOfficeCount(this.banks.getBankOfficeCount()-1);
        }
    }
    @Override
    public void addBankAtm(String name) {
        if(this.banks.getBankName().equals(name)){
            this.banks.setBankAtmCount(this.banks.getBankAtmCount()+1);
        }
    }
    @Override
    public void deleteAtmInBank(String name) {
        if(this.banks.getBankName().equals(name) && this.banks.getBankAtmCount() >= 1){
            this.banks.setBankAtmCount(this.banks.getBankAtmCount()-1);
        }



}


}

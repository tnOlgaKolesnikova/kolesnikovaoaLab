package tech.reliab.course.kolesnikovaoa.bank.service.impl;

import tech.reliab.course.kolesnikovaoa.bank.entity.CreditAccount;
import tech.reliab.course.kolesnikovaoa.bank.entity.Employee;
import tech.reliab.course.kolesnikovaoa.bank.entity.User;
import tech.reliab.course.kolesnikovaoa.bank.service.CreditAccountService;

import java.time.LocalDate;

public class CreditAccountServiceImpl implements CreditAccountService {
    private CreditAccount creditAccounts;

    public CreditAccountServiceImpl(){
        this.creditAccounts = null;
    }

    @Override
    public CreditAccount createCreditAccount(int id,
                                             User user,
                                             String bankName,
                                             LocalDate startDate,
                                             LocalDate endDate,
                                             int creditAmount,
                                             int creditBankRate,
                                             Employee creditIssuer,
                                             String loanRepayment) {
        this.creditAccounts = new CreditAccount(
                id,
                user,
                bankName,
                startDate,
                endDate,
                creditAmount,
                creditBankRate,
                creditIssuer,
                loanRepayment);
        return this.creditAccounts;
    }

    @Override
    public void addCreditAccount(CreditAccount creditAccount) {
        this.creditAccounts = creditAccount;

    }

    @Override
    public CreditAccount getCreditAccount(int id) {
        if (this.creditAccounts.getCreditAccountId() == id) {
            return this.creditAccounts;
        }
        return null;
    }

    @Override
    public void updateCreditAccount(CreditAccount creditAccounts) {
        if(this.creditAccounts.getCreditAccountId() == creditAccounts.getCreditAccountId()){
            this.creditAccounts = creditAccounts;
        }
    }

    @Override
    public void deleteCreditAccount(int id) {
        if (this.creditAccounts.getCreditAccountId() == id) {
            this.creditAccounts = null;
        }
    }
}

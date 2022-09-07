package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    private PaymentAccount paymentAccounts;

    @Override
    public PaymentAccount getPaymentAccount(int id) {
        if (this.paymentAccounts.getPaymentAccountId() == id){
            return this.paymentAccounts;
        } else {
            return null;
        }
    }


}


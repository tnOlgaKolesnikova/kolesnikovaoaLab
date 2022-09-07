package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.Bank;
import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    private PaymentAccount paymentAccounts;

    @Override
    public PaymentAccount getPaymentAccount(int id) {
        if (this.paymentAccounts.getPaymentAccountId() == id) {
            return this.paymentAccounts;
        } else {
            return null;
        }
    }

    @Override
    public PaymentAccount addPaymentAccount(int id, User user, String bankName) {
        this.paymentAccounts = new PaymentAccount(id, user, bankName);
        return this.paymentAccounts;
    }

    @Override
    public void updatePaymentAccount(PaymentAccount paymentAccounts) {

    }

    @Override
    public void deletePaymentAccount(int id) {

    }


}


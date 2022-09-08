package tech.reliab.course.toropchinda.bank.service.impl;

import tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import tech.reliab.course.toropchinda.bank.entity.User;
import tech.reliab.course.toropchinda.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    private PaymentAccount paymentAccounts;

    public PaymentAccountServiceImpl() {
        this.paymentAccounts = null;
    }

    @Override
    public PaymentAccount createPaymentAccount(int id, User user, String bankName) {
        this.paymentAccounts = new PaymentAccount(id, user, bankName);
        return this.paymentAccounts;
    }

    @Override
    public void addPaymentAccount(PaymentAccount acc) {
        if (this.paymentAccounts.getPaymentAccountId() == acc.getPaymentAccountId()) {
            this.paymentAccounts = acc;
        }
    }

    @Override
    public PaymentAccount getPaymentAccount(int id) {
        if (this.paymentAccounts.getPaymentAccountId() == id) {
            return this.paymentAccounts;
        } else {
            return null;
        }
    }

    @Override
    public void updatePaymentAccount(PaymentAccount paymentAccounts) {
        if (this.paymentAccounts.getPaymentAccountId() == paymentAccounts.getPaymentAccountId()) {
            this.paymentAccounts = paymentAccounts;
        }
    }

    @Override
    public void deletePaymentAccount(int id) {
        if (this.paymentAccounts.getPaymentAccountId() == id) {
            this.paymentAccounts = null;
        }
    }
}


package com.aston.snowboard.services;

import com.aston.snowboard.domain.Payment;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface PaymentService {

    Iterable<Payment> listAllPayments();

    Payment getPaymentById(Integer id);

    Payment savePayment(Payment payment);

    Iterable<Payment> savePaymentList(Iterable<Payment> paymentIterable);

    void deletePayment(Integer id);
}

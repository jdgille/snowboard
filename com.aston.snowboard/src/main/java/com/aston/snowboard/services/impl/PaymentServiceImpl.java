package com.aston.snowboard.services.impl;

import com.aston.snowboard.domain.Payment;
import com.aston.snowboard.repositories.PaymentRepository;
import com.aston.snowboard.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Iterable<Payment> listAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentRepository.findOne(id);
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Iterable<Payment> savePaymentList(Iterable<Payment> paymentIterable) {
        return paymentRepository.save(paymentIterable);
    }

    @Override
    public void deletePayment(Integer id) {
        paymentRepository.delete(id);
    }
}

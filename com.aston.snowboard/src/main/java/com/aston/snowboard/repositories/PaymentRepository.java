package com.aston.snowboard.repositories;

import com.aston.snowboard.domain.Payment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}

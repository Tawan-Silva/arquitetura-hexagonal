package com.tawandev.hexagonal.application.ports.out;

import com.tawandev.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}

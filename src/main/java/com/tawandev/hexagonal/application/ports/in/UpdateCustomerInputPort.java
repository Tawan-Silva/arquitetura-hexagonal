package com.tawandev.hexagonal.application.ports.in;

import com.tawandev.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipcode);
}

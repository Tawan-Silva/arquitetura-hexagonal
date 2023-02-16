package com.tawandev.hexagonal.application.ports.in;

import com.tawandev.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}

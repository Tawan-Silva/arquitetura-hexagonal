package com.tawandev.hexagonal.application.ports.in;

import com.tawandev.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}

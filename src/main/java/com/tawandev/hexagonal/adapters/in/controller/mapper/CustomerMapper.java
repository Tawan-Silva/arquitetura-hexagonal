package com.tawandev.hexagonal.adapters.in.controller.mapper;

import com.tawandev.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.tawandev.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.tawandev.hexagonal.application.core.domain.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    @Autowired
    private ModelMapper mapper;


    public Customer toCustomer(CustomerRequest customerRequest) {
        return mapper.map(customerRequest, Customer.class);
    }

    public CustomerResponse toCustomerResponse(Customer customer) {
        return mapper.map(customer, CustomerResponse.class);
    }
}

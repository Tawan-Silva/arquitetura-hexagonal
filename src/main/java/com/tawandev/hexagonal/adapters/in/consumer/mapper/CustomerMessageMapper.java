package com.tawandev.hexagonal.adapters.in.consumer.mapper;

import com.tawandev.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.tawandev.hexagonal.application.core.domain.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerMessageMapper {

    @Autowired
    private ModelMapper mapper;

    public Customer toCustomer(CustomerMessage customerMessage) {
        return mapper.map(customerMessage, Customer.class);
    }
}

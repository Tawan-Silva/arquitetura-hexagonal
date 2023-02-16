package com.tawandev.hexagonal.adapters.out.client.repository.mapper;

import com.tawandev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.tawandev.hexagonal.application.core.domain.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerEntityMapper {

    @Autowired
    private ModelMapper mapper;


    public CustomerEntity toCustomerEntity(Customer customer) {
        return mapper.map(customer, CustomerEntity.class);
    }

    public Customer toCustomer(CustomerEntity customerEntity) {
        return mapper.map(customerEntity, Customer.class);
    }
}

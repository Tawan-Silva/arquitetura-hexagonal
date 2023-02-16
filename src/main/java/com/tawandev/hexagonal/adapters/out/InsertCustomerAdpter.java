package com.tawandev.hexagonal.adapters.out;

import com.tawandev.hexagonal.adapters.out.client.repository.CustomerRepository;
import com.tawandev.hexagonal.adapters.out.client.repository.mapper.CustomerEntityMapper;
import com.tawandev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.tawandev.hexagonal.application.core.domain.Customer;
import com.tawandev.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdpter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}

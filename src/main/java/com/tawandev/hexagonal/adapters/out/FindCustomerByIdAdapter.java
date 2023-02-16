package com.tawandev.hexagonal.adapters.out;

import com.tawandev.hexagonal.adapters.out.client.repository.CustomerRepository;
import com.tawandev.hexagonal.adapters.out.client.repository.mapper.CustomerEntityMapper;
import com.tawandev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.tawandev.hexagonal.application.core.domain.Customer;
import com.tawandev.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}

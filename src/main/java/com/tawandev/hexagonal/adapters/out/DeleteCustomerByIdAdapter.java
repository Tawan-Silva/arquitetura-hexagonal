package com.tawandev.hexagonal.adapters.out;

import com.tawandev.hexagonal.adapters.out.client.repository.CustomerRepository;
import com.tawandev.hexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}

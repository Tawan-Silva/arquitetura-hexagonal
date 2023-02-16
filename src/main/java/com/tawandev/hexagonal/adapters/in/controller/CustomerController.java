package com.tawandev.hexagonal.adapters.in.controller;

import com.tawandev.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.tawandev.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.tawandev.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.tawandev.hexagonal.application.core.domain.Customer;
import com.tawandev.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.tawandev.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.tawandev.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.tawandev.hexagonal.application.ports.in.UpdateCustomerInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,
                                       @Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }

}

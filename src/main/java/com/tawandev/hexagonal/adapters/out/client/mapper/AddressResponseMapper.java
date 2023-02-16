package com.tawandev.hexagonal.adapters.out.client.mapper;


import com.tawandev.hexagonal.adapters.out.client.response.AddressResponse;
import com.tawandev.hexagonal.application.core.domain.Address;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressResponseMapper {

    @Autowired
    private ModelMapper mapper;

    public Address toAddress(AddressResponse addressResponse) {
        return mapper.map(addressResponse, Address.class);
    }
}

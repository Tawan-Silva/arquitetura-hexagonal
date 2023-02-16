package com.tawandev.hexagonal.application.ports.out;

import com.tawandev.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}

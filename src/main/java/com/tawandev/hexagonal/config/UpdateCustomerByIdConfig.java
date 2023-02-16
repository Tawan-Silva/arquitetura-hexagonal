package com.tawandev.hexagonal.config;

import com.tawandev.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.tawandev.hexagonal.adapters.out.UpdateCustomerAdpter;
import com.tawandev.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.tawandev.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerByIdConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdpter updateCustomerAdpter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdpter);
    }
}

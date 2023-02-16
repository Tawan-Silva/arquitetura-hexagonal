package com.tawandev.hexagonal.config;

import com.tawandev.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.tawandev.hexagonal.adapters.out.InsertCustomerAdpter;
import com.tawandev.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.tawandev.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdpter insertCustomerAdpter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdpter, sendCpfValidationAdapter);
    }
}

package com.tawandev.hexagonal.application.core.usecase;

import com.tawandev.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.tawandev.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.tawandev.hexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutPutPort = deleteCustomerByIdOutPutPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutPutPort.delete(id);
    }
}

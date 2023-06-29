package com.devsuperior.dscommerce.services.execeptions;

public class ResourceNotFoundExecption extends RuntimeException {
    public ResourceNotFoundExecption(String msg) {
        super(msg);
    }
}

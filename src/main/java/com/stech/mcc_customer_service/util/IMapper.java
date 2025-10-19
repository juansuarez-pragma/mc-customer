package com.stech.mcc_customer_service.util;

public interface IMapper<T> {

    T getDto();

    void setData(T t);
}

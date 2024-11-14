package com.dpv.entregable02.CustomerMs.mappers;

import com.dpv.entregable02.CustomerMs.domain.Customer;
import com.dpv.entregable02.CustomerMs.dto.CustomerResponse;

import java.util.List;

public class CustomerMapper {
    public static CustomerResponse mapToCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .name(customer.getName())
                .lastName(customer.getLastName())
                .dni(customer.getDni())
                .email(customer.getEmail())
                .build();
    }

    public static List<CustomerResponse> mapToListCustomerResponse(List<Customer> customerList) {
        return customerList.stream()
                .map(CustomerMapper::mapToCustomerResponse)
                .toList();
    }
}

package com.dpv.entregable02.CustomerMs.controllers;

import com.dpv.entregable02.CustomerMs.domain.Customer;
import com.dpv.entregable02.CustomerMs.dto.CustomerRequest;
import com.dpv.entregable02.CustomerMs.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/customer")
    public Customer registerCustomer(@RequestBody CustomerRequest customerRequest) {
        return customerService.registerCustomer(customerRequest);
    }

    @GetMapping("/customers")
    public List<Customer> listCustomers() {
        return customerService.listCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer findCustomerId(@PathVariable Long id) {
        return customerService.findCustomerId(id);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody CustomerRequest customerRequest) {
        return customerService.updateCustomer(id, customerRequest);
    }

    @DeleteMapping("/customers/{id}")
    public boolean deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }
}

package com.Sunil.Service;

import com.Sunil.Modal.Customer;
import com.Sunil.Reposiory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;
    public List<Customer> getAllCust()
    {
        List<Customer>customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }
}

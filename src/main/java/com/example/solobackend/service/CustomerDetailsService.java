package com.example.solobackend.service;

import com.example.solobackend.model.CustomerDetails;
import com.example.solobackend.repository.CustomerDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerDetailsService {

    private final CustomerDetailsRepository customerDetailsRepository;

    public CustomerDetailsService(CustomerDetailsRepository customerDetailsRepository) {
        this.customerDetailsRepository = customerDetailsRepository;
    }

    public List<CustomerDetails> getAll() {
        return customerDetailsRepository.findAll();
    }

    public CustomerDetails postCustomer(CustomerDetails customerDetails) {
        return customerDetailsRepository.save(customerDetails);
    }

    public Optional<CustomerDetails> getCustomer(Long id) {
        return customerDetailsRepository.findById(id);
    }
}
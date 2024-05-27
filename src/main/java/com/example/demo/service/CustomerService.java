package com.example.demo.service;

import com.example.demo.dto.response.CustomerResponseDTO;
import com.example.demo.dto.response.StatusDto;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public record CustomerService(@Autowired CustomerRepository customerRepository) {

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerResponseDTO getListCustomer() {

        List<Customer> getList = customerRepository.findAllDataCustomer();

        //Status
        List<StatusDto> status = new ArrayList<>();
        status.add(new StatusDto(0, "SUCCESS"));
        status.add(new StatusDto(1, "FAILED"));

        return CustomerResponseDTO.builder()
                .data(getList)
                .status(status)
                .build();
    }
}

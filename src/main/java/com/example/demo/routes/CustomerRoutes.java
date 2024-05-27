package com.example.demo.routes;


import com.example.demo.dto.response.CustomerResponseDTO;
import com.example.demo.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public record CustomerRoutes(@Autowired CustomerService customerService) {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRoutes.class);

    public CustomerRoutes(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public ResponseEntity<CustomerResponseDTO> findListCustomer() {
        return ResponseEntity.ok(customerService.getListCustomer());
    }
}

package com.paymentchain.customer.controller;

import com.paymentchain.customer.repository.CustomerRepository;
import com.paymentchain.customer.entities.Customer;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @GetMapping()
    public List<Customer> findAll () {
        
        return customerRepository.findAll();
        
    }
    
    @GetMapping("/{id}")
    public Object get (@PathVariable String id) {
        
        return null;
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put (@PathVariable String id, @RequestBody Customer input) {
        
        return null;
        
    }
    
    @PostMapping
    public ResponseEntity<?> post (@RequestBody Customer input) {
        
        Customer customer = customerRepository.save(input);
        return ResponseEntity.ok(customer);
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable String id) {
        
        return null;
        
    }
    
}

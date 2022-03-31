package com.example.mydemo.controller;

import com.example.mydemo.dto.OrderRequest;
import com.example.mydemo.dto.OrderResponse;
import com.example.mydemo.entity.Customer;
import com.example.mydemo.repository.CustomerRepository;
import com.example.mydemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/students")
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();

    }
    @GetMapping("/getInformation")
    public List<OrderResponse> getJoinInformation (){
        return customerRepository.getJoinInformation();

    }

}

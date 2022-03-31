package com.example.mydemo.repository;

import com.example.mydemo.dto.OrderResponse;
import com.example.mydemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("SELECT new com.example.mydemo.dto.OrderResponse (c.name, p.product_name) from Customer c join c.products p")
    public List<OrderResponse> getJoinInformation();
}


//public interface CustomerRepository extends JpaRepository<Customer, Integer>{
//    @Query("Select c.name, p.product_name from Customer c join c.products p")
//    List<OrderResponse> getJoinInformation();
//}

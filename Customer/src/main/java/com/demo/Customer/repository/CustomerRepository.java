package com.demo.Customer.repository;
import com.demo.Customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

// Marker interface for CRUD operations
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}

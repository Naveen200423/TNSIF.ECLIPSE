package com.demo.Customer;

import com.demo.Customer.entity.Customer;
import com.demo.Customer.entity.OrderDetails;
import com.demo.Customer.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class CustomerApplicationTests {

    @Autowired
    private CustomerService customerService;

    @Test
    void demoCustomerCRUD() {
        System.out.println("=== CUSTOMER DEMO START ===");

        // Create Customer
        Customer customer = new Customer();
        customer.setName("Alice");
        customer.setPhone("9876543210");
        customer.setEmail("alice@example.com");

        OrderDetails order = new OrderDetails();
        order.setProduct("Keyboard");
        order.setQuantity(1);

        customer.setOrders(Arrays.asList(order));

        Customer saved = customerService.saveCustomer(customer);
        System.out.println("Saved Customer ID: " + saved.getId());

        // Get All Customers
        List<Customer> allCustomers = customerService.getAllCustomers();
        allCustomers.forEach(c -> System.out.println("Customer: " + c.getName()));

        // Get Customer by ID
        Optional<Customer> fetched = customerService.getCustomerById(saved.getId());
        fetched.ifPresent(c -> System.out.println("Fetched Customer: " + c.getName()));

        // Delete Customer
        customerService.deleteCustomer(saved.getId());
        System.out.println("Deleted Customer ID: " + saved.getId());

        System.out.println("=== CUSTOMER DEMO END ===");
    }
}

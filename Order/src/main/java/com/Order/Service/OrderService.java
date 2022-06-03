package com.Order.Service;

import com.Order.Modal.Order;
import com.Order.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    @Autowired public OrderRepository orderRepository;
    public List<Order> getOrder()
    {
        List<Order>customers = new ArrayList<>();
        orderRepository.findAll().forEach(customers::add);
        return customers;
    }
}

package com.Order.Controller;

import com.Order.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    public OrderService orderService;
    @GetMapping("/getOrder")
    public ResponseEntity<?> getOrder()
    {
        List list = new ArrayList();
        list = orderService.getOrder();
        return new ResponseEntity<>(list, HttpStatus.OK );
    }
}

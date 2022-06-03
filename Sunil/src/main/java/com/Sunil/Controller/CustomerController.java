package com.Sunil.Controller;

import com.Sunil.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CustomerController {

    RestTemplate restTemplate = new RestTemplate();


    @Autowired public CustomerService customerService;
    @GetMapping("/getcust")
    public ResponseEntity<?> getCustomer()
    {
        List customer = new ArrayList<>();
        customer = customerService.getAllCust();
        List order = this.restTemplate.getForObject("http://localhost:8082/getOrder",List.class);
        HashMap<String,Object> map = new HashMap<>();
        map.put("1",customer);
        map.put("2",order);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}

package com.Sunil.Modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {
    @Id
    private int cust_id;
    private String cust_name;
    Customer()
    {

    }
}

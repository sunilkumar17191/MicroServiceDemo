package com.Order.Modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "order_detail")
public class Order {
    @Id
    private int order_id;
    private String order_name;
    private int cust_id;
    Order()
    {

    }
}

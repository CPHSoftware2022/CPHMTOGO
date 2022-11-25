package com.exam2022.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customerOrderItems")
@AllArgsConstructor
@NoArgsConstructor
public class orderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_order_id", nullable = false)
    private Long id;

    @Column(name = "item_id")
    private Long item_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }
}

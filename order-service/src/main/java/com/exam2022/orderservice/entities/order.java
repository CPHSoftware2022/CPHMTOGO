package com.exam2022.orderservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(schema = "customerOrder")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerOrder_id", nullable = false)
    private Long id;

    @Column(name = "order_start")
    private Date order_start;

    @Column(name = "order_end")
    private Date order_end;

    @Column(name = "total_price", nullable = false)
    private double total_price;

    @Column(name = "accepted")
    private boolean accepted;

    @Column(name = "canceled_reason")
    private String canceled_reason;

    @Column(name = "delivered")
    private boolean delivered;

    @Column(name = "customer_id", nullable = false)
    private Long customer_id;

    @Column(name = "restaurant_id", nullable = false)
    private Long restaurant_id;

    @Column(name = "feedback_id")
    private Long feedback_id;

    @Column(name = "employee_id")
    private Long employee_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrder_start() {
        return order_start;
    }

    public void setOrder_start(Date order_start) {
        this.order_start = order_start;
    }

    public Date getOrder_end() {
        return order_end;
    }

    public void setOrder_end(Date order_end) {
        this.order_end = order_end;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getCanceled_reason() {
        return canceled_reason;
    }

    public void setCanceled_reason(String canceled_reason) {
        this.canceled_reason = canceled_reason;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Long getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public Long getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(Long feedback_id) {
        this.feedback_id = feedback_id;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }
}

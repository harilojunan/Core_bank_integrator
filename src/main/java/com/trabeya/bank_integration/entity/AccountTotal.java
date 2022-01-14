package com.trabeya.bank_integration.entity;

import javax.persistence.*;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Entity
@Table(schema = "bank_integration", name = "account_total")
public class AccountTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Input Data *********************************************************
    private String user_id;

    // Output Data *********************************************************
    private double total_balance;

    // constructors ***************************************

    public AccountTotal() {
        super();
    }

    public AccountTotal(Long id, String user_id, double total_balance) {
        this.id = id;
        this.user_id = user_id;
        this.total_balance = total_balance;
    }

    // Getters & Setters **************************************

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public double getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(double total_balance) {
        this.total_balance = total_balance;
    }
}

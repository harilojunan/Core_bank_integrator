package com.trabeya.bank_integration.entity;

import javax.persistence.*;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Entity
@Table(schema = "bank_integration", name = "other_fund")
public class OtherFund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Input Data *********************************************************
    private String source_user_id;

    private String source_account_no;

    private String destination_user_id;

    private String destination_account_no;

    private double transfer_amount;

    // Output Data *********************************************************
    private String our_account_no;

    private String our_user_id;

    private double initial_balance;

    private double final_balance;

    // constructors ***************************************

    public OtherFund() {
        super();
    }

    public OtherFund(Long id, String source_user_id, String source_account_no, String destination_user_id,
                     String destination_account_no, double transfer_amount, String our_account_no,
                     String our_user_id, double initial_balance, double final_balance) {
        this.id = id;
        this.source_user_id = source_user_id;
        this.source_account_no = source_account_no;
        this.destination_user_id = destination_user_id;
        this.destination_account_no = destination_account_no;
        this.transfer_amount = transfer_amount;
        this.our_account_no = our_account_no;
        this.our_user_id = our_user_id;
        this.initial_balance = initial_balance;
        this.final_balance = final_balance;
    }

    // Getters & Setters **************************************

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource_user_id() {
        return source_user_id;
    }

    public void setSource_user_id(String source_user_id) {
        this.source_user_id = source_user_id;
    }

    public String getSource_account_no() {
        return source_account_no;
    }

    public void setSource_account_no(String source_account_no) {
        this.source_account_no = source_account_no;
    }

    public String getDestination_user_id() {
        return destination_user_id;
    }

    public void setDestination_user_id(String destination_user_id) {
        this.destination_user_id = destination_user_id;
    }

    public String getDestination_account_no() {
        return destination_account_no;
    }

    public void setDestination_account_no(String destination_account_no) {
        this.destination_account_no = destination_account_no;
    }

    public double getTransfer_amount() {
        return transfer_amount;
    }

    public void setTransfer_amount(double transfer_amount) {
        this.transfer_amount = transfer_amount;
    }

    public String getOur_account_no() {
        return our_account_no;
    }

    public void setOur_account_no(String our_account_no) {
        this.our_account_no = our_account_no;
    }

    public String getOur_user_id() {
        return our_user_id;
    }

    public void setOur_user_id(String our_user_id) {
        this.our_user_id = our_user_id;
    }

    public double getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(double initial_balance) {
        this.initial_balance = initial_balance;
    }

    public double getFinal_balance() {
        return final_balance;
    }

    public void setFinal_balance(double final_balance) {
        this.final_balance = final_balance;
    }
}

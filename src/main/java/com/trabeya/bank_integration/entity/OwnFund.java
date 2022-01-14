package com.trabeya.bank_integration.entity;

import javax.persistence.*;
//*
//Author: Harilojunan.N
//Date	: 14/January/2022
//*
@Entity
@Table(schema = "bank_integration", name = "own_fund")
public class OwnFund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Input Data *********************************************************
    private String trasfer_user_id;

    private String source_account_no;

    private String destination_account_no;

    private double transfer_amount;

    // Output Data *********************************************************
    private String our_account_no;

    private String our_user_id;

    private double our_initial_balance;

    private double our_final_balance;

    // constructors ***************************************

    public OwnFund() {
        super();
    }

    public OwnFund(Long id, String trasfer_user_id, String source_account_no, String destination_account_no,
                   double transfer_amount, String our_account_no, String our_user_id, double our_initial_balance,
                   double our_final_balance) {
        this.id = id;
        this.trasfer_user_id = trasfer_user_id;
        this.source_account_no = source_account_no;
        this.destination_account_no = destination_account_no;
        this.transfer_amount = transfer_amount;
        this.our_account_no = our_account_no;
        this.our_user_id = our_user_id;
        this.our_initial_balance = our_initial_balance;
        this.our_final_balance = our_final_balance;
    }

    // Getters & Setters **************************************

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrasfer_user_id() {
        return trasfer_user_id;
    }

    public void setTrasfer_user_id(String trasfer_user_id) {
        this.trasfer_user_id = trasfer_user_id;
    }

    public String getSource_account_no() {
        return source_account_no;
    }

    public void setSource_account_no(String source_account_no) {
        this.source_account_no = source_account_no;
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

    public double getOur_initial_balance() {
        return our_initial_balance;
    }

    public void setOur_initial_balance(double our_initial_balance) {
        this.our_initial_balance = our_initial_balance;
    }

    public double getOur_final_balance() {
        return our_final_balance;
    }

    public void setOur_final_balance(double our_final_balance) {
        this.our_final_balance = our_final_balance;
    }
}

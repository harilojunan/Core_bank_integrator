package com.trabeya.bank_integration.entity;

import javax.persistence.*;

@Entity
@Table(schema = "bank_integration", name = "account")
public class AccountGet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String account_no;

    private String user_id;

    private double balance;

    public AccountGet() {
        super();
    }

    public AccountGet(Long id,String account_no, String user_id, double balance) {
        this.id = id;
        this.account_no = account_no;
        this.user_id = user_id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

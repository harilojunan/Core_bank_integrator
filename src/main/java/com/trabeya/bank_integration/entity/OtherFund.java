package com.trabeya.bank_integration.entity;

import javax.persistence.*;

@Entity
@Table(schema = "bank_integration", name = "other_fund")
public class OtherFund {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String our_account_no;

    private String our_user_id;

    private double initial_balance;

    private double final_balance;

    public OtherFund() {
        super();
    }

    public OtherFund(Long id, String our_account_no, String our_user_id, double initial_balance, double final_balance) {
        this.id = id;
        this.our_account_no = our_account_no;
        this.our_user_id = our_user_id;
        this.initial_balance = initial_balance;
        this.final_balance = final_balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

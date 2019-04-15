package com.seckill.entity;

import javax.persistence.*;

/**
 * 账号信息
 */
@Entity
@Table(name="t_AccountInfo",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"account"})
},
        indexes = {@Index(columnList = "account"),@Index(columnList = "balance" )})
public class AccountInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String account;
    @Column
    private String username;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    @Column
    private double balance;

}

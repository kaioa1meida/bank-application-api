package org.example.bankapplicationapi.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name= "tb_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    @Column(precision = 13, scale = 2)
    private BigDecimal available_limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAvailable_limit() {
        return available_limit;
    }

    public void setAvailable_limit(BigDecimal available_limit) {
        this.available_limit = available_limit;
    }
}

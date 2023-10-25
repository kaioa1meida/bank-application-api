package org.example.bankapplicationapi.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name= "tb_cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(precision = 13, scale = 2)
    private BigDecimal max_limit;

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

    public BigDecimal getMaxLimit() {
        return max_limit;
    }

    public void setMaxLimit(BigDecimal max_limit) {
        this.max_limit = max_limit;
    }
}

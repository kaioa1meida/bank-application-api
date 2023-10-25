package org.example.bankapplicationapi.controller.dto;
import org.example.bankapplicationapi.domain.model.Card;

import java.math.BigDecimal;

public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getMaxLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setMaxLimit(this.limit);
        return model;
    }
}
package com.blairnangle.hexpizza.adapters.rest;

import com.blairnangle.hexpizza.domain.model.Pizza;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Getter
final class PizzaResponse {

    private final long id;

    private String name;

    private BigDecimal pricePerSquareInch;

    public static PizzaResponse fromDomain(Pizza domainObject) {
        return PizzaResponse.builder().id(domainObject.getId()).name(domainObject.getName()).pricePerSquareInch(domainObject.getPricePerSquareInch()).build();
    }
}

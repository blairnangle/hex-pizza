package com.blairnangle.hexpizza.adapters.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
final class PizzaOrderRequest {

    private long pizzaId;

    private int diameterInInches;
}

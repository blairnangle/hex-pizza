package com.blairnangle.hexpizza.domain.ports.in;

import com.blairnangle.hexpizza.domain.model.Pizza;

import java.math.BigDecimal;

public interface CreatePizzaUseCase {
    Pizza create(String name, BigDecimal pricePerSquareInch);
}

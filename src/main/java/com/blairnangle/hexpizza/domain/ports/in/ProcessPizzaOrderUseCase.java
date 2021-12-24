package com.blairnangle.hexpizza.domain.ports.in;

import com.blairnangle.hexpizza.domain.model.PizzaOrder;
import com.blairnangle.hexpizza.domain.model.Pizza;

public interface ProcessPizzaOrderUseCase {
    PizzaOrder process(Pizza pizza, Integer diameterInInches);
}

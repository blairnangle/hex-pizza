package com.blairnangle.hexpizza.domain.ports.out;

import com.blairnangle.hexpizza.domain.model.PizzaOrder;

public interface SavePizzaOrderPort {
    PizzaOrder save(PizzaOrder pizzaOrder);
}

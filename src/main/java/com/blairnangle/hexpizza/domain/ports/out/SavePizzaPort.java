package com.blairnangle.hexpizza.domain.ports.out;

import com.blairnangle.hexpizza.domain.model.Pizza;

public interface SavePizzaPort {
    Pizza save(Pizza pizza);
}

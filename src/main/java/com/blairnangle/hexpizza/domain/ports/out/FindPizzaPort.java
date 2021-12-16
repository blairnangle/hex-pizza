package com.blairnangle.hexpizza.domain.ports.out;

import com.blairnangle.hexpizza.domain.model.Pizza;

import java.util.Optional;

public interface FindPizzaPort {
    Optional<Pizza> find(Long id);
}

package com.blairnangle.hexpizza.domain.ports.in;

import com.blairnangle.hexpizza.domain.model.Pizza;

import java.util.Optional;

public interface GetPizzaUseCase {
    Optional<Pizza> get(Long id);
}

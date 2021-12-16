package com.blairnangle.hexpizza.domain;

import com.blairnangle.hexpizza.domain.model.Pizza;
import com.blairnangle.hexpizza.domain.ports.in.CreatePizzaUseCase;
import com.blairnangle.hexpizza.domain.ports.in.GetPizzaUseCase;
import com.blairnangle.hexpizza.domain.ports.out.FindPizzaPort;
import com.blairnangle.hexpizza.domain.ports.out.SavePizzaPort;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Optional;

@AllArgsConstructor
public class PizzaService implements CreatePizzaUseCase, GetPizzaUseCase {

    private final SavePizzaPort savePizzaPort;
    private final FindPizzaPort findPizzaPort;

    @Override
    public Pizza create(String name, BigDecimal pricePerSquareInch) {
        Pizza created = Pizza.builder().name(name).pricePerSquareInch(pricePerSquareInch).build();

        return savePizzaPort.save(created);
    }

    @Override
    public Optional<Pizza> get(Long id) {
        return findPizzaPort.find(id);
    }
}

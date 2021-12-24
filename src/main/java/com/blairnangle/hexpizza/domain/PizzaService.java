package com.blairnangle.hexpizza.domain;

import com.blairnangle.hexpizza.domain.model.PizzaOrder;
import com.blairnangle.hexpizza.domain.model.Pizza;
import com.blairnangle.hexpizza.domain.ports.in.CreatePizzaUseCase;
import com.blairnangle.hexpizza.domain.ports.in.GetPizzaUseCase;
import com.blairnangle.hexpizza.domain.ports.in.ProcessPizzaOrderUseCase;
import com.blairnangle.hexpizza.domain.ports.out.FindPizzaPort;
import com.blairnangle.hexpizza.domain.ports.out.SavePizzaOrderPort;
import com.blairnangle.hexpizza.domain.ports.out.SavePizzaPort;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Optional;

@AllArgsConstructor
public class PizzaService implements CreatePizzaUseCase, GetPizzaUseCase, ProcessPizzaOrderUseCase {

    private final SavePizzaPort savePizzaPort;
    private final FindPizzaPort findPizzaPort;
    private final SavePizzaOrderPort savePizzaOrderPort;

    private final PriceCalculator priceCalculator;

    @Override
    public Pizza create(String name, BigDecimal pricePerSquareInch) {
        Pizza created = Pizza.builder().name(name).pricePerSquareInch(pricePerSquareInch).build();

        return savePizzaPort.save(created);
    }

    @Override
    public Optional<Pizza> get(Long id) {
        return findPizzaPort.find(id);
    }

    @Override
    public PizzaOrder process(Pizza pizza, Integer diameterInInches) {
        BigDecimal priceOfPizza = priceCalculator.calculateRoundedPriceOfPizza(pizza, diameterInInches);
        PizzaOrder processed = PizzaOrder.builder().pizza(pizza).diameterInInches(diameterInInches).price(priceOfPizza).build();

        return savePizzaOrderPort.save(processed);
    }
}

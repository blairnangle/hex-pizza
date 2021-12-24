package com.blairnangle.hexpizza.adapters.persistence;

import com.blairnangle.hexpizza.domain.model.PizzaOrder;
import com.blairnangle.hexpizza.domain.ports.out.SavePizzaOrderPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PizzaOrderRepository implements SavePizzaOrderPort {

    private final PizzaOrderCrudRepository repository;

    @Override
    public PizzaOrder save(PizzaOrder pizzaOrder) {
        PizzaOrderEntity entity = PizzaOrderEntity.fromDomain(pizzaOrder);
        PizzaOrderEntity saved = repository.save(entity);

        return saved.toDomain();
    }
}

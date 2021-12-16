package com.blairnangle.hexpizza.adapters.persistence;

import com.blairnangle.hexpizza.domain.model.Pizza;
import com.blairnangle.hexpizza.domain.ports.out.FindPizzaPort;
import com.blairnangle.hexpizza.domain.ports.out.SavePizzaPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class PizzaRepository implements SavePizzaPort, FindPizzaPort {

    private final PizzaCrudRepository repository;

    @Override
    public Pizza save(Pizza pizza) {
        PizzaEntity entity = PizzaEntity.fromDomain(pizza);
        PizzaEntity saved = repository.save(entity);

        return saved.toDomain();
    }

    @Override
    public Optional<Pizza> find(Long id) {
        Optional<PizzaEntity> foundOptional = repository.findById(id);

        return foundOptional.map(PizzaEntity::toDomain);
    }
}

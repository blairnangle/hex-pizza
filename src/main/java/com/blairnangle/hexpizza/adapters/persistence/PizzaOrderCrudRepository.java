package com.blairnangle.hexpizza.adapters.persistence;

import org.springframework.data.repository.CrudRepository;

public interface PizzaOrderCrudRepository extends CrudRepository<PizzaOrderEntity, Long> {
}

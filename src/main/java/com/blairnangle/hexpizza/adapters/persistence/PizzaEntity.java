package com.blairnangle.hexpizza.adapters.persistence;

import com.blairnangle.hexpizza.domain.model.Pizza;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private BigDecimal pricePerSquareInch;

    public static PizzaEntity fromDomain(Pizza domainObject) {
        return PizzaEntity.builder().id(domainObject.getId()).name(domainObject.getName()).pricePerSquareInch(domainObject.getPricePerSquareInch()).build();
    }

    public Pizza toDomain() {
        return Pizza.builder().id(id).name(name).pricePerSquareInch(pricePerSquareInch).build();
    }
}

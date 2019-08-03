package pl.jakub.hexagonalarchitecture.port.outbound;

import pl.jakub.hexagonalarchitecture.core.domain.Pizza;

import java.util.List;

public interface PizzaRepo {
    /*
    We have an external system for creating pizzas.
    The core application will use an outbound port to access this external system to create or get pizzas.
     */

    void savePizza(Pizza pizza);
    Pizza getPizzaByName(String name);
    List<Pizza> getAllPizza();
}

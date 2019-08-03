package pl.jakub.hexagonalarchitecture.port.inbound;

import pl.jakub.hexagonalarchitecture.core.domain.Pizza;

import java.util.List;

public interface PizzaService {

    /*
    Inbound port

    Core application will expose its functionality using an inbound port.
    This inbound port (interface) exposes the application to the outside world.
     */

    void createPizza(Pizza pizza);
    Pizza getPizzaByName(String name);
    List<Pizza> getAllPizza();
}

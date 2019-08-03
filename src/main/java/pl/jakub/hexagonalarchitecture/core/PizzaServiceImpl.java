package pl.jakub.hexagonalarchitecture.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jakub.hexagonalarchitecture.core.domain.Pizza;
import pl.jakub.hexagonalarchitecture.port.inbound.PizzaService;
import pl.jakub.hexagonalarchitecture.port.outbound.PizzaRepo;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    /*
    The core of the application uses outbound port to communicate to the downstream system.
    This is an implementation of the core service.
     */

    private PizzaRepo pizzaRepo;

    @Autowired
    public PizzaServiceImpl(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    @Override
    public void createPizza(Pizza pizza) {
        pizzaRepo.savePizza(pizza);
    }

    @Override
    public Pizza getPizzaByName(String name) {
        return pizzaRepo.getPizzaByName(name);
    }

    @Override
    public List<Pizza> getAllPizza() {
        return pizzaRepo.getAllPizza();
    }
}

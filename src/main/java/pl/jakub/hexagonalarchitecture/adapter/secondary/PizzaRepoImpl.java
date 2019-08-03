package pl.jakub.hexagonalarchitecture.adapter.secondary;

import org.springframework.stereotype.Repository;
import pl.jakub.hexagonalarchitecture.core.domain.Pizza;
import pl.jakub.hexagonalarchitecture.port.outbound.PizzaRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class PizzaRepoImpl implements PizzaRepo {

    /*
    We need an implementation of the outbound port.
    PizzaRepo is our outbound port;
    this secondary adapter is its impl.
     */

    private Map<String, Pizza> pizzaDataSource = new HashMap<>();

    @Override
    public void savePizza(Pizza pizza) {
        pizzaDataSource.put(pizza.getName(), pizza);
    }

    @Override
    public Pizza getPizzaByName(String name) {
        return pizzaDataSource.get(name);
    }

    @Override
    public List<Pizza> getAllPizza() {
        return pizzaDataSource.values().stream().collect(Collectors.toList());
    }
}

package pl.jakub.hexagonalarchitecture.adapter.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jakub.hexagonalarchitecture.core.domain.Pizza;
import pl.jakub.hexagonalarchitecture.port.inbound.PizzaService;

import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaRestController implements PizzaRestUI {

    /*
    Applying the hexagonal architecture principles, you would have primary adapters using inbound ports.
    Let's define a REST controller as our primary adapter, providing endpoints for creating and accessing pizzas.
    This REST controller primary adapter will use PizzaService to connect to the core application.
     */

    private PizzaService pizzaService;

    @Autowired
    public PizzaRestController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @Override
    public void createPizza(Pizza pizza) {
        pizzaService.createPizza(pizza);
    }

    @Override
    public Pizza getPizzaByName(String name) {
        return pizzaService.getPizzaByName(name);
    }

    @Override
    public List<Pizza> getAllPizza() {
        return pizzaService.getAllPizza();
    }
}

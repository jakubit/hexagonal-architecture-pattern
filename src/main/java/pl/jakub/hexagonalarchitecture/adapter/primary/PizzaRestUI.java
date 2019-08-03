package pl.jakub.hexagonalarchitecture.adapter.primary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.jakub.hexagonalarchitecture.core.domain.Pizza;

import java.util.List;

public interface PizzaRestUI {
    @PostMapping
    void createPizza(@RequestBody Pizza pizza);

    @GetMapping("/{name}")
    Pizza getPizzaByName(@PathVariable String name);

    @GetMapping
    List<Pizza> getAllPizza();
}

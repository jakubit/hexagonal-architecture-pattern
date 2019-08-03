package pl.jakub.hexagonalarchitecture.core.domain;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza implements Serializable {

    /*
    The Value Object.
    This is core of the application - pizza class.
     */

    private String name;
    private List<String> toppings;
}

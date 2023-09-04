package guru.sfg.beer.order.service.web.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author ileanaoneata on 04.09.2023
 */

@Data
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private String upc;
    private BigDecimal price;
}

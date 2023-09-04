package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * @author ileanaoneata on 04.09.2023
 */
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);
}

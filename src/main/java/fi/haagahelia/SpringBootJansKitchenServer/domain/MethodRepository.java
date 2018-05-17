package fi.haagahelia.SpringBootJansKitchenServer.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface MethodRepository extends CrudRepository<Method, Long> {

}

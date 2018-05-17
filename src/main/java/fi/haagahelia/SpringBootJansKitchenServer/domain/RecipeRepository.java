package fi.haagahelia.SpringBootJansKitchenServer.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

//@PreAuthorize("hasRole('ROLE_USER')")
@RestResource	
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	
//	@SuppressWarnings("unchecked")
//	@Override
//	@PreAuthorize("#recipe?.user == null or #employee?.user?.name == authentication?.name")
//	Recipe save(@Param("recipe") Recipe recipe);
//	
//	@Override
//	@PreAuthorize("@recipeRepisitory.findOne(#id)?.user?.name == authentication?.name")
//	void delete(@Param("id") Long id);
//	
//	@Override
//	@PreAuthorize("#recipe?.user?.name == authentication?.name")
//	void delete(@Param("recipe") Recipe recipe);
	
	List<Recipe> findByTitle(String title);
}

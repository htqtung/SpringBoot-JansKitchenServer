package fi.haagahelia.SpringBootJansKitchenServer;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.haagahelia.SpringBootJansKitchenServer.domain.Recipe;
import fi.haagahelia.SpringBootJansKitchenServer.domain.RecipeRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class RecipeRepositoryTest {
	
	@Autowired
	private RecipeRepository repository;
	
	@Test
	public void findByTitleShouldReturnRecipe() {
		List<Recipe> recipes = repository.findByTitle("Cheese Ball");
		
		assertThat(recipes.get(0).getDescription()).isEqualTo("Great for Halloween");
	}
	
	
	@Test
	public void createNewRecipe() {
		Recipe recipe = new Recipe("Test Recipe", "Test", "2 test", 100, new Date(), 2);
		repository.save(recipe);
		assertThat(recipe.getId()).isNotNull();
	}
	
	@Test
	public void deleteRecipe() {
		List<Recipe> recipe = repository.findByTitle("Cheese Ball");
		repository.delete(recipe.get(0).getId());
		assertThat(repository.findOne(recipe.get(0).getId())).isNull();
	}
}

package fi.haagahelia.SpringBootJansKitchenServer.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RecipeRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(readOnly = true)
	public List<Recipe> findAll() {
		return jdbcTemplate.query("SELECT * FROM recipe", new RecipeRowMapper());
	}
	
	
}

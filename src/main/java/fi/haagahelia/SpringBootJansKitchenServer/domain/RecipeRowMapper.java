package fi.haagahelia.SpringBootJansKitchenServer.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

class RecipeRowMapper implements RowMapper<Recipe> {
	@Override
	public Recipe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Recipe recipe = new Recipe();
		recipe.setId(rs.getLong("id"));
		recipe.setTitle(rs.getString("title"));
		recipe.setDescription(rs.getString("description"));
		recipe.setIngredients(rs.getString("ingredients"));
		recipe.setMethods(rs.getString("methods"));
		recipe.setPhotos(rs.getString("photos"));
		recipe.setServings(rs.getInt("servings"));
		recipe.setTimeToCook(rs.getString("timeToCook"));
		recipe.setLoveCount(rs.getLong("loveCount"));
		recipe.setPostTime(rs.getTimestamp("postTime"));
		recipe.setUser_id(rs.getLong("author_id"));
		return recipe;
	}
}

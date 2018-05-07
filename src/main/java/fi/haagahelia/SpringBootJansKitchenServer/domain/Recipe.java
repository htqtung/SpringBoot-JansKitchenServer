package fi.haagahelia.SpringBootJansKitchenServer.domain;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Recipe {
private long id, user_id;
	
	private String title, description, timeToCook;
	
	private ArrayList<String> ingredients;
	private ArrayList<String> methods;
	private ArrayList<String> photos;
	
	private long loveCount;
	private Timestamp postTime;
	private int servings;
	
	public Recipe() {
		
	}

	public Recipe(long id, long user_id, String title, String description, String timeToCook,
			ArrayList<String> ingredients, ArrayList<String> methods, ArrayList<String> photos, long loveCount,
			Timestamp postTime, int servings) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.title = title;
		this.description = description;
		this.timeToCook = timeToCook;
		this.ingredients = ingredients;
		this.methods = methods;
		this.photos = photos;
		this.loveCount = loveCount;
		this.postTime = postTime;
		this.servings = servings;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTimeToCook() {
		return timeToCook;
	}

	public void setTimeToCook(String timeToCook) {
		this.timeToCook = timeToCook;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}
 //##############################################################################
	public void setIngredients(String ingredients) {
		ArrayList<String> array = new ArrayList<String>();
		this.ingredients = array;
	}

	public ArrayList<String> getMethods() {
		return methods;
	}

	public void setMethods(String methods) {
		ArrayList<String> array = new ArrayList<String>();
		this.methods = array;
	}

	public ArrayList<String> getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		ArrayList<String> array = new ArrayList<String>();
		this.photos = array;
	}
//######################################################################################
	public long getLoveCount() {
		return loveCount;
	}

	public void setLoveCount(long loveCount) {
		this.loveCount = loveCount;
	}

	public Timestamp getPostTime() {
		return postTime;
	}

	public void setPostTime(Timestamp postTime) {
		this.postTime = postTime;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}
}

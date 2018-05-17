package fi.haagahelia.SpringBootJansKitchenServer.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Recipe {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String title, description, timeToCook, photo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
	@JsonIgnore
	private List<Ingredient> ingredients;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
	@JsonIgnore
	private List<Ingredient> methods;
	
	private long loveCount;
	private Date postTime;
	private int servings;
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	
	public Recipe() {
		
	}

	public Recipe(String title, String description, String timeToCook, long loveCount, Date postTime, int servings) {
		super();
		this.title = title;
		this.description = description;
		this.timeToCook = timeToCook;
		this.loveCount = loveCount;
		this.postTime = postTime;
		this.servings = servings;
	}
	
	public Recipe(String title, String description, String timeToCook, int servings) {
		super();
		this.title = title;
		this.description = description;
		this.timeToCook = timeToCook;
		this.loveCount = 0;
		this.postTime = new Date();
		this.servings = servings;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> getMethods() {
		return methods;
	}

	public void setMethods(List<Ingredient> methods) {
		this.methods = methods;
	}

	public long getLoveCount() {
		return loveCount;
	}

	public void setLoveCount(long loveCount) {
		this.loveCount = loveCount;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

package fi.haagahelia.SpringBootJansKitchenServer.domain;

import javax.persistence.*;

@Entity
public class Method {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String content, photo;
	int step;

	@ManyToOne
	@JoinColumn(name = "recipeid")
	private Recipe recipe;

	public Method() {

	}

	public Method(String content, int step) {
		this.content = content;
		this.step = step;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
}


package fi.haagahelia.SpringBootJansKitchenServer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.SpringBootJansKitchenServer.domain.Ingredient;
import fi.haagahelia.SpringBootJansKitchenServer.domain.IngredientRepository;
import fi.haagahelia.SpringBootJansKitchenServer.domain.Method;
import fi.haagahelia.SpringBootJansKitchenServer.domain.MethodRepository;
import fi.haagahelia.SpringBootJansKitchenServer.domain.Recipe;
import fi.haagahelia.SpringBootJansKitchenServer.domain.RecipeRepository;
import fi.haagahelia.SpringBootJansKitchenServer.domain.UserRepository;

@Controller
public class JansKitchenController {
	
	@Autowired
	private RecipeRepository recipeRepo;
	@Autowired
	private IngredientRepository ingreRepo;
	@Autowired
	private MethodRepository methodRepo;
	@Autowired
	private UserRepository uRepo;
	
	@RequestMapping(value = "/")
    public String index(Model model) {
		model.addAttribute("recipes", recipeRepo.findAll());
        return "index";
    }
	
	@RequestMapping("/addrecipe")
	public String addRecipe(Model model) {
		model.addAttribute("recipe", new Recipe());
		model.addAttribute("ingredients", new Ingredient());
		model.addAttribute("method", new Method());
		return "newRecipeForm";
	}
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveRecipe(Recipe recipe) {
		recipeRepo.save(recipe);
		return "redirect:/";
	}
	
    @RequestMapping(value="/login")
	public String login() {
		return "loginPage";
	}
}

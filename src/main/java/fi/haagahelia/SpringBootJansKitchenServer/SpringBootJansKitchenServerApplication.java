package fi.haagahelia.SpringBootJansKitchenServer;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.SpringBootJansKitchenServer.domain.Ingredient;
import fi.haagahelia.SpringBootJansKitchenServer.domain.IngredientRepository;
import fi.haagahelia.SpringBootJansKitchenServer.domain.Method;
import fi.haagahelia.SpringBootJansKitchenServer.domain.MethodRepository;
import fi.haagahelia.SpringBootJansKitchenServer.domain.Recipe;
import fi.haagahelia.SpringBootJansKitchenServer.domain.RecipeRepository;
import fi.haagahelia.SpringBootJansKitchenServer.domain.User;
import fi.haagahelia.SpringBootJansKitchenServer.domain.UserRepository;


@SpringBootApplication
public class SpringBootJansKitchenServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJansKitchenServerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner appDemo(UserRepository uRepo, RecipeRepository recipeRepo, IngredientRepository inRepo, MethodRepository meRepo) {
		return (args) -> {
//			User u = new User("John Johnson", "john@mail.com");
//			uRepo.save(u);
//			User u1 = new User("Mary Philips", "m.philips@mail.com");
//			uRepo.save(u1);
//			User u2 = new User("Dan Davidson", "dan.d@mail.com");
//			uRepo.save(u2);
//			User u3 = new User("Erick Wilfrid", "ewilf@mail.com");
//			uRepo.save(u3);
//			User u4 = new User("Tylar Orrell", "t.orrell@mail.com");
//			uRepo.save(u4);
//			User u5 = new User("Sally Gareth", "s.gareth@mail.com");
//			uRepo.save(u5);
//			User u6 = new User("Roseanne Kimball", "kimball@mail.com");
//			uRepo.save(u6);
			User user1 = new User("user", "user@jsk.com", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "admin@jsk.com", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			User u7 = new User("Jan Le", "janle@jsk.com", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			uRepo.save(u7);
			User u8 = new User("Tung Huynh", "tunghuynh@jsk.com", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			uRepo.save(u8);
			uRepo.save(user1);
			uRepo.save(user2);
			long love = 100;
			int servings = 2;
			String timeToCook = "30 mins";
			
			Date dt = new Date();
			DateTime dtOrg = new DateTime(dt);
			Date dtMinusOne = dtOrg.minusDays(1).toDate();			
//			Date dtMinusTwo = dtOrg.minusDays(2).toDate();			
//			Date dtMinusThree = dtOrg.minusHours(2).toDate();			
//			Date dtMinusFour = dtOrg.minusDays(3).toDate();			
//			Date dtMinusFive = dtOrg.minusDays(4).toDate();			
//			Date dtMinusSix = dtOrg.minusDays(5).toDate();			
			Date dtMinusSeven = dtOrg.minusDays(6).toDate();
			
			Recipe r = new Recipe("Cheese Ball", "Great for Halloween", timeToCook, love, dtMinusSeven, servings);
			r.setPhoto("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2012/11/12/0/FN_Aaron-McCargo-Jr-Buffalo-Chicken-Cheese-Balls_s4x3.jpg.rend.hgtvcom.616.462.suffix/1382541971452.jpeg");
			r.setUser(u7);
			
			Ingredient i1 = new Ingredient("500gr mozarella cheese");
			i1.setRecipe(r);
			Ingredient i2 = new Ingredient("cracked black pepper");
			i2.setRecipe(r);
			Ingredient i3 = new Ingredient("200gr cream cheese");
			i3.setRecipe(r);
			Ingredient i4 = new Ingredient("panko");
			i4.setRecipe(r);
			Ingredient i5 = new Ingredient("2 eggs");
			i5.setRecipe(r);
			Ingredient i6 = new Ingredient("flour");
			i6.setRecipe(r);
			
			Method m1 = new Method("cut cheese into cube shapes", 1);
			m1.setRecipe(r);
			Method m2 = new Method("dip into egg wash", 2);
			m2.setRecipe(r);
			Method m3 = new Method("roll 'em over flour", 3);
			m3.setRecipe(r);
			Method m4 = new Method("roll 'em over panko", 4);
			m4.setRecipe(r);
			
			recipeRepo.save(r);
			inRepo.save(i1);
			inRepo.save(i2);
			inRepo.save(i3);
			inRepo.save(i4);
			inRepo.save(i5);
			inRepo.save(i6);
			meRepo.save(m1);
			meRepo.save(m2);
			meRepo.save(m3);
			meRepo.save(m4);
			
			love = 450;
			timeToCook = "2 hours";
			
			r = new Recipe("Vietnamese Broken Rice and Grilled Cutlet", "Can also goes with a sunny-side-up or crambled egg", timeToCook, love, dt, servings);
			r.setPhoto("https://firebasestorage.googleapis.com/v0/b/jankitchenmobile.appspot.com/o/brokenrice.jpg?alt=media&token=3eb46605-fc60-46da-80d5-680b7920f941");
			r.setUser(u8);
			
			i1 = new Ingredient("2 cups broken rice - cooked with 2 cup of water");
			i1.setRecipe(r);
			i2 = new Ingredient("2 slices pork cutlet");
			i2.setRecipe(r);
			i3 = new Ingredient("200gr pork fat");
			i3.setRecipe(r);
			i4 = new Ingredient("1 cucumber");
			i4.setRecipe(r);
			i5 = new Ingredient("1 tomato");
			i5.setRecipe(r);
			i6 = new Ingredient("2 spring onion");
			i6.setRecipe(r);
			Ingredient i7 = new Ingredient("spices and fish sauce");
			i7.setRecipe(r);
			
			m1 = new Method("marinate pork cutlet with 3tbsp of fish sauce, 2tsp of sugar for 1 hour", 1);
			m1.setRecipe(r);
			m2 = new Method("grill the cutlets for 30 mins", 2);
			m2.setRecipe(r);
			m3 = new Method("decoration with cucumber and tomato slices", 3);
			m3.setRecipe(r);
			
			recipeRepo.save(r);
			inRepo.save(i1);
			inRepo.save(i2);
			inRepo.save(i3);
			inRepo.save(i4);
			inRepo.save(i5);
			inRepo.save(i6);
			inRepo.save(i7);
			meRepo.save(m1);
			meRepo.save(m2);
			meRepo.save(m3);
			
			love = 600;
			r = new Recipe("Korean Bibimbap", "You cannot fail with this recipe", timeToCook, love, dtMinusOne, servings);
			r.setPhoto("https://firebasestorage.googleapis.com/v0/b/jankitchenmobile.appspot.com/o/bibimbap.JPG?alt=media&token=906f8427-308b-4ed4-8474-07d7849ee3af");
			r.setUser(u7);
			
			i1 = new Ingredient("2 cups rice - cooked");
			i1.setRecipe(r);
			i2 = new Ingredient("2 eggs");
			i2.setRecipe(r);
			i3 = new Ingredient("200gr of beef - sliced");
			i3.setRecipe(r);
			i4 = new Ingredient("1 cucumber - sliced");
			i4.setRecipe(r);
			i5 = new Ingredient("1 carrot - sliced");
			i5.setRecipe(r);
			i6 = new Ingredient("1 zuchini - sliced");
			i6.setRecipe(r);
			i7 = new Ingredient("2 spring onion - diced");
			i7.setRecipe(r);
			Ingredient i8 = new Ingredient("oyster sauce, Korean pepper paste, semame oil");
			i8.setRecipe(r);
			
			m1 = new Method("stir-fry beef, and vegetables, add oyster sauce and soy sauce to taste", 1);
			m1.setRecipe(r);
			m2 = new Method("fry 2 eggs", 2);
			m2.setRecipe(r);
			m3 = new Method("put everything in a big bow,1 tbsp of Korean pepper paste, 2 tsp of sesame oil", 3);
			m3.setRecipe(r);
			m4 = new Method("mix up and enjoy :) ", 4);
			m4.setRecipe(r);
			
			recipeRepo.save(r);
			inRepo.save(i1);
			inRepo.save(i2);
			inRepo.save(i3);
			inRepo.save(i4);
			inRepo.save(i5);
			inRepo.save(i6);
			inRepo.save(i7);
			inRepo.save(i8);
			meRepo.save(m1);
			meRepo.save(m2);
			meRepo.save(m3);
			meRepo.save(m4);
	    };
	}
}

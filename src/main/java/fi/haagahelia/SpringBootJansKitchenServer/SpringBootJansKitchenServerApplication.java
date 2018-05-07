package fi.haagahelia.SpringBootJansKitchenServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class SpringBootJansKitchenServerApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootJansKitchenServerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJansKitchenServerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
		return (args) -> {
			// Database is created by using resources/schema.sql

			// Insert some demo data
	        jdbcTemplate.update("insert into user(username, email) values (?, ?)", "John West", "john.west@gmail.com");
	        jdbcTemplate.update("insert into user(username, email) values (?, ?)", "Mike Mars", "mike.mars@gmail.com");
	        jdbcTemplate.update("insert into user(username, email) values (?, ?)", "Kate Johnson", "kate.johnson@gmail.com");
		};
	}
}
//@Bean
//public CommandLineRunner demo(UserRepository uRepo, RecipeRepository recipeRepo) {
//	return (args) -> {
//		User u = new User("John Johnson", "john@mail.com", "Tuomarila", "I am a chef in ABCXYZ");
//		uRepo.save(u);
//		User u1 = new User("Mary Philips", "m.philips@mail.com", "Espookeskus", "I am a chef in ABCXYZ");
//		uRepo.save(u1);
//		User u2 = new User("Dan Davidson", "dan.d@mail.com", "Kalasatama", "I am a chef in ABCXYZ");
//		uRepo.save(u2);
//		User u3 = new User("Erick Wilfrid", "ewilf@mail.com", "Malminkartano", "I am a chef in ABCXYZ");
//		uRepo.save(u3);
//		User u4 = new User("Tylar Orrell", "t.orrell@mail.com", "Kannelmaki", "I am a chef in ABCXYZ");
//		uRepo.save(u4);
//		User u5 = new User("Sally Gareth", "s.gareth@mail.com", "Pohjois-Haaga", "I am a chef in ABCXYZ");
//		uRepo.save(u5);
//		User u6 = new User("Roseanne Kimball", "kimball@mail.com", "Pasila", "I am a chef in ABCXYZ");
//		uRepo.save(u6);
//		User u7 = new User("Jan Le", "janle@mail.com", "Pohjois-Haaga", "I am enthusiastic patissier. Check out my recipes");
//		uRepo.save(u7);
//		User u8 = new User("Tung Huynh", "tunghuynh@mail.com", "Pohjois-Haaga", "I love food");
//		uRepo.save(u8);
//		
//
//		ArrayList<String> ingredients = new ArrayList<String>();
//		ingredients.add("500gr mozarella cheese");
//		ingredients.add("cracked black pepper");
//		ingredients.add("200gr cream cheese");
//		ingredients.add("panko");
//		ingredients.add("2 eggs");
//		ingredients.add("flour");
//		
//		ArrayList<String> method = new ArrayList<String>();
//		method.add("cut cheese into cube shapes");
//		method.add("dip into egg wash");
//		method.add("roll 'em over flour");
//		method.add("roll 'em over panko");
//		
//		ArrayList<String> data = new ArrayList<String>();
//		data.add("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2012/11/12/0/FN_Aaron-McCargo-Jr-Buffalo-Chicken-Cheese-Balls_s4x3.jpg.rend.hgtvcom.616.462.suffix/1382541971452.jpeg");
//		
//		long love = 100;
//		int servings = 2;
//		
//		Date dt = new Date();
//		DateTime dtOrg = new DateTime(dt);
//		Date dtMinusOne = dtOrg.minusDays(1).toDate();			
//		Date dtMinusTwo = dtOrg.minusDays(2).toDate();			
//		Date dtMinusThree = dtOrg.minusHours(2).toDate();			
//		Date dtMinusFour = dtOrg.minusDays(3).toDate();			
//		Date dtMinusFive = dtOrg.minusDays(4).toDate();			
//		Date dtMinusSix = dtOrg.minusDays(5).toDate();			
//		Date dtMinusSeven = dtOrg.minusDays(6).toDate();
//		
//		Recipe r = new Recipe("Cheese Ball", "Great for Halloween", ingredients, method, data, love, servings, dtMinusSeven);
//		r.setUser(u7);
//		recipeRepo.save(r);
//		
//		ingredients = new ArrayList<String>();
//		ingredients.add("2 cups broken rice - cooked with 2 cup of water");
//		ingredients.add("2 slices pork cutlet");
//		ingredients.add("200gr pork fat");
//		ingredients.add("1 cucumber");
//		ingredients.add("1 tomato");
//		ingredients.add("2 spring onion");
//		ingredients.add("spices and fish sauce");
//		
//		method = new ArrayList<String>();
//		method.add("marinate pork cutlet with 3tbsp of fish sauce, 2tsp of sugar for 1 hour");
//		method.add("grill the cutlets for 30 mins");
//		method.add("decoration with cucumber and tomato slices");
//		
//		data = new ArrayList<String>();
//		data.add("https://firebasestorage.googleapis.com/v0/b/jankitchenmobile.appspot.com/o/brokenrice.jpg?alt=media&token=3eb46605-fc60-46da-80d5-680b7920f941");
//		
//		love = 450;
//		
//		r = new Recipe("Vietnamese Broken Rice and Grilled Cutlet", "Can also goes with a sunny-side-up or crambled egg", ingredients, method, data, love, servings, dt);
//		r.setUser(u8);
//		recipeRepo.save(r);
//		
//		ingredients = new ArrayList<String>();
//		ingredients.add("2 cups rice - cooked");
//		ingredients.add("2 eggs");
//		ingredients.add("200gr of beef - sliced");
//		ingredients.add("1 cucumber - sliced");
//		ingredients.add("1 carrot - sliced");
//		ingredients.add("1 zuchini - sliced");
//		ingredients.add("2 spring onion - diced");
//		ingredients.add("oyster sauce, Korean pepper paste, semame oil");
//		
//		method = new ArrayList<String>();
//		method.add("stir-fry beef, and vegetables, add oyster sauce and soy sauce to taste");
//		method.add("fry 2 eggs");
//		method.add("put everything in a big bow,1 tbsp of Korean pepper paste, 2 tsp of sesame oil");
//		method.add("mix up and enjoy :) ");
//		
//		data = new ArrayList<String>();
//		data.add("https://firebasestorage.googleapis.com/v0/b/jankitchenmobile.appspot.com/o/bibimbap.JPG?alt=media&token=906f8427-308b-4ed4-8474-07d7849ee3af");
//		
//		love = 600;
//		
//		r = new Recipe("Korean Bibimbap", "You cannot fail with this recipe", ingredients, method, data, love, servings, dtMinusOne);
//		r.setUser(u7);
//		recipeRepo.save(r);
//	};
//}

package fi.haagahelia.SpringBootJansKitchenServer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.haagahelia.SpringBootJansKitchenServer.domain.User;
import fi.haagahelia.SpringBootJansKitchenServer.domain.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository repository;
	
	@Test
	public void findByUsernameShouldReturnUser() {
		User user = repository.findByUsername("janle@jsk.com");
		
		assertThat(user.getName()).isEqualTo("Jan Le");
	}
	
	
	@Test
	public void createNewUser() {
		User user = new User("userTest", "userTest@jsk.com", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
		repository.save(user);
		assertThat(user.getId()).isNotNull();
	}
	
	@Test
	public void deleteUser() {
		User user = repository.findByUsername("user@jsk.com");
		repository.delete(user.getId());
		assertThat(repository.findOne(user.getId())).isNull();
	}
}

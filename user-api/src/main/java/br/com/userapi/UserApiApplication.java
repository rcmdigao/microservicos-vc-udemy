package br.com.userapi;

import br.com.userapi.domain.User;
import br.com.userapi.reporitories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Rodrigo Machado", "rodrigo.cmachado@gmail.com", "123", 20.0),
				new User(null, "Marina Matos", "ninamatos@gmail.com", "123", 22.0)
		));
	}
}

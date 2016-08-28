package py.com.pronet;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import py.com.pronet.entities.User;
import py.com.pronet.repository.UserRepository;

@SpringBootApplication
public class DemoApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(DemoApp.class, args);
		
		UserRepository repo = run.getBean(UserRepository.class);
		
		List<User> users = Arrays.asList(new User("Rodrigo", "Villalba"), new User("Leticia", "Pfannl"));
	
		users.forEach(u -> repo.save(u));
	}
}

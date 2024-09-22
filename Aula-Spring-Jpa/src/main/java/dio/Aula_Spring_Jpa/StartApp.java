package dio.Aula_Spring_Jpa;

import dio.Aula_Spring_Jpa.model.User;
import dio.Aula_Spring_Jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository ;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("Leonardo");
        for (User u : users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("Leonardo ");
        user.setUsername("LeoGates");
        user.setPassword("leo123");
        repository.save(user);

        for (User u : repository.findAll()){
            System.out.println(u);
        }
    }
}

package dio.Aula_Spring_Jpa.repository;

import dio.Aula_Spring_Jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

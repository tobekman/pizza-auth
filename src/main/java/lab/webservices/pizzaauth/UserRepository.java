package lab.webservices.pizzaauth;

import lab.webservices.pizzaauth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

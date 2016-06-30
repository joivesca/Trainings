package mx.com.chilitech.uaiContacts.repository;

import org.springframework.data.repository.CrudRepository;
import mx.com.chilitech.uaiContacts.model.User;;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
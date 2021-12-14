package gr0102.projectecommercewaa.repository;

import gr0102.projectecommercewaa.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {

    public List<User> findAll();
    public Optional<User> findByUsername(String username);
    public User findUserById(long id);

}


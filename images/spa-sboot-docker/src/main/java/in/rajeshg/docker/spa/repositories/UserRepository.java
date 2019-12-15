package in.rajeshg.docker.spa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rajeshg.docker.spa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

}

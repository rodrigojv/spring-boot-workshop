package py.com.pronet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.com.pronet.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    User findById(Long id);
}

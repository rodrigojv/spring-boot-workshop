package py.com.pronet.services;

import java.util.List;

import py.com.pronet.entities.User;

public interface UserService {

	List<User> findAll();

	User findById(Long id);

}

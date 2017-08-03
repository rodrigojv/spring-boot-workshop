package py.com.pronet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.com.pronet.entities.User;
import py.com.pronet.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

    @Override
    public User findById(Long id) {
        return userRepo.findById(id);
    }


}

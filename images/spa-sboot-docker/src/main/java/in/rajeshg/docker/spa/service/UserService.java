package in.rajeshg.docker.spa.service;


import java.util.List;

import in.rajeshg.docker.spa.model.User;

public interface UserService {
	
	User findById(Long id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

	boolean isUserExist(User user);
}
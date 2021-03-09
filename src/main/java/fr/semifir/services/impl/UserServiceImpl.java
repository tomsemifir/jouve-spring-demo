package fr.semifir.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.semifir.models.User;
import fr.semifir.repositories.UserRepository;
import fr.semifir.services.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public User findById(int id) {
		return null;
	}

	@Override
	public List<User> findAll() {
		return this.repository.findAll();
	}

	@Override
	public User save(User user) {
		return this.repository.insert(user);
	}

	@Override
	public User update(int id, User user) {
		return null;
	}

	@Override
	public void delete(int id) {
		
	}

}

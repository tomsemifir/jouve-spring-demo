package fr.semifir.services;

import java.util.List;

import fr.semifir.models.User;

public interface UserService {

	public User findById(int id);
	public List<User> findAll();
	public User save(User user);
	public User update(int id, User user);
	public void delete(int id);
}

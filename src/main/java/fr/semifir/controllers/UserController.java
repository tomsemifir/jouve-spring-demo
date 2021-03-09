package fr.semifir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.User;
import fr.semifir.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	private UserService service;
	
	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	// CRUD 
	// CREATE (save)
	@PostMapping()
	public User save(@RequestBody User user) {
		return this.service.save(user);
	}
	
	// READ (findAll, findById)
	@GetMapping()
	public List<User> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public User findById(@PathVariable int id) {
		return this.service.findById(id);
	}
	
	// UPDATE (update)
	@PutMapping("{id}")
	public User update(@PathVariable int id, @RequestBody User user) {
		return this.service.update(id, user);
	}
	
	// DELETE (delete)
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		this.service.delete(id);
	}
}

package fr.semifir.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.semifir.models.Entreprise;
import fr.semifir.models.User;
import fr.semifir.services.EntrepriseService;
import fr.semifir.services.impl.EntrepriseServiceImpl;

@RestController
@RequestMapping("entreprises")
@Lazy
public class EntrepriseController {
	
	private EntrepriseService service;
	
	@Autowired
	public EntrepriseController(EntrepriseService service) {
		this.service = service;
	}
	
	@GetMapping()
	public List<Entreprise> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Entreprise findById(@PathVariable int id) {
		return this.service.findById(id);
	}
	
	@PostMapping()
	public Entreprise save(@RequestBody Entreprise entreprise) {
		return this.service.save(entreprise);
	}
	
	@PutMapping("{id}")
	public Entreprise update(@PathVariable int id, @RequestBody Entreprise entreprise) {
		return this.service.update(id, entreprise);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		this.service.delete(id);
	}
}

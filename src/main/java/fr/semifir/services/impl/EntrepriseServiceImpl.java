package fr.semifir.services.impl;

import java.util.ArrayList;
import java.util.List;

import fr.semifir.models.Entreprise;
import fr.semifir.models.User;
import fr.semifir.services.EntrepriseService;

public class EntrepriseServiceImpl implements EntrepriseService{

	public List<Entreprise> entreprises = new ArrayList<Entreprise>();
	
	public EntrepriseServiceImpl() {
		this.entreprises.add(new Entreprise("NewTech", new User(), "SelfArena"));
		this.entreprises.add(new Entreprise("Déthai", new User(), "Petite bourgade"));
		this.entreprises.add(new Entreprise("BibliothekA", new User(), "Ancien Theatre"));
	}
	
	@Override
	public Entreprise findById(int id) {
		return this.entreprises.get(id);
	}

	@Override
	public List<Entreprise> findAll() {
		return this.entreprises;
	}

	@Override
	public Entreprise save(Entreprise entreprise) {
		this.entreprises.add(entreprise);
		return entreprise;
	}

	@Override
	public Entreprise update(int id, Entreprise entreprise) {
		this.entreprises.set(id, entreprise);
		return entreprise;
	}

	@Override
	public void delete(int id) {
		this.entreprises.remove(id);
	}

}

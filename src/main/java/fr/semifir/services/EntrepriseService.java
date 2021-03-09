package fr.semifir.services;

import java.util.List;

import fr.semifir.models.Entreprise;

public interface EntrepriseService {

	public Entreprise findById(int id);
	public List<Entreprise> findAll();
	public Entreprise save(Entreprise entreprise);
	public Entreprise update(int id, Entreprise entreprise);
	public void delete(int id);
}

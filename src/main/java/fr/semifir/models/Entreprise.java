package fr.semifir.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entreprise {

	private String nom;
	private User chef;
	private String batiment;
}

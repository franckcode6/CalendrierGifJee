package fr.humanbooster.calendrierGifJee.service;

import java.time.LocalDate;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Jour;

public interface JourService {

	public Jour ajouterJour(LocalDate jour);

	public List<Jour> recupererJours();
	
	List<Jour> recupererJours(LocalDate dateDebut, int nbJours);

}

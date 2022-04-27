package fr.humanbooster.calendrierGifJee.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.service.JourService;

public class JourServiceImpl implements JourService {

	private static List<Jour> jours = new ArrayList<>();

	/**
	 * Méthode permettant d'ajouter un utilisateur
	 */
	@Override
	public Jour ajouterJour(LocalDate date) {
		Jour jour = new Jour(date);
		jours.add(jour);
		return jour;
	}

	/**
	 * Méthode permettant de récupérer la liste des utilisateurs
	 */
	@Override
	public List<Jour> recupererJours() {
		return jours;
	}

	/**
	 * Méthode permettant de créer un certain nombre de jours
	 */
	@Override
	public List<Jour> recupererJours(LocalDate dateDebut, int nbJours) {
		for (int i = 0; i < nbJours; i++) {
			Jour jour = new Jour(dateDebut.plusDays((long) i));
			jours.add(jour);
		}
		return jours;
	}
}

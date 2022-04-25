package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;

public interface ThemeService {

	/**
	 * Méthode permettant d'ajouter un thème à la liste de thèmes
	 */
	Theme ajouterTheme(String nom);

	/**
	 * Méthode permettant de récupérer la liste de thèmes
	 */
	List<Theme> recupererThemes();

	/**
	 * Méthode permettant de récupérer un thème par id
	 */
	Theme recupererTheme(Long id);

	/**
	 * Méthode permettant de récupérer un thème par nom
	 */
	Theme recupererTheme(String nom);
	
	/**
	 * Méthode permettant de supprimer un thème
	 */
	void supprimerTheme(Long id);

}

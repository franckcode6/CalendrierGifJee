package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;

public interface ThemeService {

	/**
	 * Méthode permettant d'ajouter une Emotion à la liste d'émotions
	 */
	Theme ajouterTheme(String nom);

	/**
	 * Méthode permettant de récupérer la liste d'émotions
	 */
	List<Theme> recupererThemes();

	/**
	 * Méthode permettant de récupérer un thème par id
	 */
	Theme recupererTheme(Long id);

	/**
	 * Méthode permettant de récupérer une émotion par nom
	 */
	Theme recupererTheme(String nom);

}

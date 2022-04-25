package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;
import fr.humanbooster.calendrierGifJee.service.ThemeService;

public class ThemeServiceImpl implements ThemeService {

	private static List<Theme> themes = new ArrayList<>();

	/**
	 * Méthode permettant d'ajouter une Emotion à la liste de thème
	 */
	@Override
	public Theme ajouterTheme(String nom) {
		Theme theme = new Theme(nom);
		themes.add(theme);
		return theme;
	}

	/**
	 * Méthode permettant de récupérer la liste de thèmes
	 */
	@Override
	public List<Theme> recupererThemes() {
		return themes;
	}

	/**
	 * Méthode permettant de récupérer un thème par id
	 */
	@Override
	public Theme recupererTheme(Long id) {
		for (Theme theme : themes) {
			if (theme.getId().equals(id)) {
				return theme;
			}
		}
		return null;
	}

	/**
	 * Méthode permettant de récupérer un thème par nom
	 */
	@Override
	public Theme recupererTheme(String nom) {
		for (Theme theme : themes) {
			if (theme.getNom().equals(nom)) {
				return theme;
			}
		}
		return null;
	}

	/**
	 * Méthode permettant de supprimer un élément par son id
	 */
	public void supprimerTheme(Long id) {
		for (Theme theme : themes) {
			if (theme.getId().equals(id)) {
				themes.remove(theme);
			}
		}

	}

}

package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;

public interface ThemeService {

	Theme ajouterTheme(String nom);

	List<Theme> recupererThemes();

	Theme recupererTheme(Long id);

	Theme recupererTheme(String nom);

}

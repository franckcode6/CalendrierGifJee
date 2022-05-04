package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;

public interface UtilisateurService {

	Utilisateur ajouterUtilisateur(String nom, String prenom, String email, String motDePasse, Theme theme);

	List<Utilisateur> recupererUtilisateurs();

	Utilisateur recupererUtilisateur(Long id);

	Utilisateur recupererUtilisateur(String nom);

	Utilisateur recupererUtilisateur(String email, String motDePasse);

	boolean authentifierUtilisateur(String email, String motDePasse);

}

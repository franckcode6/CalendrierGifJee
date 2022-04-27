package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;

public interface UtilisateurService {

	public Utilisateur ajouterUtilisateur(String nom, String prenom, String email, String motDePasse, Theme theme);

	public List<Utilisateur> recupererUtilisateurs();

	public Utilisateur recupererUtilisateur(Long id);

	public Utilisateur recupererUtilisateur(String nom);

	public boolean authentifierUtilisateur(String email, String motDePasse);

	public void supprimerUtilisateur(Long id);

}

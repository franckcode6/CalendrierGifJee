package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Theme;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {

	private static List<Utilisateur> utilisateurs = new ArrayList<>();
	private static Utilisateur utilisateurConnecte = new Utilisateur();

	/**
	 * Méthode permettant d'ajouter un utilisateur
	 */
	@Override
	public Utilisateur ajouterUtilisateur(String nom, String prenom, String email, String motDePasse, Theme theme) {
		Utilisateur utilisateur = new Utilisateur(nom, prenom, email, motDePasse, theme);
		utilisateurs.add(utilisateur);
		return utilisateur;
	}

	/**
	 * Méthode permettant de récupérer la liste des utilisateurs
	 */
	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * Méthode permettant de récupérer un utilisateur par id
	 */
	@Override
	public Utilisateur recupererUtilisateur(Long id) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getId().equals(id)) {
				return utilisateur;
			}
		}
		return null;
	}

	/**
	 * Méthode permettant de récupérer un utilisateur par nom
	 */
	@Override
	public Utilisateur recupererUtilisateur(String nom) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getNom().equals(nom)) {
				return utilisateur;
			}
		}
		return null;
	}
	
	/**
	 * Méthode permettant de récupérer un utilisateur par nom
	 */
	@Override
	public Utilisateur recupererUtilisateur(String email, String motDePasse) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getEmail().equals(email) && utilisateur.getMotDePasse().equals(motDePasse)) {
				return utilisateur;
			}
		}
		return null;
	}

	/**
	 * Méthode permettant de récupérer un utilisateur par email
	 */
	@Override
	public boolean authentifierUtilisateur(String email, String motDePasse) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getEmail().equals(email) && utilisateur.getMotDePasse().equals(motDePasse)) {
				utilisateur = utilisateurConnecte;
				return true;
			}
		}
		return false;
	}

	/**
	 * Méthode permettant de supprimer un utilisateur par son id
	 */
	public void supprimerUtilisateur(Long id) {
		for (Utilisateur utilisateur : utilisateurs) {
			if (utilisateur.getId().equals(id)) {
				utilisateurs.remove(utilisateur);
			}
		}

	}

}

package fr.humanbooster.calendrierGifJee.business;

import java.time.LocalDateTime;
import java.util.*;

public class Utilisateur {

	private final static int NB_POINTS_INITIAL = 500;

	private Long id;
	private static Long compteur = 0L;
	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private int nbPoints;
	private LocalDateTime dateHeureInscription;
	private Theme theme;
	private ArrayList<Gif> gifs;

	public Utilisateur() {
		id = ++compteur;
		this.nbPoints = NB_POINTS_INITIAL;
		dateHeureInscription = LocalDateTime.now();
		this.gifs = new ArrayList<Gif>();
	}

	public Utilisateur(String nom, String prenom, String email, String motDePasse, Theme theme) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.theme = theme;
	}

	public Utilisateur(String nom, String prenom, String email, String motDePasse, Theme theme, ArrayList<Gif> gifs) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.theme = theme;
		this.gifs = gifs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public LocalDateTime getDateHeureInscription() {
		return dateHeureInscription;
	}

	public void setDateHeureInscription(LocalDateTime dateHeureInscription) {
		this.dateHeureInscription = dateHeureInscription;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public ArrayList<Gif> getGifs() {
		return gifs;
	}

	public void setGifs(ArrayList<Gif> gifs) {
		this.gifs = gifs;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", motDePasse="
				+ motDePasse + ", nbPoints=" + nbPoints + ", dateHeureInscription=" + dateHeureInscription + ", theme="
				+ theme + ", gifs=" + gifs + "]";
	}

}
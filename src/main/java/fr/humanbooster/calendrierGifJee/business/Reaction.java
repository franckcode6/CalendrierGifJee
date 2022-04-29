package fr.humanbooster.calendrierGifJee.business;

import java.time.LocalDateTime;

public class Reaction {

	private Long id;
	private static Long compteur = 0L;
	private LocalDateTime dateHeure;
	private Gif gif;
	private Emotion emotion;
	private Utilisateur utilisateur;

	/**
	 * Default constructor
	 */
	public Reaction() {
		id = ++compteur;
		dateHeure = LocalDateTime.now(); 
	}

	public Reaction(Gif gif, Emotion emotion, Utilisateur utilisateur) {
		this();
		this.gif = gif;
		this.emotion = emotion;
		this.utilisateur = utilisateur;
		gif.getReactions().add(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(LocalDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}

	public Gif getGif() {
		return gif;
	}

	public void setGif(Gif gif) {
		this.gif = gif;
	}

	public Emotion getEmotion() {
		return emotion;
	}

	public void setEmotion(Emotion emotion) {
		this.emotion = emotion;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Reaction [id=" + id + ", dateHeure=" + dateHeure + ", gif=" + gif + ", emotion=" + emotion
				+ ", utilisateur=" + utilisateur + "]";
	}
	
	
}
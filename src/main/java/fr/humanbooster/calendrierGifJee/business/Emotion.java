package fr.humanbooster.calendrierGifJee.business;

public class Emotion {

	private Long id;
	private static Long compteur = 0L;
	private String nom;
	private String code;

	public Emotion() {
		id = ++compteur;
	}

	public Emotion(String nom, String code) {
		this();
		this.nom = nom;
		this.code = code;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Emotion [id=" + id + ", nom=" + nom + ", code=" + code + "]";
	}

}
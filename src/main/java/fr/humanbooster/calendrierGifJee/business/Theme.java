package fr.humanbooster.calendrierGifJee.business;

public class Theme {

	private Long id;
	private static Long compteur = 0L;
	private String nom;

	public Theme() {
		id = ++compteur;
	}

	public Theme(String nom) {
		this();
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Theme [id=" + id + ", nom=" + nom + "]";
	}

}
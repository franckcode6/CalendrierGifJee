package fr.humanbooster.calendrierGifJee.business;

import java.time.LocalDateTime;
import java.util.*;

public abstract class Gif {

    protected Long id;
    private static Long compteur = 0L;
    protected LocalDateTime dateHeureAjout;
    protected String legende;
    private List<Reaction> reactions;
    protected Jour jour;
    private Utilisateur utilisateur;
    
    /**
     * Default constructor
     */
    public Gif() {
    	id = ++compteur;
    	dateHeureAjout = LocalDateTime.now();
    }

	public Gif(String legende, List<Reaction> reactions, Jour jour, Utilisateur utilisateur) {
		this();
		this.legende = legende;
		this.reactions = reactions;
		this.jour = jour;
		this.utilisateur = utilisateur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDateHeureAjout() {
		return dateHeureAjout;
	}

	public void setDateHeureAjout(LocalDateTime dateHeureAjout) {
		this.dateHeureAjout = dateHeureAjout;
	}

	public Jour getJour() {
		return jour;
	}

	public void setJour(Jour jour) {
		this.jour = jour;
	}

	public List<Reaction> getReactions() {
		return reactions;
	}

	public void setReactions(List<Reaction> reactions) {
		this.reactions = reactions;
	}
	
	public String getLegende() {
		return legende;
	}

	public void setLegende(String legende) {
		this.legende = legende;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Gif [id=" + id + ", dateHeureAjout=" + dateHeureAjout + ", legende=" + legende + ", reactions="
				+ reactions + ", jour=" + jour + ", utilisateur=" + utilisateur + "]";
	}
	 
}
package fr.humanbooster.calendrierGifJee.business;

import java.util.List;

public class GifDistant extends Gif {
	
	private String url;

    /**
     * Default constructor
     */
    public GifDistant() {
    }
    
	public GifDistant(String url, String legende, List<Reaction> reactions, Jour jour, Utilisateur utilisateur) {
		super(legende, reactions, jour, utilisateur);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "GifDistant [url=" + url + ", id=" + id + ", dateHeureAjout=" + dateHeureAjout + ", legende=" + legende
				+ ", jour=" + jour + ", getUrl()=" + getUrl() + ", getId()=" + getId() + ", getDateHeureAjout()="
				+ getDateHeureAjout() + ", getJour()=" + getJour() + ", getReactions()=" + getReactions()
				+ ", getLegende()=" + getLegende() + ", getUtilisateur()=" + getUtilisateur() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
}
package fr.humanbooster.calendrierGifJee.business;

public class GifTeleverse extends Gif {

	protected String nomFichierOriginal;

	public GifTeleverse() {
	}

	public GifTeleverse(String nomFichierOriginal, String legende, Jour jour, Utilisateur utilisateur) {
		super(legende, jour, utilisateur);
		this.nomFichierOriginal = nomFichierOriginal;
	}

	public String getNomFichierOriginal() {
		return nomFichierOriginal;
	}

	public void setNomFichierOriginal(String nomFichierOriginal) {
		this.nomFichierOriginal = nomFichierOriginal;
	}

	@Override
	public String toString() {
		return "GifTeleverse [nom=" + nomFichierOriginal + ", getLegende()=" + getLegende() + ", getReaction()="
				+ getReactions() + ", getJour()=" + getJour().getDate() + "]";
	}

}
package fr.humanbooster.calendrierGifJee.business;

public class GifTeleverse extends Gif {

	private String nomFichierOriginal;
	
    /**
     * Default constructor
     */
    public GifTeleverse() {
    }

	public GifTeleverse(String nomFichierOriginal) {
		super();
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
		return "GifTeleverse [nomFichierOriginal=" + nomFichierOriginal + "]";
	}
    
}
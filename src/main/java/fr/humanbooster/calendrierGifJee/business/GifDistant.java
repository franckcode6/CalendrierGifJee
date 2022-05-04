package fr.humanbooster.calendrierGifJee.business;

public class GifDistant extends Gif {

	private String url;

	public GifDistant() {
	}

	public GifDistant(String url, String legende, Jour jour, Utilisateur utilisateur) {
		super(legende, jour, utilisateur);
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
		return "GifDistant [url=" + url + ", getLegende()=" + getLegende() + ", getReaction()=" + getReactions()
				+ ", getJour()=" + getJour().getDate() + "]";
	}

}
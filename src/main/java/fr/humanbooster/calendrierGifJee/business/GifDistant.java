package fr.humanbooster.calendrierGifJee.business;

public class GifDistant extends Gif {
	
	private String url;

    /**
     * Default constructor
     */
    public GifDistant() {
    }
    
	public GifDistant(String url) {
		super();
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
		return "GifDistant [url=" + url + "]";
	}
	
    
}
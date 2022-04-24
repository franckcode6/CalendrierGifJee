package fr.humanbooster.calendrierGifJee.business;

import java.time.LocalDate;

public class Jour {

    private LocalDate date;
    private int nbPoints;
    private Gif gif;
    
    /**
     * Default constructor
     */
    public Jour() {
    	date = LocalDate.now();
    }
    
    public Jour(int nbPoints, Gif gif) {
    	this();
		this.nbPoints = nbPoints;
		this.gif = gif;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public Gif getGif() {
		return gif;
	}

	public void setGif(Gif gif) {
		this.gif = gif;
	}

	@Override
	public String toString() {
		return "Jour [date=" + date + ", nbPoints=" + nbPoints + ", gif=" + gif + "]";
	}
    
}
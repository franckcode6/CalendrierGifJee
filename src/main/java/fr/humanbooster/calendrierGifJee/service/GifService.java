package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.business.Reaction;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;

public interface GifService {
	
	public Gif ajouterGif(String url, String legende, List<Reaction> reactions, Jour jour, Utilisateur utilisateur );

}

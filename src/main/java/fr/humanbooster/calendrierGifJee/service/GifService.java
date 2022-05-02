package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;

public interface GifService {
	
	Gif ajouterGifDistant(String url, String legende, Jour jour, Utilisateur utilisateur );

	List<Gif> recupererGifs();

	Gif recupererGif(Long id);

	Gif ajouterGifTeleverse(String nomFichierOriginal, String legende, Jour jour, Utilisateur utilisateur);
}

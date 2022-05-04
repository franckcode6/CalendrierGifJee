package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.GifDistant;
import fr.humanbooster.calendrierGifJee.business.GifTeleverse;
import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.GifService;

public class GifServiceImpl implements GifService {

	private static List<Gif> gifs = new ArrayList<>();

	@Override
	public Gif ajouterGifDistant(String url, String legende, Jour jour, Utilisateur utilisateur) {
		Gif gif = new GifDistant(url, legende, jour, utilisateur);
		gifs.add(gif);
		return gif;
	}

	@Override
	public Gif ajouterGifTeleverse(String nomFichierOriginal, String legende, Jour jour, Utilisateur utilisateur) {
		Gif gif = new GifTeleverse(nomFichierOriginal, legende, jour, utilisateur);
		gifs.add(gif);
		return gif;
	}

	@Override
	public List<Gif> recupererGifs() {
		return gifs;
	}

	@Override
	public Gif recupererGif(Long id) {
		for (Gif gif : gifs) {
			if (gif.getId().equals(id)) {
				return gif;
			}
		}
		return null;
	}

}

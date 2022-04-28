package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.GifDistant;
import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.business.Reaction;
import fr.humanbooster.calendrierGifJee.business.Theme;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.GifService;
import fr.humanbooster.calendrierGifJee.service.UtilisateurService;

public class GifServiceImpl implements GifService {

	private static List<Gif> gifs = new ArrayList<>();
	
	public Gif ajouterGif(String url, String legende, List<Reaction> reactions, Jour jour, Utilisateur utilisateur) {
		Gif gif = new GifDistant(url, legende, reactions, jour, utilisateur);
	}
}

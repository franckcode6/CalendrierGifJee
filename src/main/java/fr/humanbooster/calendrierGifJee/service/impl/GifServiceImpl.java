package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.GifDistant;
import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.business.Reaction;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.GifService;

public class GifServiceImpl implements GifService {

	private static List<GifDistant> gifDistants = new ArrayList<>();

	@Override
	public GifDistant ajouterGifDistant(String url, String legende, List<Reaction> reactions, Jour jour,
			Utilisateur utilisateur) {
		GifDistant gif = new GifDistant(url, legende, reactions, jour, utilisateur);
		gifDistants.add(gif);
		return gif;
	}
	
	@Override
	public List<GifDistant> recupererGifs() {
		return gifDistants;
	}
	
	@Override
	public Gif recupererGif(String url) {
		for (GifDistant gif : gifDistants) {
			if (gif.getUrl() == url) {
				return gif;
			}
		}
		return null;
	}
	
}

package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Emotion;
import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.Reaction;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.ReactionService;

public class ReactionServiceImpl implements ReactionService {

	private static List<Reaction> reactions = new ArrayList<>();

	/**
	 * Méthode permettant d'ajouter une reaction à la liste de reactions
	 */
	@Override
	public Reaction ajouterReaction(Gif gif, Emotion emotion, Utilisateur utilisateur) {
		Reaction reaction = new Reaction(gif, emotion, utilisateur);
		reactions.add(reaction);
		return reaction;
	}

	/**
	 * Méthode permettant de récupérer la liste de reactions
	 */
	@Override
	public List<Reaction> recupererReactions() {
		return reactions;
	}
}

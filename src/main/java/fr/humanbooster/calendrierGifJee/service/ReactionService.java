package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Emotion;
import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.Reaction;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;

public interface ReactionService {

	/**
	 * Méthode permettant d'ajouter une reaction à la liste de reactions
	 */
	Reaction ajouterReaction(Gif gif, Emotion emotion, Utilisateur utilisateur);

	/**
	 * Méthode permettant de récupérer la liste de reactions
	 */
	List<Reaction> recupererReactions();

}

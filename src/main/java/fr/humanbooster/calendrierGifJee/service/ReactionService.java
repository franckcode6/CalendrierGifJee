package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Emotion;
import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.Reaction;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;

public interface ReactionService {

	Reaction ajouterReaction(Gif gif, Emotion emotion, Utilisateur utilisateur);

	List<Reaction> recupererReactions();

}

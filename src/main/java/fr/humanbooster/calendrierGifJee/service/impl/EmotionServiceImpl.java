package fr.humanbooster.calendrierGifJee.service.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Emotion;
import fr.humanbooster.calendrierGifJee.service.EmotionService;

/**
 * Classe implémentant le service qui lui ait associée On y défini les actions
 * des méthodes "promises" par Service et utilisables par App ou les classes
 * d'un site internet
 * 
 * @author Franck
 *
 */
public class EmotionServiceImpl implements EmotionService {

	// Création d'une collection
	private static List<Emotion> emotions = new ArrayList<>();

	/**
	 * Méthode permettant d'ajouter un Theme à la liste d'émotions
	 */
	@Override
	public Emotion ajouterEmotion(String nom, String code) {
		Emotion emotion = new Emotion(nom, code);
		emotions.add(emotion);
		return emotion;
	}

	/**
	 * Méthode permettant de récupérer la liste d'émotions
	 */
	@Override
	public List<Emotion> recupererEmotions() {
		return emotions;
	}

	/**
	 * Méthode permettant de récupérer une émotion par id
	 */
	@Override
	public Emotion recupererEmotion(Long id) {
		for (Emotion emotion : emotions) {
			if (emotion.getId().equals(id)) {
				return emotion;
			}
		}
		return null;
	}

	/**
	 * Méthode permettant de récupérer une émotion par nom
	 */
	@Override
	public Emotion recupererEmotion(String nom) {
		for (Emotion emotion : emotions) {
			if (emotion.getNom().equals(nom)) {
				return emotion;
			}
		}
		return null;
	}

	/**
	 * Méthode permettant de supprimer un élément par son id
	 */
	public void supprimerEmotion(Long id) {
		for (Emotion emotion : emotions) {
			if (emotion.getId().equals(id)) {
				emotions.remove(emotion);
			}
		}

	}

}

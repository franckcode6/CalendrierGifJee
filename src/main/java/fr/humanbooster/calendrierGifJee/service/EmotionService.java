package fr.humanbooster.calendrierGifJee.service;

import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Emotion;

//Un service est une interface permettant de déterminer les méthodes utilisables par App ou les classes d'un site

/**
 * Création d'une interface de service EmotionService
 * Définition de ses actions possibles, elles sont obligatoirement créées lors de son implémentation
 * @author Franck
 *
 */
public interface EmotionService {

	Emotion ajouterEmotion(String nom, String code);
	
	List<Emotion> recupererEmotions();
	
	//Emotion recupererEmotion(Long id);
	
	//Emotion recupererEmotion(String nom);
}

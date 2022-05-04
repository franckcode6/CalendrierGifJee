package fr.humanbooster.calendrierGifJee.service;

import java.time.LocalDate;
import java.util.List;

import fr.humanbooster.calendrierGifJee.business.Jour;

public interface JourService {

	Jour ajouterJour(LocalDate jour);

	List<Jour> recupererJours();

	Jour recupererJour(LocalDate date);

}

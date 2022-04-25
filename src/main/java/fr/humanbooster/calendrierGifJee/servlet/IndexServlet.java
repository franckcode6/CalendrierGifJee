package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.business.Emotion;
import fr.humanbooster.calendrierGifJee.business.Jour;
import fr.humanbooster.calendrierGifJee.service.EmotionService;
import fr.humanbooster.calendrierGifJee.service.JourService;
import fr.humanbooster.calendrierGifJee.service.impl.EmotionServiceImpl;
import fr.humanbooster.calendrierGifJee.service.impl.JourServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmotionService emotionService = new EmotionServiceImpl();
	private static JourService jourService = new JourServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Création d'une liste d'émotions si la liste est vide
	 */
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init!");
		if (emotionService.recupererEmotions().isEmpty()) {
			emotionService.ajouterEmotion("Souriant", "&#x1F600;");
			emotionService.ajouterEmotion("Monocle", "&#x1F9D0;");
			emotionService.ajouterEmotion("Bisous", "&#x1F618;");
			emotionService.ajouterEmotion("Coeur", "&#x1F60D;");
			emotionService.ajouterEmotion("PTDR", "&#x1F923;");
		}
		
		if (jourService.recupererJours().isEmpty()) {
			for (int i = 0; i < 30; i++) {
				jourService.ajouterJour(LocalDate.of(2022, 04, 01).plusDays((long) i));
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// emotionService.supprimerEmotion((long) 2);
		// Mise en place de l'affichage HTML
		response.getWriter().append("<!DOCTYPE html><html><body>\n");
		// Récupération des émotions via emotionServices
		for (Emotion emotion : emotionService.recupererEmotions()) {
			// Récupéartion du code de chaque Emotion
			response.getWriter().append(emotion.getId() + " : " + emotion.getCode() + "<br>\n");
		}

		// TEST
		//response.getWriter().append(emotionService.recupererEmotion("Coeur").getCode() + "<br>\n");
		//response.getWriter().append(emotionService.recupererEmotion((long) 1).getCode() + "<br>\n");
		// FIN TEST

		response.getWriter().append("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

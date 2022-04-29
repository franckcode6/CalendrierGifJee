package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.EmotionService;
import fr.humanbooster.calendrierGifJee.service.GifService;
import fr.humanbooster.calendrierGifJee.service.impl.EmotionServiceImpl;
import fr.humanbooster.calendrierGifJee.service.impl.GifServiceImpl;

/**
 * Servlet implementation class ReactionServlet
 */
@WebServlet("/reaction")
public class ReactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmotionService emotionService = new EmotionServiceImpl();
	private static GifService gifService = new GifServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReactionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Création des listes à l'initiation de la servlet
	 */
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init!");
		// Ajout des émotions
		if (emotionService.recupererEmotions().isEmpty()) {
			emotionService.ajouterEmotion("Souriant", "&#x1F600;");
			emotionService.ajouterEmotion("Monocle", "&#x1F9D0;");
			emotionService.ajouterEmotion("Bisous", "&#x1F618;");
			emotionService.ajouterEmotion("Coeur", "&#x1F60D;");
			emotionService.ajouterEmotion("PTDR", "&#x1F923;");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Creation d'une variable en Long de l'id du gif
		Long id = Long.parseLong(request.getParameter("gif_id"));
		// Recuperation du gif grace correspondant à cet id
		request.setAttribute("gif", gifService.recupererGif(id));
		// Recuperation des emotions contenue dans le tableau emotions
		request.setAttribute("emotions", emotionService.recupererEmotions());
		request.getRequestDispatcher("WEB-INF/reaction.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long gifId = Long.parseLong(request.getParameter("gif_id"));
		Long emotionId = Long.parseLong(request.getParameter("emotion_id"));
		Utilisateur utilisateur = (Utilisateur) request.getSession().getAttribute("utilisateur");
		
		
		response.sendRedirect("calendrier");
	}

}

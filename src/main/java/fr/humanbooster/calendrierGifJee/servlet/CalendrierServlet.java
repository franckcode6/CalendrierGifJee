package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.service.JourService;
import fr.humanbooster.calendrierGifJee.service.impl.JourServiceImpl;

/**
 * Servlet implementation class CalendrierServlet
 */
@WebServlet("/calendrier")
public class CalendrierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static JourService jourService = new JourServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalendrierServlet() {
		super();
	}

	/**
	 * Création de la liste des jours
	 */
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Calendrier Init!");
		int anneeEnCours = LocalDate.now().getYear();
		int moisEnCours = LocalDate.now().getMonthValue();
		LocalDate localDate = LocalDate.of(anneeEnCours, moisEnCours, 1);
		int nbJoursDuMoisEnCours = localDate.lengthOfMonth();
		for (int i = 1; i <= nbJoursDuMoisEnCours; i++) {
			jourService.ajouterJour(localDate);
			localDate = localDate.plusDays(1);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Récupération de l'utilisateur contenu dans la session
		request.getAttribute("utilisateur");
		// Récupération du tableau de Jours de jouerService
		request.setAttribute("jours", jourService.recupererJours());
		request.getRequestDispatcher("WEB-INF/calendrier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

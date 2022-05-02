package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.GifService;
import fr.humanbooster.calendrierGifJee.service.JourService;
import fr.humanbooster.calendrierGifJee.service.impl.GifServiceImpl;
import fr.humanbooster.calendrierGifJee.service.impl.JourServiceImpl;

/**
 * Servlet implementation class GifDistantServlet
 */
@WebServlet("/calendrier/gifdistant")
public class GifDistantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static GifService gifService = new GifServiceImpl();
	private static JourService jourService = new JourServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GifDistantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/gifDistant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getParameter("url");
		String legende = request.getParameter("legende");
		//Récupération de la date contenue dans l'URL
		LocalDate date = LocalDate.parse(request.getParameter("date"));
		//Récupération de l'utilisateur en session
		Utilisateur utilisateur = (Utilisateur) request.getSession().getAttribute("utilisateur");
		//Creation et ajout d'un gif distant dans le tableau de gifs
		gifService.ajouterGifDistant(
				url, 
				legende, 
				jourService.recupererJour(date), 
				utilisateur);
		//Redirection vers la page calendrier
		response.sendRedirect(request.getContextPath() + "/calendrier");
	}

}

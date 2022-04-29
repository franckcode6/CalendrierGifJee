package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.UtilisateurService;
import fr.humanbooster.calendrierGifJee.service.impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UtilisateurService utilisateurService = new UtilisateurServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emailUtilisateur = request.getParameter("email");
		// System.out.println(emailUtilisateur);
		String mdpUtilisateur = request.getParameter("mot_de_passe");
		// System.out.println(mdpUtilisateur);

		if (utilisateurService.authentifierUtilisateur(emailUtilisateur, mdpUtilisateur)) {
			//Si la connexion est bonne, on créé un objet Utilisateur grace au mail et au mdp indiqués dans le formulaire
			Utilisateur utilisateur = utilisateurService.recupererUtilisateur(emailUtilisateur, mdpUtilisateur);
			//On stock cet utilisateur dans la session
			request.getSession().setAttribute("utilisateur", utilisateur);
			//On redirige vers CalendrierServlet
			response.sendRedirect("calendrier");
		} else {
			//Si Email ou Mdp incorrects, on recharge la page pour nouvelle saisie
			response.sendRedirect("index");
		}

	}
}

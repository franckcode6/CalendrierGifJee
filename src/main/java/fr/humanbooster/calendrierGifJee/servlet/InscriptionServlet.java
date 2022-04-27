package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.service.ThemeService;
import fr.humanbooster.calendrierGifJee.service.UtilisateurService;
import fr.humanbooster.calendrierGifJee.service.impl.ThemeServiceImpl;
import fr.humanbooster.calendrierGifJee.service.impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UtilisateurService utilisateurService = new UtilisateurServiceImpl();
	private static ThemeService themeService = new ThemeServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InscriptionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init!");
		if (utilisateurService.recupererUtilisateurs().isEmpty()) {
			utilisateurService.ajouterUtilisateur("Ito", "Delphine", "d@hb.com", "123",
					themeService.recupererTheme("Bachata"));
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Envoyer la liste des thèmes à l'objet request
		request.setAttribute("themes", themeService.recupererThemes());
		request.getRequestDispatcher("WEB-INF/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomUtilisateur = request.getParameter("nom");
		String prenomUtilisateur = request.getParameter("prenom");
		String emailUtilisateur = request.getParameter("email");
		String mdpUtilisateur = request.getParameter("mot_de_passe");
		
		request.getRequestDispatcher("/index").forward(request, response);
		doGet(request, response);
	}

}

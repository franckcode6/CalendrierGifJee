package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import fr.humanbooster.calendrierGifJee.business.Gif;
import fr.humanbooster.calendrierGifJee.business.GifTeleverse;
import fr.humanbooster.calendrierGifJee.business.Utilisateur;
import fr.humanbooster.calendrierGifJee.service.GifService;
import fr.humanbooster.calendrierGifJee.service.JourService;
import fr.humanbooster.calendrierGifJee.service.impl.GifServiceImpl;
import fr.humanbooster.calendrierGifJee.service.impl.JourServiceImpl;

/**
 * Servlet implementation class GifTeleverseServlet
 */
@WebServlet("/calendrier/gifteleverse")
@MultipartConfig()
public class GifTeleverseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String separateur = System.getProperty("file.separator");
	private static GifService gifService = new GifServiceImpl();
	private static JourService jourService = new JourServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GifTeleverseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/gifTeleverse.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LocalDate date = LocalDate.parse(request.getParameter("date"));
		Utilisateur utilisateur = (Utilisateur) request.getSession().getAttribute("utilisateur");
		String legende = request.getParameter("legende");

		Gif gifTeleverse = gifService.ajouterGifTeleverse(null, legende, jourService.recupererJour(date), utilisateur);

		Collection<Part> parts = request.getParts();

		for (Part part : parts) {
			if (part.getName().equals("fichier")) {
				String chemin = request.getSession().getServletContext().getRealPath("/") + "img" + separateur
						+ gifTeleverse.getId() + ".gif";
				System.out.println(chemin);
				((GifTeleverse) gifTeleverse).setNomFichierOriginal(part.getSubmittedFileName());
				System.out.println(gifService.recupererGifs());
				System.out.println(gifTeleverse);
				part.write(chemin);
			}
		}
		response.sendRedirect(request.getContextPath() + "/calendrier");
	}

}

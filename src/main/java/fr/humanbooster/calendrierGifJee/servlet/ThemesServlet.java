package fr.humanbooster.calendrierGifJee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.calendrierGifJee.business.Theme;
import fr.humanbooster.calendrierGifJee.service.ThemeService;
import fr.humanbooster.calendrierGifJee.service.impl.ThemeServiceImpl;

/**
 * Servlet implementation class ThemesServlet
 */
//@WebServlet est une annotation
@WebServlet(urlPatterns = "/themes", loadOnStartup = 1)
public class ThemesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ThemeService themeService = new ThemeServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThemesServlet() {
		super();
	}

	/**
	 * Création d'une liste de thèmes si la liste est vide
	 */
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init!");
		if (themeService.recupererThemes().isEmpty()) {
			themeService.ajouterTheme("Bachata");
			themeService.ajouterTheme("Dark");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("<!DOCTYPE html><html><body>\n");
		for (Theme theme : themeService.recupererThemes()) {
			response.getWriter().append(theme.getId() + " : " + theme.getNom() + "<br>\n");
		}
		response.getWriter().append("</body></html>");
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

package fr.humanbooster.calendrierGifJee.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckSessionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		HttpServletRequest request = (HttpServletRequest) req;
		
		if (request.getRequestURI().startsWith(request.getContextPath() + "/calendrier") &&
				request.getSession().getAttribute("utilisateur")==null) {
			System.out.println("Pas de session");
			((HttpServletResponse) response).sendRedirect( request.getContextPath() + "/index");
		}
		else {
			chain.doFilter(request, response);
		}
	}
}

package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.main.model.Attori;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class newAttore
 */
@WebServlet("/newAttore")
public class newAttore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public newAttore() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/newat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		int anno_nascita = Integer.parseInt(request.getParameter("anno_nascita"));
		int anno_inizio = Integer.parseInt(request.getParameter("anno_anizio"));
		String img = request.getParameter("img");
		Attori attori = new Attori();
		attori.setNome(nome);
		attori.setCognome(cognome);
		attori.setanno_Nascita(anno_nascita);
		attori.setAnno_Inizio_Carriera(anno_inizio);
		attori.setImg(img);

		try {
			dao.newAttori(attori);
			request.setAttribute("listaAttori", dao.getAttori());	    
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

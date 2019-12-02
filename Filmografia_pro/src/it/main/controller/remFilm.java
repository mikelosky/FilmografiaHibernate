package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.main.model.CaseProduttrici;
import it.main.utils.UtilsDAO;
import it.main.model.Film;

/**
 * Servlet implementation class remFilm
 */
@WebServlet("/remFilm")
public class remFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public remFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Film> listF = dao.getFilm();
			request.setAttribute("listF", listF);
			request.getRequestDispatcher("selectrem_film.jsp").forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_film = Integer.parseInt(request.getParameter("id_film"));
		
		try {
			dao.remFilm(id_film);	    
			request.getRequestDispatcher("doCasaProd").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

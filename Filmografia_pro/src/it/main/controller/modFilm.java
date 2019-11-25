package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.main.model.Attori;
import it.main.model.Film;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class modFilm
 */
@WebServlet("/modFilm")
public class modFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modFilm() {
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
			request.getRequestDispatcher("selectfilmmod.jsp").forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			Film film = dao.getFilm(id);
			request.setAttribute("film", film);
			request.getRequestDispatcher("modattore.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

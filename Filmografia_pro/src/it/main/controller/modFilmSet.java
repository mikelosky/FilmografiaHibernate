package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.main.model.Attori;
import it.main.model.Film;
import it.main.model.CaseProduttrici;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class modFilmSet
 */
@WebServlet("/modFilmSet")
public class modFilmSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modFilmSet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		int anno_uscita = Integer.parseInt(request.getParameter("anno_uscita"));
		int incassi = Integer.parseInt(request.getParameter("incassi"));
		int id_casa_prod = Integer.parseInt(request.getParameter("id_casa_prod"));
		
		String[] attoris= request.getParameterValues("attori_list");
		
		List<Attori> attori_perfor = new ArrayList<>();
		
		int size = attoris.length;
        for (int i=0; i<size; i++){
        	try {
        			attori_perfor.add(dao.getAttori(Integer.parseInt(attoris[i])));		
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
		String img = request.getParameter("img");
		Film film = new Film();
		try {
		film.setId(id);
		film.setNome(nome);
		film.setanno_Uscita(anno_uscita);
		film.setIncassi(incassi);
		film.setcase_Produttrici(dao.getCaseProduttrici(id_casa_prod));
		film.setAttori(attori_perfor);
		
		film.setImg(img);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			dao.newFilm(film);
			//request.setAttribute("listaCaseProduttrici", dao.getCaseProduttrici());	    
			request.getRequestDispatcher("doCasaProd").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;

import it.main.model.Attori;
import it.main.model.Film;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class newPerformano
 */
@WebServlet("/newPerformano")
public class newPerformano extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newPerformano() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setAttribute("listafilm", dao.getFilm());
			request.getRequestDispatcher("selectfilm.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HibernateException exception) {
			System.out.println("Problem creating session factory");
			exception.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_film = Integer.parseInt(request.getParameter("id_film"));
		String[] attoris= request.getParameterValues("attori_list");
		
		Film film = null;
		try {
			film = dao.getFilm(id_film);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		List<Attori> attori_perfor = film.getAttori();
		
		List<Attori> attori_perfor1 = new ArrayList<>();
		
		int size = attoris.length;
        for (int i=0; i<size; i++){
        	try {
        		if( attori_perfor == null){
        			attori_perfor1.add(dao.getAttori(Integer.parseInt(attoris[i])));
        		}
        		else {
        			attori_perfor.add(dao.getAttori(Integer.parseInt(attoris[i])));
        		}
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        if( attori_perfor == null){
        	attori_perfor = attori_perfor1;
		}
	       
		
//		for (Attori attori : attoris) {
//			try {
//				attori_perfor.add(dao.getAttori(attori.getid_Attori()));
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		try {
			film.setAttori(attori_perfor);
			dao.newFilm(film);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			request.setAttribute("listaCaseProduttrici", dao.getCaseProduttrici());
			request.getRequestDispatcher("doCasaProd").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
		
	}
}

package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;

import it.main.model.Attori;
import it.main.model.CaseProduttrici;
import it.main.model.Film;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class newFilm
 */
@WebServlet("/newFilm")
public class newFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<CaseProduttrici> listCP = dao.getCaseProduttrici();
			request.setAttribute("listCP", listCP);
			RequestDispatcher view = request.getRequestDispatcher("/newfi.jsp");
			view.forward(request, response);
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
		String nome = request.getParameter("nome");
		int anno_uscita = Integer.parseInt(request.getParameter("anno_uscita"));
		int incassi = Integer.parseInt(request.getParameter("incassi"));
		int id_casa_prod = Integer.parseInt(request.getParameter("id_casa_prod"));
		String img = request.getParameter("img");
		Film film = new Film();
		film.setNome(nome);
		film.setanno_Uscita(anno_uscita);
		film.setIncassi(incassi);
		try {
			film.setcase_Produttrici(dao.getCaseProduttrici(id_casa_prod));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		film.setImg(img);

		try {
			dao.newFilm(film);
			request.setAttribute("listaFilm", dao.getFilm());	    
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

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

import it.main.model.CaseProduttrici;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class doCasaProd
 */

@WebServlet("/doCasaProd")
public class getCasaProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCasaProd() {
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
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
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
		try {
			List<CaseProduttrici> listCP = dao.getCaseProduttrici();
			request.setAttribute("listCP", listCP);
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
			view.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HibernateException exception) {
			System.out.println("Problem creating session factory");
			exception.printStackTrace();
		}
	}

}

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

import it.main.model.CaseProduttrici;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class modCasaProd
 */
@WebServlet("/modCasaProd")
public class modCasaProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modCasaProd() {
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
		request.getRequestDispatcher("selectcasaprod.jsp").forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_casa_prod = Integer.parseInt(request.getParameter("id_casa_prod"));
		try {
			CaseProduttrici casaproduttrice = dao.getCaseProduttrici(id_casa_prod);
			request.setAttribute("casaproduttrice", casaproduttrice);
			request.getRequestDispatcher("modcasaprod.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

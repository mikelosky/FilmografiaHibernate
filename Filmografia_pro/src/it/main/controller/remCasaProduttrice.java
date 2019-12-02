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
import it.main.utils.UtilsDAO;
import it.main.model.CaseProduttrici;;
/**
 * Servlet implementation class remCasaProduttrice
 */
@WebServlet("/remCasaProduttrice")
public class remCasaProduttrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public remCasaProduttrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<CaseProduttrici> listCP = dao.getCaseProduttrici();
			request.setAttribute("listCP", listCP);
			request.getRequestDispatcher("selectrem_caseproduttrici.jsp").forward(request, response);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_casa_produttrice = Integer.parseInt(request.getParameter("id_casa_produttrice"));
		
		try {
			dao.remCaseProduttrici(id_casa_produttrice);	    
			request.getRequestDispatcher("doCasaProd").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

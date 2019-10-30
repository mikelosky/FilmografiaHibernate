package it.main.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.main.model.CaseProduttrici;
import it.main.utils.UtilsDAO;

/**
 * Servlet implementation class newCasaProd
 */
@WebServlet("/newCasaProd")
public class newCasaProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilsDAO dao = UtilsDAO.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newCasaProd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/newcp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		int anno_fondazione = Integer.parseInt(request.getParameter("anno_fondazione"));
		String sede_principale = request.getParameter("sede_principale");
		String img = request.getParameter("img");
		CaseProduttrici case_produttrici = new CaseProduttrici();
		case_produttrici.setNome(nome);
		case_produttrici.setFondazione(anno_fondazione);
		case_produttrici.setSede(sede_principale);
		case_produttrici.setImg(img);

		try {
			dao.newCaseProduttrici(case_produttrici);
			request.setAttribute("listaCaseProduttrici", dao.getCaseProduttrici());	    
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

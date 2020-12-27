package it.main.utils;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import it.main.model.Attori;
import it.main.model.CaseProduttrici;
import it.main.model.Film;
import it.main.utils.UtilsDAO;

@WebService
public class FilmWS implements IFilmWS {
	private UtilsDAO dao = UtilsDAO.getInstance();

	@Override
	@WebMethod
	public String findAttoreById(int id) {
		try {
			Attori attore = dao.getAttori(id);
			return attore.getNome() + " " + attore.getCognome() + " " + "Anno nascita:" + attore.getanno_Nascita() + " "
					+ "Anno inizio:" + attore.getAnno_Inizio_Carriera();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "An error accourt";
		}
	}

	@Override
	@WebMethod
	public String findFilmById(int id) {
		try {
			Film film = dao.getFilm(id);
			return film.getNome() + " " + "Incassi:" + film.getIncassi() + " " + "Anno Uscita:" + film.getanno_Uscita();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "An error accourt";
		}
	}

	@Override
	@WebMethod
	public String findCasaProById(int id) {
		try {
			CaseProduttrici casaprod = dao.getCaseProduttrici(id);
			return casaprod.getNome() + " " + "Sede:" + casaprod.getSede() + " " + "Anno fondazione:"
					+ casaprod.getFondazione();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "An error accourt";
		}
	}

}

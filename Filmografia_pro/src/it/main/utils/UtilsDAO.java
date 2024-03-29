package it.main.utils;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import it.main.model.Attori;
import it.main.model.CaseProduttrici;
import it.main.model.Film;

public class UtilsDAO {
	protected static EntityManager em;
	protected static EntityManagerFactory emf;
	protected static EntityTransaction tx = null;
	private static UtilsDAO dao;

	private UtilsDAO() {
		emf = Persistence.createEntityManagerFactory("persistence");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	public static UtilsDAO getInstance() {
		if (emf == null) {
			dao = new UtilsDAO();
		}
		return dao;
	}
	
	
	public void remAttori(int id) throws SQLException {
		Attori attori = getAttori(id);
		
		tx.begin();
		em.remove(attori);
		tx.commit();
	}	
	
	public void remCaseProduttrici(int id) throws SQLException {
		CaseProduttrici case_produttrici = getCaseProduttrici(id);
		
		tx.begin();
		em.remove(case_produttrici);
		tx.commit();
	}
	
	public void remFilm(int id) throws SQLException {
		Film film = getFilm(id);
		
		tx.begin();
		em.remove(film);
		tx.commit();
	}
	

	public void newCaseProduttrici(CaseProduttrici case_produttrici) throws SQLException {
		tx.begin();
		em.merge(case_produttrici);
		tx.commit();
	}

	public List<CaseProduttrici> getCaseProduttrici() throws SQLException {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<CaseProduttrici> cq = cb.createQuery(CaseProduttrici.class);
		Root<CaseProduttrici> case_produttrici = cq.from(CaseProduttrici.class);
		cq.select(case_produttrici);
		TypedQuery<CaseProduttrici> q = em.createQuery(cq);
		List<CaseProduttrici> allCaseProduttrici = q.getResultList();
		return allCaseProduttrici;
	}
	
	public CaseProduttrici getCaseProduttrici(int id) throws SQLException{
		return em.find(CaseProduttrici.class, id);
	}
	
	public Film getFilm(int id) throws SQLException{
		return em.find(Film.class, id);
	}
	
	public Attori getAttori(int id) throws SQLException{
		return em.find(Attori.class, id);
	}
	
	public void newAttori(Attori attori) throws SQLException {
		tx.begin();
		em.merge(attori);
		tx.commit();
	}

	public List<Attori> getAttori() throws SQLException {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Attori> cq = cb.createQuery(Attori.class);
		Root<Attori> attori = cq.from(Attori.class);
		cq.select(attori);
		TypedQuery<Attori> q = em.createQuery(cq);
		List<Attori> allAttori = q.getResultList();
		return allAttori;
	}
	
	public void newFilm(Film film) throws SQLException {
		tx.begin();
		em.merge(film);
		tx.commit();
	}
	
	public List<Film> getFilm() throws SQLException {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Film> cq = cb.createQuery(Film.class);
		Root<Film> film = cq.from(Film.class);
		cq.select(film);
		TypedQuery<Film> q = em.createQuery(cq);
		List<Film> allFilm = q.getResultList();
		return allFilm;
	}
	
	public int lastFilm(Film film) throws SQLException {
		Film mFilm;
		tx.begin();
		mFilm = em.merge(film);
		tx.commit();
		return mFilm.getId();
	}

}

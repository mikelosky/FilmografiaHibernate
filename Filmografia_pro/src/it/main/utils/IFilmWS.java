package it.main.utils;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IFilmWS {	
	
	@WebMethod
	String findAttoreById(int id);
	
	@WebMethod
	String findFilmById(int id);
	
	@WebMethod
	String findCasaProById(int id);

}
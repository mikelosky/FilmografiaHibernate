package it.main.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="attori")
public class Attori implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id_attori;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "anno_nascita")
	private int anno_nascita;
	
	@Column(name = "anno_inizio_carriera")
	private int anno_inizio_carriera;
	
	@Column(name = "img")
	private String img;
	
	@ManyToMany(mappedBy = "attori")
    private Set<Film> film = new HashSet<>();

	public int getid_Attori() {
		return id_attori;
	}

	public void setid_Attori(int id_attori) {
		this.id_attori = id_attori;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getanno_Nascita() {
		return anno_nascita;
	}

	public void setanno_Nascita(int anno_nascita) {
		this.anno_nascita = anno_nascita;
	}
	
	public int getAnno_Inizio_Carriera() {
		return anno_inizio_carriera;
	}

	public void setAnno_Inizio_Carriera(int anno_inizio_carriera) {
		this.anno_inizio_carriera = anno_inizio_carriera;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}

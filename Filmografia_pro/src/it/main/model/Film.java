package it.main.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="film")
public class Film implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id_film;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "anno_uscita")
	private int anno_uscita;
	
	@Column(name = "incassi")
	private int incassi;
	
	@Column(name = "img")
	private String img;
	
	@ManyToOne
	@JoinColumn(name = "id_casa_prod")
	private CaseProduttrici case_produttrici;
	
	@ManyToMany
    @JoinTable(
        name = "perfomano", 
        joinColumns = { @JoinColumn(name = "id_film") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_attori") }
    )
    private Set<Attori> attori = new HashSet<>();

	public int getid_Film() {
		return id_film;
	}

	public void setid_Film(int id_film) {
		this.id_film = id_film;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getanno_Uscita() {
		return anno_uscita;
	}

	public void setanno_Uscita(int anno_uscita) {
		this.anno_uscita = anno_uscita;
	}
	
	public int getIncassi() {
		return incassi;
	}

	public void setIncassi(int incassi) {
		this.incassi = incassi;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	public CaseProduttrici getcase_Produttrici() {
		return case_produttrici;
	}

	public void setcase_Produttrici(CaseProduttrici case_produttrici) {
		this.case_produttrici = case_produttrici;
	}
}

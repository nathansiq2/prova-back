package com.cidades.API.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cidade implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String ibge_id;
	
	private String name;
	
	private String uf;

	private String capital;
	
	private Double lon;
	
	private Double lat;
	
	private String no_accents;
	
	private String alternative_names;
	
	private String microregion;
	
	private String mesoregion;
	
	public Cidade() {
				
	}
	
	public Cidade(String ibge_id, String uf, String name, String capital, Double lon, Double lat,
			String no_accents, String alternative_names, String microregion, String mesoregion) {
		super();
		this.ibge_id = ibge_id;
		this.name = name;
		this.uf = uf;
		this.capital = capital;
		this.lon = lon;
		this.lat = lat;
		this.no_accents = no_accents;
		this.alternative_names = alternative_names;
		this.microregion = microregion;
		this.mesoregion = mesoregion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIbge_id() {
		return ibge_id;
	}

	public void setIbge_id(String ibge_id) {
		this.ibge_id = ibge_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public String getNo_accents() {
		return no_accents;
	}

	public void setNo_accents(String no_accents) {
		this.no_accents = no_accents;
	}

	public String getAlternative_names() {
		return alternative_names;
	}

	public void setAlternative_names(String alternative_names) {
		this.alternative_names = alternative_names;
	}

	public String getMicroregion() {
		return microregion;
	}

	public void setMicroregion(String microregion) {
		this.microregion = microregion;
	}

	public String getMesoregion() {
		return mesoregion;
	}

	public void setMesoregion(String mesoregion) {
		this.mesoregion = mesoregion;
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", ibge_id=" + ibge_id + ", name=" + name + ", uf=" + uf + "]";
	}

}

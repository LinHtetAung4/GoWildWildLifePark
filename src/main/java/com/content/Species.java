package com.content;

public class Species {
	int idspecies;
	String lifestyle;
	String status;
	String speciesgroup;
	String speciestype;
	public int getIdspecies() {
		return idspecies;
	}
	public void setIdspecies(int idspecies) {
		this.idspecies = idspecies;
	}
	public String getLifestyle() {
		return lifestyle;
	}
	public void setLifestyle(String lifestyle) {
		this.lifestyle = lifestyle;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSpeciesgroup() {
		return speciesgroup;
	}
	public void setSpeciesgroup(String speciesgroup) {
		this.speciesgroup = speciesgroup;
	}
	public String getSpeciestype() {
		return speciestype;
	}
	public void setSpeciestype(String speciestype) {
		this.speciestype = speciestype;
	}
	public Species(int _idspecies, String _lifestyle, String _status, String _speciesgroup, String _speciestype) {
		this.idspecies= _idspecies;
		this.lifestyle= _lifestyle;
		this.status= _status;
		this.speciesgroup= _speciesgroup;
		this.speciestype= _speciestype;
		
	}
	public Species( String _lifestyle, String _status, String _speciesgroup, String _speciestype) {
		this.lifestyle= _lifestyle;
		this.status= _status;
		this.speciesgroup= _speciesgroup;
		this.speciestype= _speciestype;
		
	}
}

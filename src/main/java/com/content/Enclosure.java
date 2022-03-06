package com.content;

public class Enclosure {
	private int idenclosure;
	private String location;
	private String type;
	public int getIdenclosure() {
		return idenclosure;
	}
	public void setIdenclosure(int idenclosure) {
		this.idenclosure = idenclosure;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Enclosure(int _idenclosure, String _type, String _location) {
		this.idenclosure= _idenclosure;
		this.location= _location;
		this.type= _type;
			
	}
	public Enclosure( String _type, String _location) {
		this.type= _type;
		this.location= _location;
		
		
	
}
}

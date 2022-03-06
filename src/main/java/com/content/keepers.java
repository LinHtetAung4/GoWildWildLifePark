package com.content;

public class keepers {
int idkeepers;
String name;
String date_of_birth;
String keeper_email;
String keeper_phone;
String rank;


public int getIdkeepers() {
	return idkeepers;
}
public void setIdkeepers(int idkeepers) {
	this.idkeepers = idkeepers;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate_of_birth() {
	return date_of_birth;
}
public void setDate_of_birth(String date_of_birth) {
	this.date_of_birth = date_of_birth;
}
public String getKeeper_email() {
	return keeper_email;
}
public void setKeeper_email(String keeper_email) {
	this.keeper_email = keeper_email;
}
public String getKeeper_phone() {
	return keeper_phone;
}
public void setKeeper_phone(String keeper_phone) {
	this.keeper_phone = keeper_phone;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}


public keepers(int _idkeepers, String _name, String _date_of_birth, String _keeper_email, String _keeper_phone, String _rank) {
	this.idkeepers= _idkeepers;
	this.name= _name;
	this.date_of_birth= _date_of_birth;
	this.keeper_email= _keeper_email;
	this.keeper_phone= _keeper_phone;
	this.rank= _rank;
	
}
public keepers( String _name, String _date_of_birth, String _keeper_email, String _keeper_phone, String _rank) {
	
	this.name= _name;
	this.date_of_birth= _date_of_birth;
	this.keeper_email= _keeper_email;
	this.keeper_phone= _keeper_phone;
	this.rank= _rank;

}

}


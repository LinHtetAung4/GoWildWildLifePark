package com.content;

public class Animal {
private int idanimal;
private String name;
private String gender;
private int year;
private int idspecies;
private int idkeepers;
private int idenclosure;
private int iddiet;
private String keepername;
private int totalanimals;


public String getKeepername() {
	return keepername;
}
public void setKeepername(String keepername) {
	this.keepername = keepername;
}
public int getTotalanimals() {
	return totalanimals;
}
public void setTotalanimals(int totalanimals) {
	this.totalanimals = totalanimals;
}
public int getIdanimal() {
	return idanimal;
}
public void setIdanimal(int idanimal) {
	this.idanimal = idanimal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getIdspecies() {
	return idspecies;
}
public void setIdspecies(int idspecies) {
	this.idspecies = idspecies;
}
public int getIdkeepers() {
	return idkeepers;
}
public void setIdkeepers(int idkeepers) {
	this.idkeepers = idkeepers;
}
public int getIdenclosure() {
	return idenclosure;
}
public void setIdenclosure(int idenclosure) {
	this.idenclosure = idenclosure;
}
public int getIddiet() {
	return iddiet;
}
public void setIddiet(int iddiet) {
	this.iddiet = iddiet;
}
public Animal( int _idanimal, String _name, String _gender, int _year, int _idspecies, int _idkeepers, int _idenclosure, int _iddiet) {
	this.idanimal= _idanimal;
	this.name= _name;
	this.gender= _gender;
	this.year= _year;
	this.idspecies= _idspecies;
	this.idkeepers= _idkeepers;
	this.idenclosure= _idenclosure;
	this.iddiet= _iddiet;
}
public Animal(String _name, String _gender, int _year, int _idspecies, int _idkeepers, int _idenclosure, int _iddiet) {
	this.name= _name;
	this.gender= _gender;
	this.year= _year;
	this.idspecies= _idspecies;
	this.idkeepers= _idkeepers;
	this.idenclosure= _idenclosure;
	this.iddiet= _iddiet;
}
public Animal (int _animalId,String _name,String _gender,int _year,int _keeperId,String _keepername) {
	this.idanimal=_animalId;
	this.name=_name;
	this.gender=_gender;
	this.year=_year;
	this.idkeepers=_keeperId;
	this.keepername=_keepername;
}
public Animal (String _keepername, int _totalanimals) {
	this.keepername=_keepername;
	this.totalanimals=_totalanimals;
}

}

package com.content;

public class Diet {
private int iddiet;
private String diettype;
private int numberoffeed;
public int getIddiet() {
	return iddiet;
}
public void setIddiet(int iddiet) {
	this.iddiet = iddiet;
}
public String getDiettype() {
	return diettype;
}
public void setDiettype(String diettype) {
	this.diettype = diettype;
}
public int getNumberoffeed() {
	return numberoffeed;
}
public void setNumberoffeed(int numberoffeed) {
	this.numberoffeed = numberoffeed;
}
public Diet(int _iddiet, String _diettype, int _numberoffeed) {
	this.iddiet= _iddiet;
	this.diettype= _diettype;
	this.numberoffeed= _numberoffeed;
		
}
public Diet( String _diettype, int _numberoffeed) {
	this.diettype= _diettype;
	this.numberoffeed= _numberoffeed;
		
}
}

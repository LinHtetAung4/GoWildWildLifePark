package com.dbconnector;
import java.sql.*;
import com.content.keepers;
import com.crud.*;
public class DBManagerTest {
	public static void main(String[]args) {
//Select
		
		DBManager dbManager = new DBManager();
		try {
		dbManager.getConnection();
		System.out.println("Connection Successfully");
		keepers c= new keepers (null, null, null, null, null);
		c.setName("Lin Htet Aung");
		c.setDate_of_birth("2022-2-17");
		c.setKeeper_email("linhte12@gmail.com");
		c.setKeeper_phone("09771518030");
		c.setRank("Senior");
		keeperManager km = new keeperManager();
		int rowInserted = km.insert(c);
		if (rowInserted==1) {
			System.out.print("Successfully inserted");
		}
	}
	catch(ClassNotFoundException | SQLException e) {
		//TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
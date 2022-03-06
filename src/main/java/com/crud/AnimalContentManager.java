package com.crud;
import java.util.*;
import com.dbconnector.*;
import com.content.*;
import java.sql.*;
public class AnimalContentManager {
	public int insert (Animal a) throws ClassNotFoundException, SQLException {
		int result=-1;
		DBManager dbMgr = new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `go_wildwildlife_park`.`animal`\r\n"
				+ "(`name`,\r\n"
				+ "`gender`,\r\n"
				+ "`year`,\r\n"
				+ "`idspecies`,\r\n"
				+ "`idkeeper`,\r\n"
				+ "`idenclosure`,\r\n"
				+ "`iddiet`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?,?,?,?);\r\n";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, a.getName());
		pstmt.setString(2,a.getGender());
		pstmt.setInt(3, a.getYear());
		pstmt.setInt(4, a.getIdspecies());
		pstmt.setInt(5, a.getIdkeepers());
		pstmt.setInt(6, a.getIdenclosure());
		pstmt.setInt(7, a.getIddiet());
		result=pstmt.executeUpdate();
		//3.execute statement
		conn.close();
		return result;
		
	}
	public ArrayList<Animal> selectAllAnimalsByKeeperName() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Animal animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select animal.idanimal,animal.name,animal.gender,animal.year,keepers.idkeepers,keepers.name \r\n"
				+ "from animal left join keepers on animal.idkeeper =keepers.idkeepers;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animal(rs.getInt("idanimal"),
					rs.getString("name"),
					rs.getString("gender"),
					rs.getInt("year"),
					rs.getInt("idkeepers"),
					rs.getString("name"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animal> selectTotalAnimalCount() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Animal animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select keepers.name,count(animal.idanimal) as totalanimal \r\n"
				+ "from animal left join keepers on animal.idkeeper=keepers.idkeepers group by idkeepers;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animal(rs.getString("name"),
					rs.getInt("totalanimal"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animal> selectAllAnimals() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Animal animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="SELECT `animal`.`idanimal`,\r\n"
				+ "    `animal`.`name`,\r\n"
				+ "    `animal`.`gender`,\r\n"
				+ "    `animal`.`year`,\r\n"
				+ "    `animal`.`idspecies`,\r\n"
				+ "    `animal`.`idkeeper`,\r\n"
				+ "    `animal`.`idenclosure`,\r\n"
				+ "    `animal`.`iddiet`\r\n"
				+ "FROM `go_wildwildlife_park`.`animal`";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animal(rs.getInt("idanimal"),
					 rs.getString("name"),
					 rs.getString("gender"),
					 rs.getInt("year"),
					 rs.getInt("idspecies"),
					 rs.getInt("idkeeper"),
					 rs.getInt("idenclosure"),
					 rs.getInt("iddiet"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
}

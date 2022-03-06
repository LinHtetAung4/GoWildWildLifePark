package com.crud;
import java.util.*;
import java.sql.*;
import com.content.*;
import com.dbconnector.*;
public class EnclosureManager {
	public int insert (Enclosure c) throws ClassNotFoundException, SQLException {
		int result=-1;
		DBManager dbMgr = new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `go_wildwildlife_park`.`enclosures`\r\n"
				+ "(\r\n"
				+ "`type`,\r\n"
				+ "`location`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, c.getLocation());
		pstmt.setString(2,c.getType());
		
		result=pstmt.executeUpdate();
		//3.execute statement
		conn.close();
		return result;
		
	}
	public ArrayList<Enclosure>selectAll() throws ClassNotFoundException, SQLException{
		ArrayList<Enclosure> enclosures = new ArrayList<Enclosure>();
		Enclosure e;
		DBManager dbMgr=new DBManager();
		Connection conn= dbMgr.getConnection();
		String sql="SELECT `enclosures`.`idenclosure`,\r\n"
				+ "    `enclosures`.`type`,\r\n"
				+ "    `enclosures`.`location`\r\n"
				+ "FROM `go_wildwildlife_park`.`enclosures`";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			e=new Enclosure(rs.getInt("idenclosure"),
					rs.getString("type"),
					rs.getString("location"));
			enclosures.add(e);
			}
		conn.close();
		return enclosures;
	
}
	public Enclosure getById(int id) throws ClassNotFoundException, SQLException {
		DBManager dbMgr=new DBManager();
		Enclosure e = null;
		Connection conn=dbMgr.getConnection();
		String sql="SELECT `enclosures`.`idenclosure`,\r\n"
				+ "    `enclosures`.`type`,\r\n"
				+ "    `enclosures`.`location`\r\n"
				+ "FROM `go_wildwildlife_park`.`enclosures`where `enclosures`.`idenclosure`=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			e = new Enclosure(rs.getInt("idenclosure"),
					rs.getString("type"),
					rs.getString("location"));
			}
		conn.close();
		return e;
	}
	public int update(Enclosure e) throws ClassNotFoundException, SQLException{
		
		int result=-1;
		
		//1. get connection
		DBManager dbMgr=new DBManager();
		Connection conn=dbMgr.getConnection();
		
		//2.prepare statement
		
		String sql = "UPDATE `go_wildwildlife_park`.`enclosures`\r\n"
				+ "SET\r\n"
				+ "`type` = ?,\r\n"
				+ "`location` = ?\r\n"
				+ "WHERE `idenclosure` = ?";


		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		// first and second paramters inserted 1. course name and course text
		
		pstmt.setInt(3, e.getIdenclosure());
		pstmt.setString(1, e.getType());
		pstmt.setString(2, e.getLocation());
		
		
		
		//3.execute statement
		
		result = pstmt.executeUpdate();
		
		return result;
		
	}
	public int delete (int id) throws SQLException, ClassNotFoundException {
	    int rowsDeleted = -1;
	    String sql ;
		//1. get Connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		
		//2. prepare the statement 
	    sql = "DELETE FROM `go_wildwildlife_park`.`enclosures`\r\n"
	    		+ "WHERE `idenclosure` = ?";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    //First parameter is the course id of the course entity
	    pstmt.setInt(1, id);

	    rowsDeleted = pstmt.executeUpdate();
	    return rowsDeleted;
	}
}


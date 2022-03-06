package com.crud;
import java.sql.*;
import java.util.*;
import com.content.*;
import com.dbconnector.*;
public class keeperManager {
public int insert (keepers c) throws ClassNotFoundException, SQLException {
	int result=-1;
	DBManager dbMgr = new DBManager();
	Connection conn=dbMgr.getConnection();
	String sql="INSERT INTO `go_wildwildlife_park`.`keepers`\r\n"
			+ "(`name`,\r\n"
			+ "`date_of_birth`,\r\n"
			+ "`keeper_email`,\r\n"
			+ "`keeper_phone`,\r\n"
			+ "`rank`)\r\n"
			+ "VALUES\r\n"
			+ "(?,?,?,?,?)";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setString(1, c.getName());
	pstmt.setString(2,c.getDate_of_birth());
	pstmt.setString(3, c.getKeeper_email());
	pstmt.setString(4, c.getKeeper_phone());
	pstmt.setString(5, c.getRank());
	result=pstmt.executeUpdate();
	//3.execute statement
	conn.close();
	return result;
	
}
public ArrayList<keepers>selectAll() throws ClassNotFoundException, SQLException{
	ArrayList<keepers> keeper = new ArrayList<keepers>();
	keepers k;
	DBManager dbMgr=new DBManager();
	Connection conn= dbMgr.getConnection();
	String sql="SELECT `keepers`.`idkeepers`,\r\n"
			+ "    `keepers`.`name`,\r\n"
			+ "    `keepers`.`date_of_birth`,\r\n"
			+ "    `keepers`.`keeper_email`,\r\n"
			+ "    `keepers`.`keeper_phone`,\r\n"
			+ "    `keepers`.`rank`\r\n"
			+ "FROM `go_wildwildlife_park`.`keepers`";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	while(rs.next())
	{
		k = new keepers(rs.getInt("idkeepers"),
				rs.getString("name"),
				rs.getString("date_of_birth"),
				rs.getString("keeper_email"),
				rs.getString("keeper_phone"),
				rs.getString("rank"));
		keeper.add(k);
		}
	conn.close();
	return keeper;

}
public keepers getById(int id) throws ClassNotFoundException, SQLException {
	DBManager dbMgr=new DBManager();
	keepers k = null;
	Connection conn=dbMgr.getConnection();
	String sql="SELECT `keepers`.`idkeepers`,`keepers`.`name`,`keepers`.`date_of_birth`,`keepers`.`keeper_email`,`keepers`.`keeper_phone`,`keepers`.`rank`\r\n"
			+ "FROM `go_wildwildlife_park`.`keepers`where `keepers`.`idkeepers`=?;";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1, id);
	ResultSet rs=pstmt.executeQuery();
	while(rs.next())
	{
		k = new keepers(rs.getInt("idkeepers"),
				rs.getString("name"),
				rs.getString("date_of_birth"),
				rs.getString("keeper_email"),
				rs.getString("keeper_phone"),
				rs.getString("rank"));
		}
	conn.close();
	return k;
}
public int update(keepers k) throws ClassNotFoundException, SQLException{
	
	int result=-1;
	
	//1. get connection
	DBManager dbMgr=new DBManager();
	Connection conn=dbMgr.getConnection();
	
	//2.prepare statement
	
	String sql = "UPDATE `go_wildwildlife_park`.`keepers`\r\n"
			+ "SET\r\n"
			+ "`name` = ?,\r\n"
			+ "`date_of_birth` = ?,\r\n"
			+ "`keeper_email` = ?,\r\n"
			+ "`keeper_phone` = ?,\r\n"
			+ "`rank` = ?\r\n"
			+ "WHERE `idkeepers` = ?;";


	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	// first and second parameters inserted 1. course name and course text
	
	pstmt.setInt(6, k.getIdkeepers());
	pstmt.setString(1, k.getName());
	pstmt.setString(2, k.getDate_of_birth());
	pstmt.setString(3, k.getKeeper_email());
	pstmt.setString(4, k.getKeeper_phone());
	pstmt.setString(5, k.getRank());
	
	
	
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
    sql = "DELETE FROM `go_wildwildlife_park`.`keepers`\r\n"
    		+ "WHERE `idkeepers` = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    //First parameter is the course id of the course entity
    pstmt.setInt(1, id);

    rowsDeleted = pstmt.executeUpdate();
    return rowsDeleted;
}
}
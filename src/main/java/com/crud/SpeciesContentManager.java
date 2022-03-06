package com.crud;
import com.content.Species;
import com.dbconnector.DBManager;
import java.sql.*;
public class SpeciesContentManager {
	public int insert (Species s) throws ClassNotFoundException, SQLException {
		int result=-1;
		DBManager dbMgr = new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `go_wildwildlife_park`.`species`\r\n"
				+ "(`lifestyle`,\r\n"
				+ "`status`,\r\n"
				+ "`species_group`,\r\n"
				+ "`species_type`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, s.getLifestyle());
		pstmt.setString(2, s.getStatus());
		pstmt.setString(3, s.getSpeciesgroup());
		pstmt.setString(4, s.getSpeciestype());
		
		
		result=pstmt.executeUpdate();
		//3.execute statement
		conn.close();
		return result;
		
	}
}

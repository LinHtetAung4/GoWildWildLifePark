package com.crud;
import java.sql.*;
import com.content.Diet;
import com.dbconnector.DBManager;
public class DietManager {
	public int insert (Diet d) throws ClassNotFoundException, SQLException {
		int result=-1;
		DBManager dbMgr = new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `go_wildwildlife_park`.`diet`\r\n"
				+ "(\r\n"
				+ "`diet_type`,\r\n"
				+ "`number_of_feed`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, d.getDiettype());
		pstmt.setInt(2, d.getNumberoffeed());
		result=pstmt.executeUpdate();
		conn.close();
		return result;
		
	}
}

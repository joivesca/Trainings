package mx.com.chilitech.spring.chapter5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;


public class Comparison {

	//Using JDBC to insert a row into database
	private static final String SQL_INSERT_SPITTER= "insert into spitter(username,password,fullname)values(?,?,?)";
	private DataSource dataSource;
	
	public void addSpitter(Spitter spitter) {
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			conn = dataSource.getConnection();
			stmt =conn.prepareStatement(SQL_INSERT_SPITTER);
			stmt.setString(1,spitter.getUserName());
			stmt.setString(2,spitter.getPassword());
			stmt.setString(3,spitter.getFullName());
			stmt.execute();
		} catch(SQLException e){
				// dosomething...notsurewhat,though
		} finally{
			try {
				if (stmt!=null){
					stmt.close();
				}
				if (conn!=null){
					conn.close();
				}
			} catch(SQLException e){
				// I'mevenlesssureaboutwhattodohere
			}
		}
	}
	
	private static final String SQL_UPDATE_SPITTER= "update spitter set username=?,password=?,fullname=? whereid=?";
	public void saveSpitter(Spitter spitter){
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			conn =dataSource.getConnection();
			stmt =conn.prepareStatement(SQL_UPDATE_SPITTER);
			stmt.setString(1,spitter.getUserName());
			stmt.setString(2,spitter.getPassword());
			stmt.setString(3,spitter.getFullName());
			stmt.setString(4,spitter.getId());
			stmt.execute();
		} catch(SQLException e){
			// StillnotsurewhatI'msupposedtodohere
		} finally{
			try {
				if (stmt!=null){
					stmt.close();
				}
				if (conn!=null){
					conn.close();
				}
			} catch(SQLException e){
			// orhere
			}
		}
	}
	
	private static final String SQL_SELECT_SPITTER = "selectid,username,fullnamefromspitterwhereid=?";
	public Spitter getSpitterById(String id){
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			conn = dataSource.getConnection();
			stmt = conn.prepareStatement(SQL_SELECT_SPITTER);
			stmt.setString(1,id);
			rs = stmt.executeQuery();
			Spitter spitter=null;
			if (rs.next()){
				spitter= new Spitter();
				spitter.setId(rs.getString("id"));
				spitter.setUserName(rs.getString("username"));
				spitter.setPassword(rs.getString("password"));
				spitter.setFullName(rs.getString("fullname"));
			}
			return spitter;
		} catch(SQLException e){
		
		} finally{
			if(rs!=null){
				try{
					rs.close();
				} catch(SQLException e){}
				
			}
			if(stmt!=null){
				try{
					stmt.close();
				} catch(SQLException e){}
			}
			if(conn!=null){
				try{
					conn.close();
				} catch(SQLException e){}
			}
		}
		return null;
	}
}

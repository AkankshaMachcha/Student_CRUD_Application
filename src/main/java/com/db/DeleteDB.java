package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDB {
	public static boolean StudentDelete(String stdid) {
		boolean b=false;
		
		Connection con=MyConnection.getConnection();
		PreparedStatement pstat;
		try {
			pstat = con.prepareStatement("delete from studentcrud where studentid=?");
			pstat.setString(1, stdid);
			int i=pstat.executeUpdate();
			if(i>0) {
				System.out.println(i);
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
		
	}
}

package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.admin;

public class LoginDb {
	public static boolean loginOperation(String username, String password) {
		System.out.println(username+" "+password);
		boolean b=false;
		try {
			Connection con=MyConnection.getConnection();
		
			PreparedStatement pstat= con.prepareStatement("select username,password from admin where username=? and password=?");
			pstat.setString(1, username);
			pstat.setString(2, password);
			ResultSet r=pstat.executeQuery();
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2));
				b=true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}

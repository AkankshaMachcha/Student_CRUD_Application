package com.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.Student;

public class DisplayDB {
	public static List<Student> DisplayStudent() {
		
		List<Student> lst=new LinkedList<>();
		try {
			Connection con=MyConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from studentcrud");
			ResultSetMetaData rsm=rs.getMetaData();
			while(rs.next()) {
				Student s=new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				s.setStdId(rs.getString(12));
				lst.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
		
	}

}

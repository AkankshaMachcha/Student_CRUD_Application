package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class SearchDB {
	public static List<Student> SearchStudent(String stdId) {
		List<Student> lst=new ArrayList<>();
		Connection con=MyConnection.getConnection();
		try {
			PreparedStatement pstat=con.prepareStatement("select * from studentcrud where studentid=?");
			pstat.setString(1, stdId);
			
			ResultSet rs=pstat.executeQuery();
			if(rs.next()) {
				Student s=new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				s.setStdId(rs.getString(12));
				lst.add(s);
				
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(1)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getString(12));
			}
			else {
				System.out.println("\n Student not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
		
	}
}

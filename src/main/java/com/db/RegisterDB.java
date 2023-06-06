package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.model.Student;

public class RegisterDB {
	static int i=1;
	public static boolean StuentRegister(List<Student> lst) {
		
		boolean b=false;
		try {
			Connection con=MyConnection.getConnection();
			String s = "insert into studentCrud values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(s);
			
			for(Student stud:lst) {
				
				System.out.println(stud.getFirstName());
				ps.setString(1, stud.getFirstName());
				
				System.out.println(stud.getFatherName());
				ps.setString(2, stud.getFatherName());
				
				System.out.println(stud.getLastName());
				ps.setString(3, stud.getLastName());
				
				System.out.println(stud.getEmail());
				ps.setString(4, stud.getEmail());
				
				System.out.println(stud.getPassword());
				ps.setString(5, stud.getPassword());
				
				System.out.println(stud.getTelephone());
				ps.setString(6, stud.getTelephone());
				
				System.out.println(stud.getDateOfBirth());
				ps.setString(7, stud.getDateOfBirth());
				
				System.out.println( stud.getAddress());
				ps.setString(8, stud.getAddress());
				
				System.out.println(stud.getCity());
				ps.setString(9, stud.getCity());
				
				System.out.println(stud.getState());
				ps.setString(10, stud.getState());

				System.out.println(stud.getZipcode());
				ps.setString(11, stud.getZipcode());
				
				System.out.println(i++);
				ps.setString(12, "STD"+i);
				
			}
			int i=ps.executeUpdate();
			if(i>0) {
				b=true;
				System.out.println("Value Inserted...!");
			}
			else {
				System.out.println("Value is not inserted in table");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return b;
		
	}
	
	public static boolean UpdteStudentReg(List<Student> lst,String id) {
		
		boolean b=false;
		try {
			Connection con=MyConnection.getConnection();
			String s = "update studentCrud  set PASSWORD=?, TELEPHONE=?, ADDRESS=?, CITY=?, STATE=?,ZIP=? where STUDENTID=?";
			PreparedStatement ps=con.prepareStatement(s);
			
			for(Student stud:lst) {
				
							
				System.out.println(stud.getPassword());
				ps.setString(1, stud.getPassword());
				
				System.out.println(stud.getTelephone());
				ps.setString(2, stud.getTelephone());
				
				System.out.println( stud.getAddress());
				ps.setString(3, stud.getAddress());
				
				System.out.println(stud.getCity());
				ps.setString(4, stud.getCity());
				
				System.out.println(stud.getState());
				ps.setString(5, stud.getState());

				System.out.println(stud.getZipcode());
				ps.setString(6, stud.getZipcode());
				System.out.println(id);
				ps.setString(7, id);
				
			}
			int i=ps.executeUpdate();
			if(i>0) {
				b=true;
				System.out.println("Value Inserted...!");
			}
			else {
				System.out.println("Value is not inserted in table");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		return b;
		
	}

}

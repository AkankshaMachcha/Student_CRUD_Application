package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DeleteDB;
import com.db.SearchDB;
import com.model.Student;

/**
 * Servlet implementation class StudentDeleteServlet
 */
@WebServlet("/StudentDeleteServlet")
public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stdid=request.getParameter("std-id");
		List<Student> lst=SearchDB.SearchStudent(stdid);
		PrintWriter out =response.getWriter();
		if(lst!=null) {
			boolean b=DeleteDB.StudentDelete(stdid);
			if(b==true) {
				out.println("<script type=\"text/javascript\">");
			    out.println("alert('Student data deleted successfully!');");
			    out.println("location='Home.html';");
			    out.println("</script>");
			}
			
		}
		else {
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('Somthing went wrong in deletion...!');");
		    out.println("location='DeleteStudent.html';");
		    out.println("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

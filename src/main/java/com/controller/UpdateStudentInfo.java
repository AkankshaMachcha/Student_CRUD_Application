package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.DeleteDB;
import com.db.SearchDB;
import com.model.Student;

/**
 * Servlet implementation class UpdateStudentInfo
 */
@WebServlet("/UpdateStudentInfo")
public class UpdateStudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentInfo() {
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
		Student s=null;
		if(lst!=null) {
			HttpSession session = request.getSession();
			for(int i=0;i<1;i++) {
				s=(Student)lst.get(i);
			}
			System.out.println(s);
			System.out.println(s.getStdId());
			session.setAttribute("data", s);
			response.sendRedirect("UpdateStudentForm.jsp");
			
		}
		else {
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('Somthing went wrong in deletion...!');");
		    out.println("location='UpdateStudent.html';");
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

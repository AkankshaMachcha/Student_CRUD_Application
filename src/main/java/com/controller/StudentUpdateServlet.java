package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.RegisterDB;
import com.model.Student;

/**
 * Servlet implementation class StudentUpdateServlet
 */
@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> lst=new ArrayList<>();
		HttpSession session=request.getSession();
		Object o =session.getAttribute("id");
		String id=(String)o;
		System.out.println("id is:"+id);
		String fname=request.getParameter("inputFname");
		String mname=request.getParameter("inputMname");
		String lname=request.getParameter("inputLname");
		String email=request.getParameter("inputEmail");
		String password=request.getParameter("password");
		System.out.println(request.getParameter("inputTelephone"));
		String no=request.getParameter("inputTelephone");
		String dob=request.getParameter("inputDOB");
		String address=request.getParameter("inputAddress");
		String city=request.getParameter("city");
		String state=request.getParameter("inputState");
		String zip=request.getParameter("inputZip");
		lst.add(new Student(fname,mname,lname,email,password,no,dob,address,city,state,zip));
		PrintWriter out=response.getWriter();
		boolean b=RegisterDB.UpdteStudentReg(lst, id);
		if(b==true) {
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('Student Updated Successfully...!');");
		    out.println("location='Home.html';");
		    out.println("</script>");
		}
		else {
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('Some Problem in Registration...!');");
		    out.println("location='UpdateStudentForm.jsp';");
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



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.DisplayDB;
import com.model.Student;

/**
 * Servlet implementation class DisplayAllStudent
 */
@WebServlet("/DisplayAllStudent")
public class DisplayAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Im here");
		
		String main="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\" integrity=\"sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V\" crossorigin=\"anonymous\"></script>\r\n"
				+ "\r\n"
				+ "<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n"
				+ "<!------ Include the above in your HEAD tag ---------->\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/Main.css\">\r\n"
				+ "<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1\" crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "<style>\r\n"
				+ "	h3{\r\n"
				+ "		font-family:FontAwesome;\r\n"
				+ "		color:#0e1a35;\r\n"
				+ "		margin:10px;\r\n"
				+ "		margin-top:5%;\r\n"
				+ "		margin-left:10%;\r\n"
				+ "	}\r\n"
				+ "	#form-div{\r\n"
				+ "		margin-top:40px;\r\n"
				+ "	}\r\n"
				+ "	#reg-btn{\r\n"
				+ "		margin-bottom: 20px;\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "	#display-std{\r\n"
				+ "		display:none;\r\n"
				+ "	}\r\n"
				+ "table {\r\n"
				+ "  font-family: arial, sans-serif;\r\n"
				+ "  border-collapse: collapse;\r\n"
				+"table-layout:fixed;\r\n"
				+ "}\r\n"
				+ "td, th {\r\n"
				+ "  border: 1px solid #dddddd;\r\n"
				+ "  text-align: left;\r\n"
				+ "  padding: 8px;\r\n"
				+ "}\r\n"
				+"table td ,th{\r\n"
				+ "    width: 10px;\r\n"
				+ "    overflow: hidden;\r\n"
				+ "    text-overflow: ellipsis;\r\n"
				+ "}\r\n"
				+"th{\r\n"
				+ "background-color: #0e1a35;\r\n"
				+"color:White;\r\n"
				+"}\r\n"
				+ "\r\n"
				+ "tr:nth-child(even) {\r\n"
				+ "  background-color: #dddddd;\r\n"
				+ "}\r\n"
				+".div-tab{\r\n"
				+"width:400px;"
				+"}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body class=\"home\" onload=(DisplayAllStudent.java)>\r\n"
				+ "<div class=\"container-fluid display-table\">\r\n"
				+ "        <div class=\"row display-table-row\">\r\n"
				+ "            <div class=\"col-md-2 col-sm-1 hidden-xs display-table-cell v-align box\" id=\"navigation\">\r\n"
				+ "                <div class=\"navi\">\r\n"
				+ "                    <ul>\r\n"
				+ "                    	<li ><a href=\"Login.html\"><i  aria-hidden=\"true\">\r\n"
				+ "                    	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-person-fill\" viewBox=\"0 0 16 16\">\r\n"
				+ "  <path d=\"M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z\"/>\r\n"
				+ "</svg></i><span class=\"hidden-xs hidden-sm\">Sign In</span></a></li>\r\n"
				+ "                        <li><a href=\"Home.html\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i><span class=\"hidden-xs hidden-sm\">Home</span></a></li>\r\n"
				+ "                        <li ><a href=\"AddStudent.html\"><i aria-hidden=\"true\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"20\" fill=\"currentColor\" class=\"bi bi-bag-plus-fill\" viewBox=\"0 0 16 16\">\r\n"
				+ "  <path fill-rule=\"evenodd\" d=\"M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5v-.5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0zM8.5 8a.5.5 0 0 0-1 0v1.5H6a.5.5 0 0 0 0 1h1.5V12a.5.5 0 0 0 1 0v-1.5H10a.5.5 0 0 0 0-1H8.5V8z\"/>\r\n"
				+ "</svg></i><span class=\"hidden-xs hidden-sm\">Add student</span></a></li>\r\n"
				+ "                        <li ><a href=\"DeleteStudent.html\"><i aria-hidden=\"true\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"20\" fill=\"currentColor\" class=\"bi bi-bag-dash-fill\" viewBox=\"0 0 16 16\">\r\n"
				+ "  <path fill-rule=\"evenodd\" d=\"M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5v-.5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0zM6 9.5a.5.5 0 0 0 0 1h4a.5.5 0 0 0 0-1H6z\"/>\r\n"
				+ "</svg></i><span class=\"hidden-xs hidden-sm\">Delete student</span></a></li>\r\n"
				+ "                        <li class=\"active\"><a href=\"\\DisplayStudent\"><i  aria-hidden=\"true\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"20\" fill=\"currentColor\" class=\"bi bi-bag-fill\" viewBox=\"0 0 16 16\">\r\n"
				+ "  <path d=\"M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5z\"/>\r\n"
				+ "</svg></i><span class=\"hidden-xs hidden-sm\">Student Data</span></a></li>\r\n"
				+ "                        <li><a href=\"UpdateStudent.html\"><i aria-hidden=\"true\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"20\" fill=\"currentColor\" class=\"bi bi-bag-check-fill\" viewBox=\"0 0 16 16\">\r\n"
				+ "  <path fill-rule=\"evenodd\" d=\"M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5v-.5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0zm-.646 5.354a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z\"/>\r\n"
				+ "</svg></i><span class=\"hidden-xs hidden-sm\">Update Student</span></a></li>\r\n"
				+ "                        \r\n"
				+"<li style=\"color:White;\"><a ><i aria-hidden=\"true\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"20\" fill=\"currentColor\" class=\"bi bi-bag-check-fill\" viewBox=\"0 0 16 16\">\r\n"
				+ "  <path fill-rule=\"evenodd\" d=\"M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5v-.5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0zm-.646 5.354a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z\"/>\r\n"
				+ "</svg></i><span class=\"hidden-xs hidden-sm\">Log Out</span></a></li>"
				+ "                    </ul>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"div-tab col-md-8 col-sm-7 my-auto position-abolute\">";
		String main2="</div>\r\n"
				+ "</div>\r\n"
				+ "</div>\r\n"
				+ "	<script>\r\n"
				+ "	$(document).ready(function(){\r\n"
				+ "		   $('[data-toggle=\"offcanvas\"]').click(function(){\r\n"
				+ "		       $(\"#navigation\").toggleClass(\"hidden-xs\");\r\n"
				+ "		   });\r\n"
				+ "		});\r\n"
				+ "	function displayInfo(){\r\n"
				+ "		display:block;\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "	</script>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		String str="<table>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>StudentId</th>\r\n"
				+ "				<th>First Name</th>\r\n"
				+ "				<th>Middle Name</th>\r\n"
				+ "				<th>Last Name</th>\r\n"
				+ "				<th>Emai</th>\r\n"
				+ "				<th>Telephone no</th>\r\n"
				+ "				<th>Date Of Birth</th>\r\n"
				+ "				<th>Address</th>\r\n"
				+ "				<th>City</th>\r\n"
				+ "				<th>State</th>\r\n"
				+ "				<th>Zipcode</th>\r\n"
				+ "			</tr>";
		String str2="</table>\r\n";
		PrintWriter out=response.getWriter();
		List<Student> st=DisplayDB.DisplayStudent();
		out.print(main);
		out.print(str);
		for(Student s:st) {
			out.print("<tr>");
			out.print("<td>"+s.getStdId()+"</td><td>"+s.getFirstName()+"<td>"+s.getFatherName()+"</td><td>"+s.getLastName()+"<td>"+s.getEmail()+"</td><td>"+s.getTelephone()+"<td>"+s.getDateOfBirth()+"</td><td>"+s.getAddress()+"<td>"+s.getCity()+"</td><td>"+s.getState()+"<td>"+s.getZipcode()+"</td>");
			out.print("</tr>");
			
		}
		
		out.print(str2);
		out.print(main2);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

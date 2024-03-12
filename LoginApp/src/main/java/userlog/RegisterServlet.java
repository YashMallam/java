package userlog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","2310");
			
			
			String userName=request.getParameter("username");
			String passWord=request.getParameter("password");
			String eMail=request.getParameter("Email");
			
			PreparedStatement pst=con.prepareStatement("INSERT INTO users(username,password,email)VALUES(?,?,?)");
			pst.setString(1, userName);
			pst.setString(2, passWord);
			pst.setString(3, eMail);
			
			int noOfRows=pst.executeUpdate();
			if(noOfRows==1) {
				response.sendRedirect("Login.jsp");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

package userlog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FpServlet")
public class FpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","2310");
			
			String eMail=request.getParameter("Email");
			PreparedStatement pst=con.prepareStatement("SELECT username FROM users WHERE email=?");
			pst.setString(1, eMail);
			ResultSet rset=pst.executeQuery();
			if(rset.next()) {
				
			}else {
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

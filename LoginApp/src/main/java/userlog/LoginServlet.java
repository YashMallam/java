package userlog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","2310");
			
			String eMail=request.getParameter("Email");
			String passWord=request.getParameter("pass");
			PreparedStatement pst=con.prepareStatement("SELECT * FROM users WHERE email='"+eMail+"' AND password='"+passWord+"'");
			ResultSet rset=pst.executeQuery();
			PreparedStatement pst2=con.prepareStatement("SELECT name,code,price FROM products");
			ResultSet rset2=pst2.executeQuery();
	

			LoginModel lg= new LoginModel();
			if(rset.next()) {
				lg.setUsername(rset.getString("username"));
				lg.setPassword(rset.getString("password"));
				lg.setEmail(rset.getString("email"));
				request.setAttribute("login",lg);
				ArrayList<ProductModel> al= new ArrayList<ProductModel>();
					
				while(rset2.next()) {
			
					ProductModel p= new ProductModel();
					p.setName(rset2.getString("name"));
					p.setCode(rset2.getString("code"));
					p.setPrice(rset2.getInt("price"));
					al.add(p);
					request.setAttribute("prod",al);
				}
					RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
					rd.forward(request, response);	
				con.close();
			}else {
				response.sendRedirect("Login.jsp");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

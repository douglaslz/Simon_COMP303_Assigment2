package Assigment.conexion.ca;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConectCrud
 */
@WebServlet("/ConectCrud")
public class ConectCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConectCrud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
		String jdbcUrl = "jdbc:mysql://localhost:3307/hotel_reservation?useSSL=false&serverTimezone=UTC";    
	    String username = "root";
	    String password = "password";
	    String driver = "com.mysql.jdbc.Driver";
	    PrintWriter out = response.getWriter();
	    try  {
	    	
	    	
	    	response.setContentType("text/html");
	    	out.print("Name of the database: "+jdbcUrl);
	    	response.setContentType("text/html");
	    	Class.forName(driver);
	    	Connection con = DriverManager.getConnection(jdbcUrl,username,password);
	    	out.print("Successful conection");
	    	System.out.println("llllllllllllllllllllllllllllllllllllllllll");
	    	con.close();
	    	
	    } catch (Exception e) {
	        e.printStackTrace();
	        out.print("Name of the database: "+jdbcUrl);
	    }
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		String jdbcUrl = "jdbc:mysql://localhost:3307/hotel_reservation?useSSL=false&serverTimezone=UTC";    
	    String username = "root";
	    String password = "password";
	    String driver = "com.mysql.jdbc.Driver";
	    PrintWriter out = response.getWriter();
	    try  {
	    	
	    	
	    	response.setContentType("text/html");
	    	out.print("Name of the database: "+jdbcUrl);
	    	response.setContentType("text/html");
	    	Class.forName(driver);
	    	Connection con = DriverManager.getConnection(jdbcUrl,username,password);
	    	out.print("Successful conection");
	    	con.close();
	    	
	    } catch (Exception e) {
	        e.printStackTrace();
	        out.print("Name of the database: "+jdbcUrl);
	    }
		

	}

}

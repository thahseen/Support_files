package com.thahseen.servlet;
import java.sql.DriverManager;
import java.sql.*;

public class ConProvider {

	public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/hospitaldb","root"," ");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}


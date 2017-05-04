package edu.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1. import necessary packages/classes

import org.postgresql.Driver;

public class LibraryJDBCCall {

	public static void main(String[] args){
		
		Driver d = new Driver();			//2. Register the driver file
		
		try {
			Class.forName("org.postgresql.Driver");
			DriverManager.registerDriver(d);

			//3. create the connection
			Connection conn =  DriverManager.getConnection("jdbc:postgresql:library_mgmt_system",
					"Viggi","password");
			
			// 4. create a statement
			Statement st = conn.createStatement();
			
			//5. execute query
			ResultSet rs = st.executeQuery("SELECT book_name, author, year_published "
					+ " FROM public."+"\"book-info\"");
			
//			int rs2 = st.executeUpdate("INSERT INTO public."+
//					"\"book-info\" VALUES(55555,'Na Savu Nenu Sasta Nek Enduku'"
//					+ ",'Comedy','Job less Graduate',2016,10);");  //only executes once
			
			//6.parse the result
			 while(rs.next()){
				// System.out.println(rs.getInt("book_id"));
				// Integer ID = rs.getInt("book_id");
				 String bookName = rs.getString("book_name");
				// String genre = rs.getString("genre");
				 String author = rs.getString("author");
				 Integer yearPublished = rs.getInt("year_published");
				// Integer cost = rs.getInt("price");
				 System.out.println(bookName+" is written by "+author+" and is published on "
						 			+yearPublished);
			 }
			 
			 //7. close all db objects
			 rs.close();
			 st.close();
			 conn.close();
			
		// 8 handle exceptions if any	 
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}			
		
		
	}
}
 
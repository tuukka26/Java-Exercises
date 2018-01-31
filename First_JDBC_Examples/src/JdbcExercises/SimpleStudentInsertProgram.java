package JdbcExercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import MovieDB_examples.ConnectionParameters;

public class SimpleStudentInsertProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String username = ConnectionParameters.username;			 
		String password = ConnectionParameters.password;
		String databaseURL = ConnectionParameters.databaseURL;
		Connection dbConnection = null;	
 
		System.out.print("Enter student data\nId: ");
		String id = input.nextLine();
		
		System.out.print("First name: ");
		String firstname = input.nextLine();
		
		System.out.print("Last name: ");
		String lastname = input.nextLine();
		
		System.out.print("Street: ");
		String streetAddress = input.nextLine();
		
		System.out.print("Postcode: ");
		String postcode = input.nextLine();
		
		System.out.print("Post office: ");
		String postOffice = input.nextLine();
				
		try {
			dbConnection = DriverManager.getConnection(databaseURL, username, password);
							
			String sqlText = "INSERT INTO Student (id, firstname, lastname, streetaddress, postcode, postoffice) VALUES (?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, firstname);
			preparedStatement.setString(3, lastname);
			preparedStatement.setString(4, streetAddress);
			preparedStatement.setString(5, postcode);
			preparedStatement.setString(6, postOffice);
			
			preparedStatement.executeUpdate();

			System.out.println("\nStudent data saved succesfully!");
			
		} catch (SQLException sqle) {
			
			// First, check if the problem is primary key violation (the error code is vendor-dependent)
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				System.out.println("Cannot insert the student. " +
			        "The student ID (" + id + ") is already in use.");
			} else {
				System.out.println("The database is temporarily unavailable. Please try again later.\n" + sqle.getMessage());
			}
			
		} finally {
			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (SQLException sqle) {
					System.out.println("\nClose connection failed. \n" + sqle.getMessage());
				}
			}
		}
		
		input.close();
	}

}

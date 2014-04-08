import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.GregorianCalendar;

import com.mysql.jdbc.PreparedStatement;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/motorcycle_db","root","");
			Statement state = null;
			ResultSet set = null;
			
			state = conn.createStatement();
			set = state.executeQuery("SELECT * FROM h_producer");
			System.out.println("Alle Hersteller: ");
			printProducer(set);
			
			System.out.println("Insert a Producer:");
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO h_producer VALUES (9,'Derbi','Spanien',1970)");
			set = state.executeQuery("SELECT * FROM h_producer WHERE h_name = 'Derbi'");
			printProducer(set);
			
			//PreparedStatement
			System.out.println("Prepared Statement: Update");
			state = conn.createStatement();
			java.sql.PreparedStatement prepstate = 
					conn.prepareStatement("UPDATE h_producer SET h_name=? WHERE h_hid=?");
			
			prepstate.setString(1, "Rieju");
			prepstate.setInt(2, 9);
			prepstate.executeUpdate();
			
			set = state.executeQuery("SELECT * FROM h_producer WHERE h_name = 'Rieju'");
			printProducer(set);
			
			
			System.out.println("Prepared Statement: Delete");
			state = conn.createStatement();
			prepstate = conn.prepareStatement("DELETE FROM h_producer WHERE h_hid=?");
			prepstate.setInt(1, 9);
			prepstate.executeUpdate();
			
			set = state.executeQuery("SELECT * FROM h_producer");
			printProducer(set);
			
			state =null;
			set=null;
			conn.close();
			
			
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
		
	}
	
	public static void printProducer(ResultSet set){
		try {
			while(set.next()){
				System.out.println("ID: "+set.getInt("h_hid")
						+" Name: "+set.getString("h_name")
						+" Land: "+set.getString("h_country")
						+" Gründungsjahr: "+set.getInt("h_year_of_foundation"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

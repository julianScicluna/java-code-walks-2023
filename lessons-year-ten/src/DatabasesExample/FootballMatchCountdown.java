package DatabasesExample;

import java.sql.*;

public class FootballMatchCountdown {

    public static String FIFA_DB = "database\\FIFAWorldCupQatar2022.mdb";

	public static String TEAMS_QUALIFIED_GROUP_STAGE_SQL = "SELECT Country FROM Teams WHERE TEAMS.[Is Qualified] = TRUE";
    
    public static void main(String[] args) {
        try {
			// Location of the database 
			String url = "jdbc:ucanaccess://" + FIFA_DB;
			// Url, Username, Pasword
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(TEAMS_QUALIFIED_GROUP_STAGE_SQL);
			while (rs.next()) { // if we are pointing to the first result...
				System.out.println(rs.getString("Country"));
			}
			connection.close();
		} catch (SQLException e) {
			System.err.println("Error");
			// Print error into the console so that I can debug the error better
			e.printStackTrace();
		}
    }
}
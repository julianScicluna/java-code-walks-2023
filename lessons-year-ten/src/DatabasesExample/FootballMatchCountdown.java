package DatabasesExample;

import java.sql.*;

public class FootballMatchCountdown {

    public static String FIFA_DB = "jdbc:ucanaccess://database\\FIFAWorldCupQatar2022.mdb";
	public static String TEAMS_QUALIFIED_GROUP_STAGE_SQL = "SELECT [Team ID], Country FROM Teams WHERE TEAMS.[Is Qualified] = TRUE";
    
    public static void main(String[] args) {
        try {
			// Ask the JDBC to create a connection to Microsoft Access
			Connection connection = DriverManager.getConnection(FIFA_DB);
			System.out.println("*** You are connected to FIFA World Cup Qatar Microsoft Access Database ***");
			System.out.println("\n\n");

			System.out.println("Question to the Database:\nWhich country FIFA members from all teams qualified in the tournament?");
			// Let us create the query...
			Statement statement = connection.createStatement();
			// Let us run it...
			ResultSet rs = statement.executeQuery(TEAMS_QUALIFIED_GROUP_STAGE_SQL);
			
			System.out.println("--------------------------------------------------------------------------------------");
			
			while (rs.next()) { // repeat until there are no more results	
				System.out.println(rs.getString("Team ID") + " " + rs.getString("Country"));
			}

			// We do not need this resource anymore, the computer can take it back
			connection.close();
		} catch (SQLException e) {
			System.err.println("Error");
			// Print error into the console so that I can debug the error better
			e.printStackTrace();
		}
    }
}
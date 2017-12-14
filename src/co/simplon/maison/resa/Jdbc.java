package co.simplon.maison.resa;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

	public class Jdbc {

		private final static String url = "jdbc:mysql://localhost:3306/maisonreservation";
	    private final static String user = "admin";
	    private final static  String passwd = "admin";
	    private static Connection connect;

	      
		public void connection() {      
		    try {
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		     
		     connect = DriverManager.getConnection(url, user, passwd);
		      System.out.println("Connexion effective !");         
		         
		    } catch (Exception e) {
		      e.printStackTrace();
		    }      
		}
		
		
		
		public void ecrireEnBase(String nom, String prenom, String telephone, String mail, Date date, int nbNuitee, int nbPersonne, boolean animal, boolean parking, boolean fumeur, String region, String sejour) throws SQLException
		{
			Statement statement = null;
			
			try {
				statement = connect.createStatement();
				String sql = "INSERT INTO `reservation` (`nom`, `prenom`, `telephone`, `mail`, `date`, `nbNuitee`, `nbPersonne`, `animal`, `parking`, `fumeur`, `region`, `sejour`) "
						+ "VALUES ('" + nom + "', '" + prenom + "', '" + telephone + "', '" + mail + "'," + date + ", " + nbNuitee + "," + nbPersonne + "," + animal + "," + parking + "," + fumeur + ", '" + region + "', '" + sejour + "')";
				statement.executeUpdate(sql);
			}
			catch(SQLException e){
				System.out.println("Erreur lors de l'ecriture en base !");
			}
			finally{	 
				statement.close();
			}
		
			System.out.println();
		}
		
		public void ecrireEnBase2(String nom, String prenom, String telephone, String mail, int nbNuitee, int nbPersonne, boolean animal, boolean parking, boolean fumeur, String region, String sejour) throws SQLException
		{
			Statement statement = null;
			
			try {
				statement = connect.createStatement();
				String sql = "INSERT INTO `reservation` (`nom`, `prenom`, `telephone`, `mail`, `nbNuitee`, `nbPersonne`, `animal`, `parking`, `fumeur`, `region`, `sejour`) "
						+ "VALUES ('" + nom + "', '" + prenom + "', '" + telephone + "', '" + mail + "', " + nbNuitee + "," + nbPersonne + "," + animal + "," + parking + "," + fumeur + ", '" + region + "', '" + sejour + "')";
				statement.executeUpdate(sql);
			}
			catch(SQLException e){
				System.out.println("Erreur lors de l'ecriture en base !");
			}
			finally{	 
				statement.close();
			}
		
			System.out.println();
		}
		
		public void showData() throws SQLException
		{
			Statement statement = null;
			ResultSet rs = null;

			try {
				// Create the statement
				statement = connect.createStatement();
				String sql = "SELECT * FROM reservation";
				
				// Execute the query
				rs = statement.executeQuery(sql);
			
				// Loop on the results extracted from the database
				System.out.println("Liste actuelle des apprenants :");
				while (rs.next()) {
					System.out.println("  - " + rs.getString("idreservation") + " : " + rs.getString("nom") + " " +  rs.getString("prenom"));
				}
			}
			catch(SQLException e){
				System.out.println("Erreur lors de la lecture !");
			}
			finally{
						
				statement.close();
			}
			
			System.out.println();
		}
		
		
		public void close() throws SQLException{
		
		connect.close();
		
		}
		
		public ArrayList<MaisonResa> toArray() throws SQLException
		{
			Statement statement = null;
			ResultSet rs = null;
			ArrayList<MaisonResa> liste2 = new ArrayList<MaisonResa>();
			
			try {
				// Create the statement
				statement = connect.createStatement();
				String sql = "SELECT * FROM reservation";
				
				// Execute the query
				rs = statement.executeQuery(sql);
			
				// Loop on the results extracted from the database
				while (rs.next()) {
					MaisonResa resa = new MaisonResa();
					resa.setNom(rs.getString("nom"));
					resa.setPrenom(rs.getString("prenom"));
					resa.setTelephone(rs.getString("telephone"));
					resa.setMail(rs.getString("mail"));
					resa.setDate(rs.getDate("date"));
					resa.setNbNuitee(rs.getInt("nbNuitee"));
					resa.setNbPersonne(rs.getInt("nbPersonne"));
					resa.setRegion(rs.getString("region"));
					resa.setAnimal(rs.getBoolean("animal"));
					resa.setParking(rs.getBoolean("parking"));
					resa.setFumeur(rs.getBoolean("fumeur"));
					resa.setSejour(rs.getString("sejour"));
					
					liste2.add(resa);
					
					
				}
			}
			catch(SQLException e){
				System.out.println("Erreur lors de la lecture !");
			}
			finally{
						
				statement.close();
			}
			
			
			return liste2;
		}	
}
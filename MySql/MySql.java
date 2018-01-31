import java.sql.*;

public class MySql {
	
	private Connection con ;
	
	public MySql(){
		
		try{  
			
			Class.forName("com.mysql.jdbc.Driver");
		
			this.con =  DriverManager.getConnection("jdbc:mysql://localhost/calcetto","root","");
		}
		catch(Exception e){ 
			
			System.out.println(e);
		} 
			
	}
	public void getQuery(){
		
		try{
			//these parameters can help to limit the number of tables that are returned in the ResultSet. 
			//Of these, only the tableNamePattern is set to a non-null value. Is the table you want to obtain the columns of.
			String   catalog           = null;
			String   schemaPattern     = null;
			String   tableNamePattern  = "player";
			String   columnNamePattern = null;
			
			//DatabaseMetaData is an interface - you can obtain meta data about the database you have connected to.
			DatabaseMetaData databaseMetaData = con.getMetaData();
			
			//We get the columns that a table of our db contains 
			ResultSet result = databaseMetaData.getColumns(
					
			    catalog, schemaPattern,  tableNamePattern, columnNamePattern);
			
			 System.out.println("Column of Player Table : " );
			 
			while(result.next()){
				
			    String columnName = result.getString(4);
			    System.out.println( columnName );
			}
		    }
		    catch(Exception e){ 
			
			System.out.println(e);
		}

	}	
	public void insertQuery(String query) {
		try{
			
		//Everytime we run the test class the table 'tourwinners' is updated with the winners 	
			
		Statement stmt = this.con.createStatement(); 
		//System.out.println(query);
		stmt.executeUpdate(query);
		
		}
		catch(Exception e){ 
			
			System.out.println(e);
		} 
	}
	
}

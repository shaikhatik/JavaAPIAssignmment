import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTask {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/inventory_management";
		String username = "root";
		String password = "admin1234";
		
		try {
			 
		    Connection connection = DriverManager.getConnection(dbURL, username, password);
		 
		    if (connection != null) {
		        System.out.println("Database Connected Successfully!");
		        
//		        Add/Create a new product to a database
//		        String query = "INSERT INTO products (cid, bid, product_name, product_price, product_stock, added_date) VALUES"
//		        		+ "(7, 4, 'Infinix', 21000, 500, '2023-08-13')";
//		        Statement statement = connection.createStatement();
//		        
//		        int rows = statement.executeUpdate(query);
//		        
//		        if(rows > 0) {
//		        	System.out.println("New Product Added Successfully!");
//		        }
		        
		       
		        
		        
//		        Get/Read All Products from the database
//		        String query = "SELECT * FROM products";
//		        Statement statement = connection.createStatement();
//		        
//		        ResultSet result = statement.executeQuery(query);
//		        
//		        System.out.println("------Products Data -------");
//		        while(result.next()) {
//		        	System.out.println("Product Id: " + result.getString("pid"));
//		        	System.out.println("Category Id: " + result.getString("cid"));
//		        	System.out.println("Brand Id: " + result.getString("bid"));
//		        	System.out.println("Product Name: " + result.getString("product_name"));
//		        	System.out.println("Product price: " + result.getString("product_price"));
//		        	System.out.println("Product Stock: " + result.getString("product_stock"));
//		        	System.out.println("Added Date: " + result.getString("added_date") + "\n\n\n");
//		        }
		        
		        
		        
		        
//		        Update the product in the database
//		        String query = "UPDATE products SET product_price = 19000 WHERE product_name = 'Infinix'";
//		        Statement statement = connection.createStatement();
//		        
//		        int rows = statement.executeUpdate(query);
//		        
//		        if(rows > 0) {
//		        	System.out.println("Product Updated Successfully!");
//		        }
		        
		        
		        
//		       Delete the product from the Database
//		        String query = "DELETE FROM products WHERE product_name = 'Infinix'";
//		        Statement statement = connection.createStatement();
//		        
//		        int rows = statement.executeUpdate(query);
//		        
//		        if(rows > 0) {
//		        	System.out.println("Product Deleted Successfully!");
//		        }
		        
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}

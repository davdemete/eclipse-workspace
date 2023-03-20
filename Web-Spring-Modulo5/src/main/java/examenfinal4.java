

	import java.sql.*;

	public class examenfinal4 {

	    public static void main(String[] args) {

	        try {
	            // Paso 1: cargar el controlador JDBC
	            Class.forName("com.mysql.jdbc.Driver");

	            // Paso 2: establecer la conexión con la base de datos
	            String url = "jdbc:mysql://localhost:3306/";
	            String usuario = "root";
	            String contraseña = "fullstack";
	            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

	            // Paso 3: ejecutar una consulta SQL
	            Statement statement = conexion.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM miTabla");

	            // Paso 4: procesar los resultados
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String nombre = resultSet.getString("nombre");
	                int edad = resultSet.getInt("edad");
	                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
	            }

	            // Paso 5: cerrar la conexión y los objetos creados
	            resultSet.close();
	            statement.close();
	            conexion.close();

	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}



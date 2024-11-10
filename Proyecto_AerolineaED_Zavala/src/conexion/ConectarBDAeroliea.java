
package conexion;
import java.sql.Connection;//ESTALECE CONEXION A Base de datos
import java.sql.DriverManager;//Enlace de conexion ente BD y Java
import java.sql.Statement;//genera Sentencia SQL
import java.sql.ResultSet;//establece resultado final de datos
import java.sql.SQLException;//tratamiento de errores  de Base de datos



public class ConectarBDAeroliea {
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    //metodo para conectar a la base de datos
    public void conectarBDOracle()throws SQLException{
       // DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
       DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver() );
       cn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","ProyectoZavala","uacm123");
    } 
}

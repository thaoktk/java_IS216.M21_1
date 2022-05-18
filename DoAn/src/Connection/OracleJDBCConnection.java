/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 *
 * @author Tran Thu Thao
 */
public class OracleJDBCConnection {

    public static Connection getJDBCConnection() throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String sid = "orcl";
        String userName = "c##QLCH_HOA";
        String password = "Admin123";

        return getJDBCConnection(hostName, sid, userName, password);
    }

    public static Connection getJDBCConnection(String hostName, String sid,
            String userName, String password) throws ClassNotFoundException,
            SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;

    }
}

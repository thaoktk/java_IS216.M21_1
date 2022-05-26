/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.*;
/**
 *
 * @author asus
 */
public class ConnectionUtils {
    public static Connection getMyConnection() throws SQLException,
          ClassNotFoundException {
      // Sử dụng Oracle.
      // Bạn có thể thay thế bởi Database nào đó.
      return OracleJDBCConnection.getJDBCConnection();
  }
    
    public static void main(String[] args) throws SQLException,
          ClassNotFoundException {
 
      System.out.println("Get connection ... ");
 
      // Lấy ra đối tượng Connection kết nối vào database.
      Connection conn = ConnectionUtils.getMyConnection();
 
      System.out.println("Get connection " + conn);
 
      System.out.println("Done!");
  }
}

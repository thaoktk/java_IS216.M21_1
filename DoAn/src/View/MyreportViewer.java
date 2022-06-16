/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Connection.ConnectionUtils;
import java.awt.Container;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author Nguyen Minh Nhut
 */
public class MyreportViewer extends JFrame {

    public MyreportViewer(String fileName) throws SQLException {
        this(fileName, null);
    }

    public MyreportViewer(String fileName, HashMap parameter) throws SQLException {
        super("View report");
        try {
            JasperReport jsr = JasperCompileManager.compileReport(fileName);
            JasperPrint print = JasperFillManager.fillReport(jsr, parameter, ConnectionUtils.getMyConnection());
            JRViewer view = new JRViewer(print);
            Container c = getContentPane();
            c.add(view);
        } catch (ClassNotFoundException | SQLException | JRException e) {
        }
        setBounds(10, 10, 600, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws net.sf.jasperreports.engine.JRException
     */
    public static void main(String[] args) throws SQLException, JRException {
        // TODO code application logic here
    }

}

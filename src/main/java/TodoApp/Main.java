/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TodoApp;

import java.sql.Connection;
import util.ConnectionFactory;

/**
 *
 * @author welli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Connection c = ConnectionFactory.getConnection();
    
    
    
    ConnectionFactory.closeConnection(c);
    }
    
}

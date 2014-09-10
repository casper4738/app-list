package app.utility;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author casper
 */
public class DBUtility {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/app?","root","");
//                Class.forName("org.h2.Driver");
//                connection = DriverManager.getConnection("jdbc:h2:" + new File("~/app") + ";IFEXISTS=TRUE", "sa", "");
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error connect to database server, check configuration \n"
                        + "" + ex.getMessage());
            }
        }
        return connection;
    }

}

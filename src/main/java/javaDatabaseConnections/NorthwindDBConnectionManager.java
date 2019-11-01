package javaDatabaseConnections;

import java.sql.*;

public class NorthwindDBConnectionManager {

    private PropertiesManager props = new PropertiesManager();
    private final String CONNECTIONURL = "jdbc:sqlserver://localhost:1433;databaseName=northwind;user=" + props.getUserName() + ";password=" + props.getPassword();

    //can be extended into other classes for an easy conenct
    public Connection northwindConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTIONURL);
        //^^ giving the driver manager the url in order to cennect
    }
}


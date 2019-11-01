package javaDatabaseConnections;

import java.sql.*;

public class NWEmployeeDAO {
    private final String SQL = "SELECT TOP 10 * FROM Employees";
    private NorthwindDBConnectionManager nwconn = new NorthwindDBConnectionManager();

    public void iterateThroughEmployees(){
        try(Statement stmt = nwconn.northwindConnection().createStatement()) {//initialises statement in order to execute the queries below
            ResultSet resultSet = stmt.executeQuery(SQL);
            while (resultSet.next()){
                System.out.println(resultSet.getString("firstName") + " " + resultSet.getString("lastName") );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

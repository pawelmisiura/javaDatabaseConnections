package javaDatabaseConnections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    NWEmployeeDAO jdbExample = new NWEmployeeDAO();
    jdbExample.iterateThroughEmployees();
    }
}

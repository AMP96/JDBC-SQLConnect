import java.sql.Connection;
import java.sql.DriverManager;

public class Connect
{
    public static void main(String[] args)
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Amitpats#11");
            System.out.println("Connected Successfully: " + con);
        }
        catch(Exception e)
        {
            System.out.println("MySQL Database not connected!");
            e.printStackTrace();
        }
    }
}

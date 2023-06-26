    import java.sql.Connection;
    import java.sql.DriverManager;

    public class Connect
    {
        public static void main(String[] args)
        {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Amitpats#11");
            System.out.println("Successfully Connected: " + con);
        }
        catch(Exception e)
            {
                System.out.println("DB Not Connected!");
                e.printStackTrace();
            }
        }
    }

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class poling {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/poll", "root", "1234");
            Statement stat=conn.createStatement();    
            System.out.println("connected");

            Scanner s = new Scanner(System.in);


                System.out.println("Team india win ODI series in england?");
                System.out.println("1. yes");
                System.out.println("2. no");
                System.out.println("3. cant say");
                System.out.println("4. Display record");
                System.out.println("5. Exit");

                 int num=s.nextInt();
                int y1=0;
                int n1=0;
                int c1=0;

                switch(num) {
                case 1:
                    y1++;
                    String qry1="Update pollr set y1="+y1;
                    Statement stat1=conn.createStatement();
                    stat1.executeUpdate(qry1);
                    System.out.println("y1 is updated");
                    break;

                case 2:
                    n1++;
                    String qry2="Update pollr set n1="+n1;
                    Statement stat2=conn.createStatement();
                    stat2.executeUpdate(qry2);
                    System.out.println("n1 is updated");
                    break;

                case 3:
                    c1++;
                    String qry3="Update pollr set c1="+c1;
                    Statement stat3=conn.createStatement();
                    stat3.executeUpdate(qry3);
                    System.out.println("c1 is updated");
                    break;

                case 4:
                    String qry4="Select* from pollr";
                    Statement stat4=conn.createStatement();
                    stat4.executeQuery(qry4);
                    System.out.println("updated...");
                    break;

                case 5:
                    System.out.println("Exit");

                }

        }



        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
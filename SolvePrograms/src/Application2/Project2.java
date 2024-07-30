package Application2;
import java.util.Scanner;
class BookMyshow
{
    private String move_name;
    private String theatre_name;
    private int cost;
    void movies(){
        System.out.println("The Latest Movies Available Now Are : \n");
        System.out.println(" 1.Avengers:EndGame(4K Dolby) -------- Rs.145 ");
        System.out.println(" 2.SpiderMan:Into The SpiderVerse(2K 3D) -------- Rs.155 ");
        System.out.println(" 3.Jumanji: The Next Level(3D) -------- Rs.165 ");
        System.out.println(" 4.Star Wars: The Rise of Skywalker(4K) -------- Rs.175\n");
        System.out.println(" ***ALL PRICES ARE INCLUSIVE OF GST & CGST***\n");
    }
}
class thea extends BookMyshow
{
    private int no_f_tickets;
    void th()
    {
        System.out.println("*******The Available Theaters Are******* \n 1.Aries Plex SL Cinemas \n2.Carnival Cinemas");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1)
        {
      
            System.out.println("Movies Available Are \n 1.Avengers:EndGame(4K Dolby) \n2.SpiderMan:Into The SpiderVerse(2K 3D) ");
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1)
            {
                System.out.println("Avengers:EndGame(4K Dolby) @ Aries Plex SL Cinemas(4K Dolby)\n");
                System.out.println("Enter The Number Of Tickets To Be Booked\n");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=145*r;
                System.out.println("To Continue Press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n");
                if (h == 1)
                {
                    System.out.println("******************************************************");
                    System.out.println("Theater ------------------- Aries Plex SL Cinemas(4K Dolby)");
                    System.out.println("Movie --------------------- Avengers:EndGame(4K Dolby)");
                    System.out.println("GST+CGST(5%)--------------- Rs."+((int)(0.05*amount)));
                    System.out.println("Total Cost ---------------- Rs."+(amount+((int)(0.05*amount))));
                    System.out.println("******************************************************");
                }
                else
                System.out.println("Wrong Option");
            }
            else if (o == 2)
            {
                System.out.println("SpiderMan:Into The SpiderVerse(2K 3D) @Aries Plex SL Cinemas(4KDolby)\n");
                System.out.println("Enter The Number Of Tickets To Be Booked\n");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int left= no_f_tickets-r;
                int amount=155*r;
                System.out.println("To Continue Press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n");
                if (h == 1)
                {
                    System.out.println("Theater ------------------- Aries Plex SL Cinemas(4K Dolby)");
                    System.out.println("Movie --------------------- SpiderMan:Into The SpiderVerse(2K 3D)");
                    System.out.println("GST+CGST(5%)--------------- Rs."+((int)(0.05*amount)));
                    System.out.println("Total Cost ---------------- Rs."+(amount+((int)(0.05*amount))));
                    System.out.println("******************************************************");
                }
                else
                System.out.println("Wrong Option");
                System.out.println("go to main menu");
            
            }
            else
            System.out.println("Wrong Option");
        }
        else if (n == 2)
        {
            System.out.println("*******Carnival Cinemas Theater*******\n");
            System.out.println("*******Select a Movie*******\n");
            System.out.println("Movie Available Are \n 1.Jumanji: The Next Level(3D) \n 2.Star Wars: TheRise of Skywalker(4K)");
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1)
            {
                System.out.println("Jumanji: The Next Level(3D) @ Carnival Cinemas Theater\n");
                System.out.println("Enter The Number Of Tickets To Be Booked\n");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=165*r;
                System.out.println("To Continue Press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n");
                if (h == 1)
                {
                    System.out.println("******************************************************");
                    System.out.println("Theater ------------------- Carnival Cinemas theater");
                    System.out.println("Movie --------------------- Jumanji: The Next Level(3D)");
                    System.out.println("GST+CGST(5%)--------------- Rs."+((int)(0.05*amount)));
                    System.out.println("Total Cost ---------------- Rs."+(amount+((int)(0.05*amount))));
                    System.out.println("******************************************************");
                }
                else
                System.out.println("Wrong Option");
            }
            else if (o == 2)
            {
                System.out.println("Star Wars: The Rise of Skywalker(4K) @ Carnival Cinemas Theater\n");
                System.out.println("Enter The Number Of Tickets To Be Booked\n");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int amount=175*r;
                System.out.println("To Continue Press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n");
                if (h == 1)
                {
                    System.out.println("******************************************************");
                    System.out.println("Theater ------------------- Carnival Cinemas theater");
                    System.out.println("Movie --------------------- Star Wars: The Rise of Skywalker(4K)");
                    System.out.println("GST+CGST(5%)--------------- Rs."+((int)(0.05*amount)));
                    System.out.println("Total Cost ---------------- Rs."+(amount+((int)(0.05*amount))));
                    System.out.println("******************************************************");
                }
                else
                System.out.println("Wrong Option");
            }
            else
            System.out.println("Wrong Option");
        }
        else
        System.out.println("Wrong Option ");
    }
}
public class Project2
{
    public static void main(String[] args)
    {
        BookMyshow ob = new BookMyshow();
        BookMyshow[] moviename = new BookMyshow[2];
        moviename[0] = ob;
        thea a = new thea();
        moviename[1] = a;
        System.out.println(" ***Welcome To BookMyShow***");
        System.out.println(" 1.List And Prices Of Respective Movies And To Book Them \n press 1 to continue");
        Scanner d = new Scanner(System.in);
        int h = d.nextInt();
        if(h==1)
        {
            ob.movies();
            System.out.println("Do You Want To Book Tickets Now\n");
            System.out.println("Enter 1 To Continue & 0 To Exit");
            int ch=d.nextInt();
            if(ch==1)
            a.th();
            else if(ch==0)
            {
                System.out.println("\n------------------TNX FOR USING OUR SITE------------------");
            }
            else
            System.out.println("Wrong Option");
        }
        else
        System.out.println("Wrong Option");
    }
}
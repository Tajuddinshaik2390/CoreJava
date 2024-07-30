package Application;
import java.util.*;

class BookMyshow {

    private String movie_name;
    private String theater_name;
 
    private int cost;

    void movies() {
     
        System.out.println("the movies available are");
        System.out.println(" 1.shreak -------- Rs.40 \n 2.stuart little - Rs.50 \n 3.game movie ---- Rs.60 \n 4.fun movie ----- Rs.70 ");
     
     
    }

}

class thea extends BookMyshow {

    void th() {
        System.out.println("*******the theaters available are******* \n 1.karunya th \n 2.anna th");
        int k;
        int an;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("*******karunya theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 1.shreak \n 2.stuart little ");
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("shreak movie @ kaurnya theater");
                System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                
                int amount=40*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                  
                    System.out.println("theater ------------------- karunya theater");
                    System.out.println("movie --------------------- shreak");
                    System.out.println("cost ---------------------- Rs."+amount);
                   
                }

            }
            if (o == 2) {
                System.out.println("stuart little @karunya theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
               
                int amount=50*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                    
                    System.out.println("theater ------------------- karunya theater");
                    System.out.println("movie --------------------- staurt little");
                    System.out.println("cost ---------------------- Rs"+amount);
       
                }

            }

        }
        if (n == 2) {
            System.out.println("*******anna theater*******");
            System.out.println("*******select a movie*******");
            System.out.println("movie available are \n 1.game movie \n 2.fun movie");
           
            Scanner a = new Scanner(System.in);
            int o = a.nextInt();
            if (o == 1) {
                System.out.println("game movie @ anna theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
               
                int amount=60*r;
                System.out.println("to continue to book for this movie prees 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                
                    System.out.println("theater ------------------- anna theater");
                    System.out.println("movie --------------------- game movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                 
                }

            }
            if (o == 2) {
                System.out.println("fun little @anna theater");
                 System.out.println("enter the number of tickets to be booked");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
               
                int amount=70*r;
                System.out.println("to continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println("\n\n\n");
                if (h == 1) {
                   
                    System.out.println("theater ------------------- anna theater");
                    System.out.println("movie --------------------- fun movie");
                    System.out.println("cost ---------------------- Rs."+amount);
                   
                }

            }
        }

    }
}

public class project1{

    public static void main(String[] args) {
        BookMyshow ob = new BookMyshow();

        BookMyshow moviename = new BookMyshow();
  
        thea a = new thea();
        
        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");


        Scanner d = new Scanner(System.in);
        int h = d.nextInt();
        switch (h) {
            case 1: {
                moviename.movies();
                break;
            }
            case 2: {
             
                a.th();
            }
        }

    }

}

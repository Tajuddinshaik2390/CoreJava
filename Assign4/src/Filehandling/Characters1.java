package Filehandling;
import java.io.*;

public class Characters1 {
    public static void main(String args[])
    {
        try
        {
            int digits=0,chars=0,words=0, Schar=0;
            int code=0;
            FileInputStream f = new FileInputStream("D:\\Users\\tajuddins\\eclipse-workspace\\SolvePrograms\\src\\Armstrong.java");
            while(f.available()!=0)
            {
                code = f.read();
                if(code!=20)
                chars++;
                if(code==12)
                words++;
                if(Schar==10)
                    Schar++;
                if(code==10)
                {
                    digits++;
                }
            }
            System.out.println("No.of characters = "+chars);
            System.out.println("No.of words = "+(words+1));
            System.out.println("No.of digits = "+(digits+1));
            System.out.println("No.of Special character = "+(Schar+1));
            f.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find ");
        }
        catch(IOException i)
        {
            System.out.println("Cannot read file");
        }
    }
}

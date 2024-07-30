package Filehandling;

import java.nio.file.*;
public class Lines1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
           Path  file = Paths.get("D:\\Users\\tajuddins\\eclipse-workspace\\Practice\\src\\Practiceprograms\\pattern2.java");
           long count = Files.lines(file).count();
           System.out.println("Total number of line: "+count);
        }
        catch(Exception e) {
            e.getStackTrace();
        }

    }

}
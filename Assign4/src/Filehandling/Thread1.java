package Filehandling;
import java.io.*;
import java.lang.Thread;
public class Thread1 {
   void join () {
       System.out.print("My name is keerthana");

   }
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
       try {  
        int i;
         for(i=0; i<10; i++) {
             System.out.println(i);
             Thread.sleep(500);
         }
    }
       catch(Exception e) {
           System.out.print(e);
       }
    }

}
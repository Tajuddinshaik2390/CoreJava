package com.nseit.mavenproject.app.java;

public class Inverttraingle {
	public static void main(String args[])
    {
        int num = 5;
        while(num > 0)
        {
            for(int i=1; i<=num; i++)
            {
                System.out.print(" "+num+" ");
            }
            System.out.print("\n");
            num--;
        }
    }
}

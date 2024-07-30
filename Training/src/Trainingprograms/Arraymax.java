package Trainingprograms;

public class Arraymax {
	 
	    public static void main(String[] args) {  
	  
	         
	        int [] arr = new int [] {25, 11, 7, 75, 56,80,235,45,10};  
	    	
	        
	        int max = arr[0]; 
	        int pos=0;
	      
	        for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] > max)  
	               max = arr[i];  
	           pos= i;
	        }  
	        System.out.println("Largest element present in given array: " + max +" "+ pos);  
	    }  
	}  


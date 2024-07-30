package P1_JAVA8;

import java.util.function.*;

//public class Lamda {
//
//	public static void main(String[] args) {
////
////		BiConsumer<Integer, Integer> obj = (a, b) -> System.out.println(a + b);
////		obj.accept(12, 1);
//
//	}
//
//}

public class Lamda extends Thread {
    private String name;

    public Lamda(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            // Split the name into words
            String[] words = name.split(" ");
            for (String word : words) {
                System.out.println(word);
                // Add a delay of 1 second (1000 milliseconds) between each word
                Thread.sleep(1000);
            }
        }catch(Exception e) {
            	
            }
    }

    public static void main(String[] args) {
        Lamda printNameThread = new Lamda("H i  D r   A Y E S H A   J i"); // Replace "John Doe" with your actual name
        printNameThread.start();
    }
}
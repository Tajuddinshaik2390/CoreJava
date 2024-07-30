package FunctionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Implement the interface using a lambda expression
        MyFunctionalInterface myFuncInterface = (message) -> {
            System.out.println("Message: " + message);
        };

        // Use the functional interface
        myFuncInterface.printMessage("Hello, World!");
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void printMessage(String message);
}
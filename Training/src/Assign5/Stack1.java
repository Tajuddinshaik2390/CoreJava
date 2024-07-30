package Assign5;
import java.util.*;
public class Stack1 {
        public static void stack_push(Stack<Integer> stack) {
            for(int i=0; i<10; i++) {
                stack.push(i);
            }
        }
        public static void stack_pop(Stack<Integer> stack) {
            System.out.println("Tajuddin");
            for(int i=0; i<10; i++) {
                    Integer y = (Integer) stack.pop();
                    System.out.println(y);
            }

        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
              Stack<Integer> stack =  new Stack<Integer>();
              stack_push(stack);
              stack_pop(stack);
        }

    }
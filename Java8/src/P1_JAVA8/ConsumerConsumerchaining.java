package P1_JAVA8;

import java.util.function.Consumer;

public class ConsumerConsumerchaining {
	public static void main(String[] args) {
		Consumer<Integer> obj=(num)-> System.out.println(num*num);
		obj.accept(4);
	
	
	Consumer<Integer> objj=(num)-> System.out.println(num*num*num);
	objj.accept(4);
	obj.andThen(objj).accept(4);
}

}


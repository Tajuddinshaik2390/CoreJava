package P1_JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamConfiguration {
public static void main(String[] args) {
	List<Integer> arlist=new ArrayList<Integer>();
	arlist.add(23);
	arlist.add(22);
	arlist.add(25);
	 arlist.stream().map(x->x*x).forEach(y->System.out.println(y));
	 
}
}

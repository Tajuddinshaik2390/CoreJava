package Java8InterviewPreparation;

import java.util.Optional;

public class OptionalEg {
public static void main(String[] args) {
	Optional<String> op=Optional.ofNullable(getstring());
	op.ifPresentOrElse(value->System.out.println("its present "+value),()->System.out.println("its null retuned"));
	
}

	public static String getstring() {
		return null;
	}
}

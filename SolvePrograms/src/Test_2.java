import java.util.*;
import org.junit.*;
import org.junit.runners.*;
import org.junit.runner.*;
import  static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class Test_2 {
int n;
boolean b;
Prime2 p2;
@Before
public void initialize() {
	p2=new Prime2() {
	
	}

		
	
	public Test_2(int n,boolean b) {
		this.n=n;
		this.b=b;
		
	}
	@Parameterized.Parameters
	public static Collection prime() {
		return Arrays.asList(new object[][]
				{
			{23,true},
			{15,false},
			{29,true},
			{14,false},
			{10,false},
			{37,true},
				});
	}

	
}
}




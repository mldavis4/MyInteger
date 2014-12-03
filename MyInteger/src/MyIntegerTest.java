import static org.junit.Assert.*;

import org.junit.Test;


public class MyIntegerTest {

	@Test
	public void test() {
		MyInteger LottoNumber = new MyInteger(6);
		MyInteger SecondLottoNumber = new MyInteger(5);
		
		System.out.println(LottoNumber);
		
		SecondLottoNumber.isEven();
		assertEquals("secondlotto is even",SecondLottoNumber.isEven(), false);
	
		//fail("Not yet implemented");
	}

}

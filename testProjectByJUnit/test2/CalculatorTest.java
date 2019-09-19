package test2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;//멤버필드에서 초기화
	
	@Before
	public void setup() {//test메소드가 실행될 때마다 호출(각 test간의 독립성을 보장)
		cal = new Calculator();
		System.out.println("setup!");
	}
	
	@Test
	public void add() {
		int result = cal.add(2, 1);
		assertEquals(3, result);
		System.out.println("add!");
	}
	
	@Test
	public void subtract() {
		//Calculator cal = new Calculator();
		int result = cal.subtract(10, 7);
		assertEquals(3, result);
		System.out.println("subtract!");
	}

	@Test
	public void multiply() {
		//Calculator cal = new Calculator();
		int result = cal.multiply(1, 3);
		assertEquals(3, result);
		System.out.println("multiply!");
	}
	@Test
	public void divide() {
		//Calculator cal = new Calculator();
		assertEquals(3, cal.divide(9, 3));
		System.out.println("divide!");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown!");
	}
}

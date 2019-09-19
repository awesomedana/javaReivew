package test2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;//����ʵ忡�� �ʱ�ȭ
	
	@Before
	public void setup() {//test�޼ҵ尡 ����� ������ ȣ��(�� test���� �������� ����)
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

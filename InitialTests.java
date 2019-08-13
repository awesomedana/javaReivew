import java.security.InvalidParameterException;

import junit.framework.TestCase;

public class InitialTests extends TestCase {
	Box m_box;
	
	protected void setUp() throws Exception {
		super.setUp();
		m_box = new Box(10, 15);
	}

	public void testPrintArea() {
		int area = m_box.getArea();
		assertEquals(150, area);
	}
	
	public void testSetSize() {
		m_box.setSize(2, 3);
		int area = m_box.getArea();
		assertEquals(6, area);
	}

	public void testSetSizeFail() {
		try {
			m_box.setSize(-2, 3);
			fail();
		} catch (InvalidParameterException e){
			
		}
	}
}

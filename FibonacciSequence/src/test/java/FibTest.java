import static org.junit.Assert.*;

import org.junit.*;

public class FibTest {

	Fibonacci obj;

	/** Initialise test suite */
	@Before
	public void setUp() {
		obj = new Fibonacci();
	}

	/** Clean up test suite - no-op. */
	@After
	public void tearDown() {
	}
	
	/** Test init() */
	@Test
	public void testInit() {
		obj.init();
		assertEquals(0, obj.previous);
		assertEquals(1, obj.current);
	}
	
	/** Test init(f0, f1) */
	@Test
	public void testInitWithParameters() {
		obj.init(8, 13);
		assertEquals(8, obj.previous);
		assertEquals(13, obj.current);
	}
	
	/** Test getNext() */
	@Test
	public void testGetNext() {
		obj.init();
		assertEquals(1, obj.getNext());
		assertEquals(2, obj.getNext());
		assertEquals(3, obj.getNext());
		assertEquals(5, obj.getNext());
		assertEquals(8, obj.getNext());
	}
	
	/** Test getCurrent() */
	@Test
	public void testGetCurrent() {
		obj.init();
		assertEquals(obj.current, obj.getCurrent());
	}
	
	/** Test reset() */
	@Test
	public void testReset() {
		obj.init();
		for (int i = 0; i < 10; i++) {
			obj.getNext();
		}
		obj.reset();
		assertEquals(obj.previous, 0);
		assertEquals(obj.current, 0);
		
	}
	
	/**
	 * Test getNumber(1).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNumber1() throws IllegalArgumentException {
		assertEquals(1, obj.getNumber(1));
	}

	/**
	 * Test getNumber(2).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNumber2() throws IllegalArgumentException {
		assertEquals(1, obj.getNumber(2));
	}

	/**
	 * Test getNumber(3).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNumber3() throws IllegalArgumentException {
		assertEquals(2, obj.getNumber(3));
	}

	/**
	 * Test getNumber(45).
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetNumber45() throws IllegalArgumentException {
		assertEquals(1134903170, obj.getNumber(45));
	}

	/** Test getNumber(-1). */
	@Test
	public void testFibMinusOne() {
		boolean caught = false;
		try {
			obj.getNumber(-1);
		} catch (IllegalArgumentException e) {
			caught = true;
		}
		assertTrue(caught);
	}
}
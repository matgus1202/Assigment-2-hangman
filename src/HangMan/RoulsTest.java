package HangMan;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class RoulsTest {

	private Rouls classUnderTest;
	@Before
	public void setUp(){
		classUnderTest = new Rouls();
	}
	@Test
	public void testEmptyLuseLife() {
		ArrayList <Integer> ar = new ArrayList<Integer>();
		classUnderTest.lostLife(ar);

		assertTrue(classUnderTest.lostLife(ar));

	}
	@Test
	public void testNotEmptyNotLosesLifes() {
		ArrayList <Integer> ar = new ArrayList<Integer>();
		int i =1;
		ar.add(i);
		classUnderTest.lostLife(ar);

		assertFalse(classUnderTest.lostLife(ar));

	}
	

}

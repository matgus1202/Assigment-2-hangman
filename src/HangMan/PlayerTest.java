package HangMan;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	private Player classUnderTest;
	@Before
	public void setUp(){
		classUnderTest = new Player();
	}
	@Test
	public void testLetterWasInWord() {
		classUnderTest.getSizeOfWord(10);
		ArrayList <Integer> ar = new ArrayList<Integer>();
		ar.add(0);
		ar.add(1);
		classUnderTest.UppdateWord('c', ar);
		String s ="cc********";
		assertEquals(classUnderTest.getWord(), s);
	}
	@Test
	public void testLetterWasentInWord() {
		classUnderTest.getSizeOfWord(10);
		ArrayList <Integer> ar = new ArrayList<Integer>();
		classUnderTest.UppdateWord('c', ar);
		String s ="**********";
		assertEquals(classUnderTest.getWord(), s);
	}
	
	public void ShouldReturn() {
		classUnderTest.getSizeOfWord(10);
		ArrayList <Integer> ar = new ArrayList<Integer>();
		classUnderTest.UppdateWord('c', ar);
		String s ="**********";
		assertEquals(classUnderTest.getWord(), s);
	}

}

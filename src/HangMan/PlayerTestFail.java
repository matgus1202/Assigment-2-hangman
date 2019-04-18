package HangMan;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class PlayerTestFail {
	private Player classUnderTest;
	@Before
	public void setUp(){
		classUnderTest = new Player();
		classUnderTest.playerWonIncreaseThePoints();
	}
	@Test
	public void testLetterWasInWord() {
		assertEquals(classUnderTest.howManeyPointsGotThePlayer(),1);
		
	}

}

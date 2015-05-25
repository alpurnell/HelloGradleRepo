import static org.junit.Assert.*;

import org.junit.Test;


public class MyJUnitTest {

	@Test
	public void shouldSayHello() {
		Hello myHello = new Hello();
		assertEquals("Hello JUnit!", myHello.myGreeting);
	}

}

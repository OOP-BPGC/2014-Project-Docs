package Tests;

import Project.*;
import junit.framework.TestCase;

public class TestLogin extends TestCase {
	
	public TestLogin(String str)
	{
		super(str);
	}

	public void testLoginConnect()
	{
		/*
		Not used real password due to privacy reasons.
		Replace "f2013694" and "qwerty" with appropriate
		userid and password to see it glow!
		*/
		assertEquals(false, Login.connect("f2013694", "qwerty"));
	}

}
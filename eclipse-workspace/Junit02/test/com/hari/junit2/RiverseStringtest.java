package com.hari.junit2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RiverseStringtest {

	@Test
	public void test() {
		RiverseString rs = new RiverseString();
		
		assertEquals("iraH", rs.reverseString("Hari"));
		
	}

}

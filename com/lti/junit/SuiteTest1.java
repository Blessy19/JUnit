package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {
public String message="Blessy";
JUnitMessage junitMessage = new JUnitMessage(message);

	@Test
	public void testJUnitMessage() {
	System.out.println("JUnit message is printing");
	junitMessage.printMessage();
	}
	@Test
	public void testJUnitHiMessage()
	{
	message="Hi" + message;
	System.out.println("JUnit Hi message is printing");
	assertEquals(message, junitMessage.printHiMessage());
	System.out.println("Suite test 1 is successful "+ message);
}
}

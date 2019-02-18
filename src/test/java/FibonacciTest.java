package org.jacoco.examples.maven.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	private Fibonacci subject;

	@Before
	public void setup() {
		subject = new Fibonacci();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("4613732", subject.sumOfEvens());
	}
	
}

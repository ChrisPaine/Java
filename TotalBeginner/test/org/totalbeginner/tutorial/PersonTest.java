package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximunBooks());
	}

	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Fred");
		assertEquals("Fred", p2.getName());
	}

	public void testSetMaximunBooks() {
		Person p3 = new Person();
		p3.setMaximunBooks(10);
		assertEquals(10, p3.getMaximunBooks());
	}
	
	public void testToString() {
		Person p4 = new Person();
		p4.setName("Fred Flinstone");
		p4.setMaximunBooks(7);
		String testString = "Fred Flinstone (7 books)";
		assertEquals(testString, p4.toString());
	}

}

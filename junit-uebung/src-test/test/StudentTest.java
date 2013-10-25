package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import daten.Student;

public class StudentTest {

	@Test
	public void testToString() {
		Student frank = new Student("Frank","Buschman",false);
		String output = frank.toString();
		assertEquals("Student {firstName=Frank, lastName=Buschman}",
				output);
	}

	@Test
	public void testStudentConstructor1Valid() {
		Student peter = new Student("Peter","Engel");
		assertSame("Peter",peter.getFirstName());
		assertSame("Engel",peter.getLastName());
		
		assertEquals("Peter",peter.getFirstName());
		assertEquals("Engel", peter.getLastName());
		
	}

	@Test
	public void testStudentConstructor2Valid() {
		Student hans = new Student("Hans","Huber",true);
		assertSame("Hans",hans.getFirstName());
		assertSame("Huber",hans.getLastName());
		
		assertEquals("Hans",hans.getFirstName());
		assertEquals("Huber", hans.getLastName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testStudentConstructor1InValid() {
		Student peter = new Student("Peter"," ");		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testStudentConstructor2InValid() {
		Student hans = new Student("","Huber",true);
	}
	
	@Test
	public void testSetSelfEntitled() {
		Student max = new Student("Max","Mustermann",true);
		assertEquals(true,max.getSelfEntitled());
	}

	@Test
	public void testCompareTo1() {
		Student hans = new Student("hans","huber");
		hans.setBirthDate(new Date(2000,1,1));
		int x=0;
		int result=hans.compareTo(hans);
		assertTrue(x==result);
	}
	@Test
	public void testCompareToSecond() {
		Student hans = new Student("hans","huber");
		hans.setBirthDate(new Date(2001,2,4));
		Student mike = new Student("Mike","Mayer");
		mike.setBirthDate(new Date(2012,3,4));
		int result =hans.compareTo(mike);
		System.out.println(result);
		assertTrue(result>0);
	}
	@Test
	public void testCompareToThird() {
		Student hans = new Student("hans","huber");
		hans.setBirthDate(new Date(2001,2,4));
		Student mike = new Student("Mike","Mayer");
		mike.setBirthDate(new Date(2012,3,4));
		int result=mike.compareTo(hans);
		System.out.println(result);
		assertTrue(result<0);
	}

}

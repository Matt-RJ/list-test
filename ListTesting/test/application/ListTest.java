package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListTest {
	
	private ArrayList<String> testArrayList;
	private LinkedList<String> testLinkedList;
	
	@Before
	public void setup() {
		testArrayList = new ArrayList<>(Arrays.asList("Element 1", "Element 2", "Element 3",
				"Element 4", "Element 5", "Element 6"));
		testLinkedList = new LinkedList<>(Arrays.asList("Element 1", "Element 2", "Element 3",
				"Element 4", "Element 5", "Element 6"));
	}
	
	// Add version 1 
	
	@Test
	public void addVersion1AddsToEndOfArrayList() {
		String newElement = "Element 7";
		testArrayList.add(newElement);
		assertEquals(newElement, testArrayList.get(6));
	}
	@Test
	public void addVersion1AddsToEndOfLinkedList() {
		String newElement = "Element 7";
		testLinkedList.add(newElement);
		assertEquals(newElement, testLinkedList.get(6));
	}
	
	// Add version 2
	
	@Test
	public void addVersion2AddsToStartOfArrayList() {
		String newElement = "Added Element";
		testArrayList.add(0, newElement);
		assertEquals(newElement, testArrayList.get(0));
	}
	@Test
	public void addVersion2AddsToMiddleOfArrayList() {
		String newElement = "Added Element";
		testArrayList.add(4, newElement);
		assertEquals(newElement, testArrayList.get(4));
	}
	@Test
	public void addVersion2AddsToStartOfLinkedList() {
		String newElement = "Added Element";
		testLinkedList.add(0, newElement);
		assertEquals(newElement, testLinkedList.get(0));
	}
	@Test
	public void addVersion2AddsToMiddleOfLinkedList() {
		String newElement = "Added Element";
		testLinkedList.add(4, newElement);
		assertEquals(newElement, testLinkedList.get(4));
	}
	
	// Set
	
	@Test
	public void setReplacesElementInArrayListAtStart() {
		String newElement = "Replacement Element";
		testArrayList.set(0, newElement); 

		boolean elementsAtIndex0AreTheSame = newElement.equals(testArrayList.get(0));
		boolean elementsAtIndex1AreTheSame = "Element 2".equals(testArrayList.get(1));
		
		assertTrue(elementsAtIndex0AreTheSame && elementsAtIndex1AreTheSame);
	}
	@Test
	public void setReplacesElementInArrayListAtEnd() {
		String newElement = "Replacement Element";
		testArrayList.set(5, newElement);
		
		boolean elementsAtIndex5AreTheSame = newElement.equals(testArrayList.get(5));
		boolean elementsAtIndex4AreTheSame = "Element 5".equals(testArrayList.get(4));
		
		assertTrue(elementsAtIndex5AreTheSame && elementsAtIndex4AreTheSame);
	}
	@Test
	public void setReplacesElementInLinkedListAtStart() {
		String newElement = "Replacement Element";
		testLinkedList.set(0, newElement); 

		boolean elementsAtIndex0AreTheSame = newElement.equals(testLinkedList.get(0));
		boolean elementsAtIndex1AreTheSame = "Element 2".equals(testLinkedList.get(1));
		
		assertTrue(elementsAtIndex0AreTheSame && elementsAtIndex1AreTheSame);
	}
	@Test
	public void setReplacesElementInLinkedListAtEnd() {
		String newElement = "Replacement Element";
		testLinkedList.set(5, newElement);
		
		boolean elementsAtIndex5AreTheSame = newElement.equals(testLinkedList.get(5));
		boolean elementsAtIndex4AreTheSame = "Element 5".equals(testLinkedList.get(4));
		
		assertTrue(elementsAtIndex5AreTheSame && elementsAtIndex4AreTheSame);
	}
	
	// Get
	
	@Test
	public void getReturnsFirstElementInArrayList() {
		assertTrue(testArrayList.get(0).equals("Element 1"));
	}
	@Test
	public void getReturnsMiddleElementInArrayList() {
		assertTrue(testArrayList.get(3).equals("Element 4"));
	}
	@Test
	public void getReturnsLastElementInArrayList() {
		assertTrue(testArrayList.get(5).equals("Element 6"));
	}
	@Test
	public void getReturnsFirstElementInLinkedList() {
		assertTrue(testLinkedList.get(0).equals("Element 1"));
	}
	@Test
	public void getReturnsMiddleElementInLinkedList() {
		assertTrue(testLinkedList.get(3).equals("Element 4"));
	}
	@Test
	public void getReturnsLastElementInLinkedList() {
		assertTrue(testLinkedList.get(5).equals("Element 6"));
	}
	
	// IndexOf
	
	@Test
	public void indexOfReturnsFirstIndexInArrayList() {
		assertEquals(0,testArrayList.indexOf("Element 1"));
	}
	@Test
	public void indexOfReturnsMiddleIndexInArrayList() {
		assertEquals(3,testArrayList.indexOf("Element 4"));
	}
	@Test
	public void indexOfReturnsLastIndexInArrayList() {
		assertEquals(5,testArrayList.indexOf("Element 6"));
	}
	@Test
	public void indexOfReturnsFirstIndexInLinkedList() {
		assertEquals(0,testLinkedList.indexOf("Element 1"));
	}
	@Test
	public void indexOfReturnsMiddleIndexInLinkedList() {
		assertEquals(3,testLinkedList.indexOf("Element 4"));
	}
	@Test
	public void indexOfReturnsLastIndexInLinkedList() {
		assertEquals(5,testLinkedList.indexOf("Element 6"));

	}
	
	// Remove Version 1
	
	@Test
	public void removeVersion1RemovesFirstElementInArrayList() {
		testArrayList.remove(0);
		assertFalse(testArrayList.contains("Element 1"));
	}
	@Test
	public void removeVersion1RemovesMiddleElementInArrayList() {
		testArrayList.remove(3);
		assertFalse(testArrayList.contains("Element 4"));
	}
	@Test
	public void removeVersion1RemovesLastElementInArrayList() {
		testArrayList.remove(5);
		assertFalse(testArrayList.contains("Element 6"));
	}
	@Test
	public void removeVersion1RemovesFirstElementInLinkedList() {
		testLinkedList.remove(0);
		assertFalse(testLinkedList.contains("Element 1"));
	}
	@Test
	public void removeVersion1RemovesMiddleElementInLinkedList() {
		testLinkedList.remove(3);
		assertFalse(testLinkedList.contains("Element 4"));
	}
	@Test
	public void removeVersion1RemovesLastElementInLinkedList() {
		testLinkedList.remove(5);
		assertFalse(testLinkedList.contains("Element 6"));
	}
	
	// Remove Version 2
	
	@Test
	public void removeVersion2RemovesFirstElementInArrayList() {
		testArrayList.remove("Element 1");
		assertFalse(testArrayList.contains("Element 1"));
	}
	@Test
	public void removeVersion2RemovesMiddleElementInArrayList() {
		testArrayList.remove("Element 3");
		assertFalse(testArrayList.contains("Element 3"));
	}
	@Test
	public void removeVersion2RemovesLastElementInArrayList() {
		testArrayList.remove("Element 6");
		assertFalse(testArrayList.contains("Element 6"));
	}
	@Test
	public void removeVersion2RemovesFirstElementInLinkedList() {
		testLinkedList.remove("Element 1");
		assertFalse(testLinkedList.contains("Element 1"));
	}
	@Test
	public void removeVersion2RemovesMiddleElementInLinkedList() {
		testLinkedList.remove("Element 3");
		assertFalse(testLinkedList.contains("Element 3"));
	}
	@Test
	public void removeVersion2RemovesLastElementInLinkedList() {
		testLinkedList.remove("Element 6");
		assertFalse(testLinkedList.contains("Element 6"));
	}
	
	// Contains
	
	@Test
	public void containsFindsElementInArrayList() {
		// TODO
	}
	
}


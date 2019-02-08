package application;

import static org.junit.Assert.assertEquals;
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
		testArrayList = new ArrayList<>(Arrays.asList("Element 1", "Element 2", "Element 3,",
				"Element 4", "Element 5", "Element 6"));
		testLinkedList = new LinkedList<>(Arrays.asList("Element 1", "Element 2", "Element 3,",
				"Element 4", "Element 5", "Element 6"));
	}
	
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
	
	@Test
	public void setReplacesElementInArrayList() {
		
		// TODO: Fix this method
		String newElement = "Replacement Element";
		testArrayList.set(0, newElement); 
		String[] firstTwoElements = {"Replacement Element", "Element 2"};
		String[] firstTwoArrayListElements = {testArrayList.get(0), testArrayList.get(1)};
		
		boolean elementsAreTheSame = firstTwoElements.equals(firstTwoArrayListElements);
		
		assertTrue(elementsAreTheSame);
	}
	
	@Test
	public void setReplacesElementInLinkedList() {
		
	}
}

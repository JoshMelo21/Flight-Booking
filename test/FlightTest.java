/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jtmelo
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class FlightTest {
	Flight f = new Flight(1, 1, 900, "7am", "Toronto", "Ottawa");
	@Test
	public void testConstructor() {
		Flight f = new Flight(1, 1, 900, "7am", "Toronto", "Ottawa");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidConstructor() {
		Flight f = new Flight(1, 1, 900, "7am", "Toronto", "Toronto");
	}

	@Test
	public void testGetFlightNumber() {
		assertEquals(1, f.getFlightNumber());
	}
	
	@Test
	public void testGetCapacity() {
		assertEquals(1, f.getCapacity());
	}
	
	@Test
	public void testGetNumberOfSeatsLeft() {
		assertEquals(1, f.getNumberOfSeatsLeft());
	}
	
	@Test
	public void testGetOriginalPrice() {
		assertEquals(900, f.getOriginalPrice(), 0.001);
	}
	
	@Test
	public void testGetDepartureTime() {
		assertEquals("7am", f.getDepartureTime());
	}
	
	@Test
	public void testGetOrigin() {
		assertEquals("Toronto", f.getOrigin());
	}
	
	@Test
	public void testGetDestination() {
		assertEquals("Ottawa", f.getDestination());
	}
	
	
	@Test
	public void testSetFlightNumber() {
		f.setFlightNumber(100);
		assertEquals(100, f.flightNumber);
	}
	
	@Test
	public void testSetCapacity() {
		f.setCapacity(10);
		assertEquals(10, f.capacity);
	}
	
	@Test
	public void testSetNumberOfSeatsLeft() {
		f.setNumberOfSeatsLeft(4);
		assertEquals(4, f.numberOfSeatsLeft);
	}
	
	@Test
	public void testSetOriginalPrice() {
		f.setOriginalPrice(49);
		assertEquals(49.0, f.originalPrice, 0.001);
	}
	
	@Test
	public void testSetDepartureTime() {
		f.setDepartureTime("6pm");
		assertEquals("6pm", f.departureTime);
	}
	
	@Test
	public void testSetOrigin() {
		f.setOrigin("Vancouver");
		assertEquals("Vancouver", f.origin);
	}
	
	@Test
	public void testSetDestination() {
		f.setDestination("Vancouver");
		assertEquals("Vancouver", f.destination);
	}
	
	@Test
	public void testBookASeat() {
		assertEquals(true, f.bookASeat());
	}
	
	@Test
	public void testToString() {
String s = "Flight 1, Toronto to Ottawa, 7am, Original Price: 900.0$";
assertEquals(s, f.toString());
        }
}
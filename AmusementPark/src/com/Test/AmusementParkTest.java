package com.Test;

import static org.junit.Assert.*;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.model.AmusementPark;
import com.model.Ticket;
import java.util.Date;


public class AmusementParkTest 
{
	 private AmusementPark amusementPark;

	    @Before
	    public void setUp() {
	        amusementPark = new AmusementPark("Test Park");
	    }

	    @Test
	    public void testAmusementParkName() {
	        assertEquals("Test Park", amusementPark.getName());
	    }

	    @Test
	    public void testAddTicket() {
	        Ticket ticket = new Ticket(101, "adult", new Date(), 500);
	        amusementPark.addTicket(ticket);
	        Vector<Ticket> tickets = amusementPark.getTicket();
	        assertNotNull(ticket);
	        assertEquals(1, tickets.size());
	        assertEquals(ticket, tickets.get(0));
	    }

	    @Test
	    public void testBookTicket() {
	        Ticket ticket = new Ticket(102, "child", new Date(), 120);
	        amusementPark.addTicket(ticket);
	        amusementPark.bookTicket(102, "Raunak Singh");
	        Vector<Ticket> bookedTicket = amusementPark.bookedTicket();
	        Vector<Ticket> availableTicket = amusementPark.bookedTicket();
	        assertEquals(1, bookedTicket.size());
	        assertEquals(0, availableTicket.size());
	        assertEquals("Unavilable", bookedTicket.get(0).getAvalabilty());
	        assertEquals("Raunak", bookedTicket.get(0).getHolder());
	    }

	
}
	




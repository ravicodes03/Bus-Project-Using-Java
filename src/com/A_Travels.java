package com;

public class A_Travels {

	private int bus1seats = 80;
	private int bus2seats = 70;
	private int bus3seats = 70;
	public void getBus1Ticket() {
		this.bus1seats=bus1seats-1;
		System.out.println("Tickedbooked in Bus B1");
		if(bus1seats<0) {
			throw new InvaildSeatsException();
		}
	}
	public void getBus2Ticket() {
		this.bus2seats=bus2seats-1;
		System.out.println("Ticket Booked In Bus B2");
		if(bus2seats<0) {
			throw new InvalidSeatsExceptiuon();
		}
	}
	public void getBus3Ticket() {
		this.bus3seats = bus3seats-1;
		System.out.println("Ticket Booked in Bus B3");
		if(bus3seats<0) {
			throw new InvalidSeatsException();
		}
		
	}
	
	public void b1display() {
		System.out.println("Available tickets of bus1 :"+bus1seats);
	}
	public void b2display() {
		System.out.println("Available tickets of bus1 :"+bus2seats);
	}
	public void b3display() {
		System.out.println("Available tickets of bus1 :"+bus3seats);
	}
	public void bus1Sts() {
		System.out.println("Remaining Tickets :"+bus1seats);
	}
	public void bus2Sts() {
		System.out.println("Remaining Tickets :"+bus2seats);
	}
	public void bus3Sts() {
		System.out.println("Remaining Tickets :"+bus3seats);
	}
	
}



































































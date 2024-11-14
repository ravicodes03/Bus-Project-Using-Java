package com;

import java.util.Scanner;

public class Red_Bus {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean start = true;
	while(start) {
		System.out.println("Choose the Travels \n 1.A_Travels \n 2.B_Travels \n 3.C_Travels \n 4.D_Trtavels \n 5.Exit");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
		{
			A_Travels a = new A_Travels();
			boolean bus = true;
			while(bus) {
				System.out.println("Choose the bus. \n 1.B1 \n 2.B2 \n 3.B3 \n 4.Exit");
				int ch2 = sc.nextInt();
				switch(ch2) {
				case 1:{
					a.b1display();
					System.out.println();
					a.getBus1Ticket();
					System.out.println();
					a.bus1Sts();
				}
				  break;
				case 2:
				{
					a.b2display();
					System.out.println();
					a.getBus2Ticket();
					System.out.println();
					a.bus2Sts();
				}
				  break;
				case 3:
				{
					a.b3display();
					System.out.println();
					a.getBus3Ticket();
					System.out.println();
					a.bus3Sts();
					System.out.println();
				}
				  break;
				  
				case 4:
				{
					bus = false;
					System.out.println("Thanking you for Choosing A_Travles");
				}
				  break;
				  
				  default:System.out.println("Enter Valid Option");
				   break;
				}
			}
		}
		 break;
		case 2:
		{
			B_Travels b = new B_Travels();
			boolean bus = true;
			while(bus) {
				System.out.println("Choose the bus. \n 1.B1 \n 2.B2 \n 3.B3 \n 4.Exit");
				int ch2 = sc.nextInt();
				switch(ch2) {
				case 1:{
					b.b1display();
					System.out.println();
					b.getBus1Ticket();
					System.out.println();
					b.bus1Sts();
				}
				  break;
				case 2:
				{
					b.b2display();
					System.out.println();
					b.getBus2Ticket();
					System.out.println();
					b.bus2Sts();
				}
				  break;
				case 3:
				{
					b.b3display();
					System.out.println();
					b.getBus3Ticket();
					System.out.println();
					b.bus3Sts();
					System.out.println();
				}
				  break;
				  
				case 4:
				{
					bus = false;
					System.out.println("Thanking you for Choosing A_Travles");
				}
				  break;
				  
				  default:System.out.println("Enter Valid Option");
				   break;
				}
			}
		}
		   break;
		case 3:
		{
			C_Travels c = new C_Travels();
			boolean bus = true;
			while(bus) {
				System.out.println("Choose the bus. \n 1.B1 \n 2.B2 \n 3.B3 \n 4.Exit");
				int ch2 = sc.nextInt();
				switch(ch2) {
				case 1:{
					c.b1display();
					System.out.println();
					c.getBus1Ticket();
					System.out.println();
					c.bus1Sts();
				}
				  break;
				case 2:
				{
					c.b2display();
					System.out.println();
					c.getBus2Ticket();
					System.out.println();
					c.bus2Sts();
				}
				  break;
				case 3:
				{
					c.b3display();
					System.out.println();
					c.getBus3Ticket();
					System.out.println();
					c.bus3Sts();
					System.out.println();
				}
				  break;
				  
				case 4:
				{
					bus = false;
					System.out.println("Thanking you for Choosing A_Travles");
				}
				  break;
				  
				  default:System.out.println("Enter Valid Option");
				   break;
				}
			}
		}
		  break;
		case 4:
		{
			D_Travels d = new D_Travels();
			boolean bus = true;
			while(bus) {
				System.out.println("Choose the bus. \n 1.B1 \n 2.B2 \n 3.B3 \n 4.Exit");
				int ch2 = sc.nextInt();
				switch(ch2) {
				case 1:{
					d.b1display();
					System.out.println();
					d.getBus1Ticket();
					System.out.println();
					d.bus1Sts();
				}
				  break;
				case 2:
				{
					d.b2display();
					System.out.println();
					d.getBus2Ticket();
					System.out.println();
					d.bus2Sts();
				}
				  break;
				case 3:
				{
					d.b3display();
					System.out.println();
					d.getBus3Ticket();
					System.out.println();
					d.bus3Sts();
					System.out.println();
				}
				  break;
				  
				case 4:
				{
					bus = false;
					System.out.println("Thanking you for Choosing A_Travles");
				}
				  break;
				  
				  default:System.out.println("Enter Valid Option");
				   break;
				}
			}
		}
		   break;
		default:System.out.println("Enter a Valid Choice");
		  break;
		}
	}
}
}






//abcudefghijklmnopquwstuvxyz abcdefghijklmnopqrstuvxyz  





























































































































package com.day0.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {
	String firstName, lastName, address, city, state;
	long zip, phoneNumber;

	public Contacts( String firstName, String lastName, String address, String city, String state, long zip,
			long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
//main class
public class AddressBook {
     //main method
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		Scanner input=new Scanner(System.in);
		String firstName, lastName, address, city, state;
		long zip, phoneNumber;
		firstName=input.next();
		lastName=input.next();
		address=input.next();
		city=input.next();
		state=input.next();
		zip=input.nextLong();
		phoneNumber=input.nextLong();
		ArrayList<Contacts> arraylist =new ArrayList<>();
		arraylist.add(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));
		System.out.println(arraylist);
	}

}

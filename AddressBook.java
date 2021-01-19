package com.day0.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Contacts {
	String firstName, lastName, address, city, state;
	long zip, phoneNumber;

	public Contacts(String firstName, String lastName, String address, String city, String state, long zip,
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
	// main method
	static ArrayList<Contacts> arraylist = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	static HashMap<String, Contacts> hashmap = new HashMap<String, Contacts>();

	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook");
		while(true) {
		System.out.println("choose the operation which u want to perform");
		System.out.println("1.ADD");
		System.out.println("2.EDIT");
		int num = input.nextInt();
		switch (num) {
		case 1:
			add();
			break;
		case 2:
			edit();
			break;
		default:
			System.out.println("Invalid");
		}
		System.out.println(" press(1?0)");
		System.out.println("1 for stop");
		int number=input.nextInt();
		if(number ==1)
			break;
	}
		System.out.println(hashmap);
	}

	public static void add() {
		System.out.println("enter firstname");
		String firstName = input.next();
		System.out.println("enter lastname");
		String lastName = input.next();
		System.out.println("enter address");
		String address = input.next();
		System.out.println("enter city");
		String city = input.next();
		System.out.println("enter state");
		String state = input.next();
		System.out.println("enter zip");
		long zip = input.nextLong();
		System.out.println("enter phone number");
		long phoneNumber = input.nextLong();

		hashmap.put(firstName, new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));
	}

	static void edit() {
		System.out.println("ENTER THE FIRSTNAME WHICH YOU WANT TO EDIT");
		System.out.println("enter firstname");
		String firstName = input.next();
		System.out.println("enter lastname");
		String lastName = input.next();
		System.out.println("enter address");
		String address = input.next();
		System.out.println("enter city");
		String city = input.next();
		System.out.println("enter state");
		String state = input.next();
		System.out.println("enter zip");
		long zip = input.nextLong();
		System.out.println("enter phone number");
		long phoneNumber = input.nextLong();
		hashmap.replace(firstName, new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));

	}

}

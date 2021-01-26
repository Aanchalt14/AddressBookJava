package com.uccases;

import java.util.ArrayList;
import java.util.Scanner;


class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zip;
    long phoneNumber;

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

    public long getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook");
        ArrayList<Contacts> book = new ArrayList<>();

        book.add(new Contacts("Aanchal", "Thakur", " address", "GS",
                "tamilnadu", 607003, 9424864293));
        book.add(new Contacts("payal", "Singh", " address", "mumbai",
                "maharastra", 607007, 933445565l));
        book.add(new Contacts("Rajendra", "Ji", " address", "bangalore",
                "karnataka", 607403, 9488806205l));
        book.add(new Contacts("yash", "raj", " address", "chennai",
                "maharastra", 607083, 923446205l));
        book.add(new Contacts("bhums", "suyavanshi", " address", "kolkata",
                "west bengal", 607903, 9445620555));

        Scanner input = new Scanner(System.in);
        String check = "y";

        while (!check.equalsIgnoreCase("n")) {
            System.out.println("Enter the Operation you want to perform");
            System.out.println("1.Add \n 2.Edit \n 3.Delete \n 4.Search \n 5.view \n 6.count \n 7.SortbyName " +
                    "8.SortbyCity \n 9.SortbyState \n 10.SortbyState");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    AddressBookOperations.add(book);
                    break;
                case 2:
                    AddressBookOperations.edit(book);
                    break;
                case 3:
                    AddressBookOperations.delete(book);
                    break;
                case 4:
                    AddressBookOperations.search(input, book);
                    break;
                case 5:
                    AddressBookOperations.viewByCityorState(input, book);
                    break;
                case 6:
                    AddressBookOperations.countByCityorState(input, book);
                    break;
                case 7:
                    AddressBookOperations.sortByFirstName(book);
                    break;
                case 8:
                    AddressBookOperations.sortByCity(book);
                    break;
                case 9:
                    AddressBookOperations.sortByState(book);
                    break;
                case 10:
                    AddressBookOperations.sortByzip(book);
                    break;
            }
            System.out.println("Do you want to perform any other option ?press(y/n)");
            check = input.next();
        }
        book.stream().forEach(n -> System.out.println(n));
    }


}

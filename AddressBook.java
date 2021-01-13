package Address.com;
public class Addressbook {
	
    public static void main (String args[] ) {
    System.out.println("Welcome to AddressBook program in AddressBook main class on master branch");    	
   
    }

}
class CreateContacts {
  String firstName, lastName, address, city, state;
  long zip, phoneNumber;
  int id;

   public void AddressBook( String firstName, String lastName, String address, String city, String state, long zip,long phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phoneNumber = phoneNumber;
 }
}
    

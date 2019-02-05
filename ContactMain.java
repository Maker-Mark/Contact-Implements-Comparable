import java.util.*;
import java.io.*;
import java.util.LinkedList;
public class ContactMain {

 public static void main(String[] args) throws Exception {
  Random rand = new Random();
  PrintWriter outFile = new PrintWriter("output.txt");
  Scanner sc = new Scanner(new File("Contacts.txt")); //Scanner to read from a file of completed contacts
  Scanner shortContact = new Scanner(new File("ShortContacts.txt")); //Scanner to read from a file of completed contacts
  LinkedList < Contact > cList = new LinkedList < > (); //LinkedList to hold Contact Objects
  StringTokenizer sTok = new StringTokenizer(" ");
  int fullContacts = 0, n = 0, m = 0;
  String first, last, phone, address, city, state;
   
  //Do the following WHILE: sc.hasNext() returns true
  while (sc.hasNext()) {

   first = sc.nextLine();
   last = sc.nextLine();
   phone = sc.nextLine();
   address = sc.nextLine();
   city = sc.nextLine();
   state = sc.nextLine();
   Contact nCon = new Contact(first, last, phone, address, city, state);
   cList.add(nCon);
   fullContacts++;
   System.out.println(nCon); //Prints the contact just added, demonstrating the toString method
  }

  //Adding some contacts with just name and phone 
  while (shortContact.hasNext()) {
   first = shortContact.nextLine();
   last = shortContact.nextLine();
   phone = shortContact.nextLine();
   Contact nCon = new Contact(first, last, phone);
   cList.add(nCon);
  }

  //Testing the functionality of the compareTo and equals method implemented in Contact Class
  for (int i = 1; i < cList.size(); i++) {
   // Starting from i = 1 so that we have a previous contact to compare it to. 
   System.out.println("Value from Lexicographic comparison of " +
    cList.get(i).getFullName() + " with " + cList.get(i - 1)
    .getFullName() + ":" + cList.get(i).compareTo(cList.get(i - 1)));
   outFile.println("Value from Lexicographic comparison of " +
    cList.get(i).getFullName() + "with" + cList.get(i - 1)
    .getFullName() + ":" + cList.get(i).compareTo(cList.get(i - 1)));

   //Using the equals method of the contact. One duplicate contact should be found.
   System.out.println("Is the " + i + "th" + " contact:" + cList.get(i).getFullName() + " equal to the " + (i - 1) + "th" + " contact:" +
    cList.get(i - 1).getFullName() + "?");
   if (cList.get(i).equals(cList.get(i - 1))) {
    System.out.println("Yes! You have a duplicate contact!");
   } else {
    System.out.println("Nope, they are not equal");
    System.out.println("------------------------------");
   }
  }

  //Updating contact. Assumes that you must change all the information on the contact, however, if you only have a name and a phone number, you will only need to update those fields
  //uses two new random integers to scramble and "update" the contact that has an address etc. 
  for (int i = 1; i < cList.size(); i++) {
    n = rand.nextInt(fullContacts - 1) + 1, m = rand.nextInt(fullContacts - 1) + 1;
   System.out.println("Contact number " + i + " is currently:");
   System.out.println(cList.get(i));

   if (cList.get(i).getAddress() != null) { // Update the contact to be the information of random bits from other contacts
    cList.get(i).updateContact(cList.get(m).getFirst(), cList.get(n).getLast(), cList.get(i - 1).getPhoneNum(), cList.get(n).getAddress(), cList.get(n).getCity(), cList.get(m).getState());
    System.out.println("Contact number " + i + " is now:");
    System.out.println(cList.get(i));
   } else {
    //If it does not have an address, we just update the contact by adding a s to the first name , a "son" to the lasnt name, and replacing the 1's  of the phone number with zeros
    cList.get(i).updateContact((cList.get(i).getFirst() + 's'), (cList.get(i).getLast() + "son"), (cList.get(i).getPhoneNum().replace('1', '0')));

   }
   System.out.println("Short Contact at list number " + i + " is now:");
   System.out.println(cList.get(i));
  }

  sc.close();
 }

}
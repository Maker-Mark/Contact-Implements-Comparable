import java.util.*;
import java.io.*;
import java.util.LinkedList;
public class ContactMain {
  
	public static void main(String[] args) throws Exception 
	{
    PrintWriter outFile = new PrintWriter("output.txt");
		Scanner sc = new Scanner ( new File("Contacts.txt")); //Scanner to read from a file
		LinkedList<Contact> cList = new LinkedList<>(); //LinkedList to hold Contact Objects
    StringTokenizer sTok = new StringTokenizer(" ");
    //Do the following WHILE: sc.hasNext() returns true
		while(sc.hasNext()) { //Implement way to make contacts with just name       and phone 
			String first, last, phone, address, city, state;
			first = sc.nextLine();
			last = sc.nextLine();
			phone = sc.nextLine();
		  address = sc.nextLine();
			city = sc.nextLine();
			state = sc.nextLine();
			Contact nCon = new Contact (first, last, phone, address, city, state);
			cList.add(nCon);
			System.out.println(nCon); //Prints the contact just added, demonstrating the toString method
		}
    //Testing the functionality of the compareTo method implemented in Contact Class
		for (int i = 0; i < cList.size(); i++){ 
      if(i >  0) {
        System.out.println("Value from Lexicographic comparison of " 
          + cList.get(i).getFullName()  + " with " + cList.get(i - 1)
          .getFullName()+ ":" + cList.get(i).compareTo(cList.get(i - 1)));
         outFile.println("Value from Lexicographic comparison of " 
          + cList.get(i).getFullName()  + "with" + cList.get(i - 1)
          .getFullName()+ ":" + cList.get(i).compareTo(cList.get(i - 1)));
      }   
    }
   	sc.close();
	}  

}

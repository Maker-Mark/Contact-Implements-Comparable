import java.util.*;
import java.io.*;
import java.util.LinkedList;
public class ContactMain {
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sc = new Scanner ( new File("Contacts.txt"));
		LinkedList<Contact> cList = new LinkedList<> ();
		while(sc.hasNext()) {
			String first, last, phone, address, city, state;
			 first = sc.nextLine();
			 last = sc.nextLine();
			 phone = sc.nextLine();
			 address = sc.nextLine();
			 city = sc.nextLine();
			 state = sc.nextLine();
			Contact nCon = new Contact (first, last, phone, address, city, state);
			cList.add(nCon);
			System.out.println(nCon);
		}
		sc.close();
		
	}

}

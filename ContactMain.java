import java.util.*;
import java.io.*;
import java.util.LinkedList;
public class ContactMain {
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sc = new Scanner ( new File("Contacts.txt"));
		LinkedList<Contact> cList = new LinkedList<> ();
    ArrayList<Contact> aList = new ArrayList<> ();
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
      aList.add(nCon);
			System.out.println(nCon);
		}
    
    //Testing the functionality of the compareTo method implemented in Contact Class
		for (int i = 0; i < aList.size(); i++){
      if(i >  0){
        System.out.println("Value from Lexicographic comparison of " 
          + aList.get(i).getFullName()  + " with " + aList.get(i - 1)
           .getFullName()+ ":" + aList.get(i).compareTo(aList.get(i - 1)));
      }   
    }
   	sc.close();
	}  

}

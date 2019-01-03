
public class Contact implements Comparable<Contact>
{
	private String first;
	private String last;
	private String phoneNum;
	private String address;
	private String city;
	private String state;

	//Constructor with all fields initialized
	public Contact(String first, String last, String phoneNum,
			String address, String city, String state) 
	{
		this.first = first;
		this.last = last;
		this.phoneNum = phoneNum;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	/**
	 * updateContact method allows the user to update all the
	 * information on a contact.
	 * @param first
	 * @param last
	 * @param phoneNum
	 * @param address
	 * @param city
	 * @param state
	 */
	public void updateContact(String first, String last, String phoneNum,
			String address, String city, String state) {
		this.first = first;
		this.last = last;
		this.phoneNum = phoneNum;
		this.address = address;
		this.city = city;
		this.state = state;

	}
	//Returns a print-friendly, formatted, string 
	public String toString() 
	{
		return String.format("%-8s %-10s Phone Number:%s%n%-10s%n%-8s, %-10s %n" , this.first, 
				this.last, this.phoneNum, this.address, this.city, this.state);
	}
	
	//Returns true if the first and last name are equal (ignoring case)
	public boolean equals(Contact c) 
	{
		if(c.first.equalsIgnoreCase(this.first) && c.last.equalsIgnoreCase(this.last))
			return true;
		return false;
	}


  /*
  We will define this method in the following way:
 If the last name of “another” is lexicographically first, return a positive
number.
 If the last name of “another” is lexicographically second, return a negative
number.
 If the last names are the same and the first names are also the same, return 0.
 If the last names are the same and the first names are different, use the first
names to determine the order
  */


	@Override
	public int compareTo(Contact o) 
  {
    if(this.last.compareTo(o.getLast()) > 0) {
  System.out.println("This object is lexicographically greater than the one we sent to this method");
  return 1;
    } else if(this.last.compareTo(o.getLast()) == 0) {
  System.out.println("Theyre lexicographically equal!");
  return 0;
      } 
  System.out.println("This object is lexicographically smaller than the one we sent to this method");
		return -1;
    
	}


	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Contact(String first, String last, String phoneNum)
	{

	}
  


}

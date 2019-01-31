
public class Contact implements Comparable <Contact> {
	private String first;
	private String last;
	private String phoneNum;
	private String address;
	private String city;
	private String state;

	//Constructor with all fields initialized
	public Contact(String first, String last, String phoneNum,
			String address, String city, String state) {
		this.first = first;
		this.last = last;
		this.phoneNum = phoneNum;
		this.address = address;
		this.city = city;
		this.state = state;
	}  
  
  //Constructor for Contact thar only has a name and phone number
  public Contact(String first, String last, String phoneNum) {
	  this.first = first;
		this.last = last;
		this.phoneNum = phoneNum;
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
  //Returns full name as a string
  public String getFullName() {
  return first + " " + last;
  }
  
	//Returns a print-friendly, formatted, string 
	public String toString() {
		return String.format("%-8s %-10s Phone Number:(%s)-%s-%s %n%-10s%n%-8s, %-10s %n" , this.first, 
				this.last, this.phoneNum.substring(0,3),this.phoneNum.substring(3,6), 
        this.phoneNum.substring(6,10),this.address, this.city, this.state);
	}
	
	//Returns true if the first and last name are equal (ignoring case)
	public boolean equals(Contact c) {
		if(c.first.equalsIgnoreCase(this.first) && c.last.equalsIgnoreCase(this.last))
			return true;
		return false;
	}

  /* compareTo() Method compares the contact object name lexicographically
   * @param Contact object
   * Output: integer signaling if this object's last name is lexicographically smaller ,
   * larger or equal to the cotact object being sent for comparison.
   * Positive IF:the last name of the "other" contact is lexicographically first, returns the 
   * posive value returned from the string compareTo method.
   * Negative IF: the last name of the "other" contact is lexicographically second, returns the 
   * negative value returned from the string compareTo method.
   * ZERO IF: the fist and last name are the same.
   * Uses first name IF: the last name of a contact is the same but the first name is different,
   * uses the first name of each object to to determine the order.
   */
   
	@Override
	public int compareTo(Contact o) {  
  int lexValLast = this.last.compareTo(o.getLast()), 
  lexValFirst = this.first.compareTo(o.getFirst());
    if(lexValLast != 0) {
      return lexValLast; //If theres a differnce in the last name returns that value. Otherwise
      } 
    if(lexValFirst == 0) {
       return 0; // This means they have the same exact name 
      } else { 
       return lexValFirst; // Send back the difference of their first name, since they share a last name
      }	
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
  
}

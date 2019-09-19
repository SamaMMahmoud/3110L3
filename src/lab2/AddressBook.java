package lab2;

import java.util.ArrayList;

public class AddressBook 
{
	private ArrayList<BuddyInfo> addyBook = new ArrayList<BuddyInfo>();
	
	public void addBuddy(String name, String phonenum, String address) 
	{
		this.addyBook.add(new BuddyInfo(name, phonenum, address));
		
	}
	
	public void removeBuddy(BuddyInfo bud) 
	{
		this.addyBook.remove(bud);
	}
	
	public static void main(String args []) 
	{
		AddressBook ab = new AddressBook();
		BuddyInfo budd = new BuddyInfo ("sama", "123", "cu");
		ab.addBuddy("sama", "123", "cu");
		ab.removeBuddy(budd);
	}
}

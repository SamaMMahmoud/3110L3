package lab2;

import java.util.ArrayList;

public class AddressBook 
{
	//added a comment for commit
	private ArrayList<BuddyInfo> addyBook;
	
	public AddressBook() {
		addyBook = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo bi) 
	{
		this.addyBook.add(bi);
	}
	
	public void addBuddy(String name, String phonenum, String address) 
	{
		this.addyBook.add(new BuddyInfo(name, phonenum, address));
		
	}
	
	public void removeBuddy(int ind) 
	{
		this.addyBook.remove(ind);
	}
	
	public void removeBuddy(BuddyInfo bud) 
	{
		this.addyBook.remove(bud);
	}
	
	public int size() {
		return addyBook.size();
	}
	
	public static void main(String args []) 
	{
		AddressBook ab = new AddressBook();
		BuddyInfo budd = new BuddyInfo ("sama", "123", "cu");
		ab.addBuddy("sama", "123", "cu");
		ab.removeBuddy(budd);
	}
}

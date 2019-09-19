package lab2;

public class BuddyInfo {
	private String name;
	private String phonenum;
	private String address;
	
	public BuddyInfo(String name, String phonenum, String address) {
		this.name = name;
		this.phonenum = phonenum;
		this.address = address;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenum() {
		return this.phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public static void main(String[] args) {
		//BuddyInfo bi = new BuddyInfo("Homer", "123","Carleton");
		//System.out.println("Hello " + bi.getName());
	}

}

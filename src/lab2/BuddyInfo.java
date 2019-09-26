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
	
	@Override
	public boolean equals(Object o) {
		//boilerplate of "Edge cases"
		if (this == o) return true;
		if (o == null) return false;
		if (!(o instanceof BuddyInfo)) return false;
		BuddyInfo bio = (BuddyInfo) o;
		return (bio.address.contentEquals(this.address) && bio.name.equals(this.name) && bio.phonenum.equals(this.phonenum));
	}
	//add equals tests
	//decoupling: 
	//cohesion: 
	
	public void TestBuddyInfo() {
		BuddyInfo bi = new BuddyInfo("Jo","123","123");
	}

}

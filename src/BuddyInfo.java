
public class BuddyInfo {
	private String name;
	private String address;
	private long phoneNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	public BuddyInfo(String name, String address, long number) {
		this.name = name;
		this.address= address; 
		phoneNumber = number; 
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}

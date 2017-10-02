import java.util.*;
public class AddressBook {
	
	private Map<String,BuddyInfo> book;  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuddyInfo buddy = new BuddyInfo("Nnamdi", "here",9811605);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);

	}
	
	public AddressBook() {
		book = new HashMap<String,BuddyInfo>();
	}
	
	
	public void addBuddy(BuddyInfo friend) {
		book.put(friend.getName(), friend);
		
	}
	
	public void removeBuddy(BuddyInfo friend) {
		book.remove(friend.getName());
		
	}
	
	public void imabuddy() {
		
	}

}

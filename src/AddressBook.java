import java.util.*;
public class AddressBook {
	
	private Map<String,BuddyInfo> book;
	
	
	public AddressBook() {
		book = new HashMap<String,BuddyInfo>();
	}
	
	
	public void addBuddy(BuddyInfo friend) {
		book.put(friend.getName(), friend);
		
	}
	
	public void removeBuddy(BuddyInfo friend) {
		book.remove(friend.getName());
		
	}

}

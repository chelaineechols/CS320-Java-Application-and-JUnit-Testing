//Chelaine Echols
//CS-320
//Module 3 Milestone 1
//05.26.2024

package contact; 

import java.util.*;

public class ContactService {
	
	private static ContactService instance = new ContactService();
	
	private ContactService() {
	}
	
	public static ContactService getInstance() {
		return instance;
	}
	
	static Map<String, Contact> contactMap = new HashMap<>();
		
	//Add new contact with unique ID
	public boolean addContact(Contact contact) {
		boolean contactAdded = false;
		
		//List is empty
		if (contactMap.isEmpty()) {
			contactMap.put(contact.getId(), contact);
			contactAdded = true;
		}
		//Check if ID exists
		else if(!contactMap.containsKey(contact.getId())) { 
				contactMap.put(contact.getId(), contact); 
				contactAdded = true;
			}
		else {
			throw new IllegalArgumentException("User ID already exists");
		}
		return contactAdded;
	}
	
	public boolean deleteContact(String contactId) {
		boolean contactDeleted = false;
		
		//List is empty
		if(contactMap.isEmpty()) {
			throw new IllegalArgumentException("User does not exist");
		}
		else if(contactMap.containsKey(contactId)) { 
			contactMap.remove(contactId); 
			contactDeleted = true;
		}
		return contactDeleted;
	}
	
	public boolean updateFirstName(String contactId, String newFirstName) {	
		boolean updated = false;
		
		//List is empty
		if(contactMap.isEmpty()) {
			throw new IllegalArgumentException("User ID does not exist");
		}
		else if(contactMap.containsKey(contactId)) {
			contactMap.get(contactId).setFirstName(newFirstName);
			updated = true;
		}
		else {
			throw new IllegalArgumentException("User ID does not exist");
		}
		return updated;
	}


	public boolean updateLastName(String contactId, String newLastName) {
		boolean updated = false;
		
		//List is empty
		if(contactMap.isEmpty()) {
			throw new IllegalArgumentException("User ID does not exist");
		}
		else if(contactMap.containsKey(contactId)) {
			contactMap.get(contactId).setLastName(newLastName);
			updated = true;
		}
		else {
			throw new IllegalArgumentException("User ID does not exist");
		}
		return updated;
	}
		
	public boolean updatePhone(String contactId, String newPhoneNumber) {		
		boolean updated = false; 
		
		//List is empty
		if(contactMap.isEmpty()) {
			throw new IllegalArgumentException("User ID does not exist");
		}
		else if(contactMap.containsKey(contactId)) {
			contactMap.get(contactId).setPhone(newPhoneNumber);
			updated = true;
		}
		else {
			throw new IllegalArgumentException("User ID does not exist");
		}
		return updated;
	}	

	public boolean updateAddress(String contactId, String newAddress) {		
		boolean updated = false;
		
		//List is empty
		if(contactMap.isEmpty()) {
			throw new IllegalArgumentException("User ID does not exist");
		}
		else if(contactMap.containsKey(contactId)) {
			contactMap.get(contactId).setAddress(newAddress);
			updated = true;
		}
		else {
			throw new IllegalArgumentException("User ID does not exist");
		}
		return updated;
	}
}

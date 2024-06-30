//Chelaine Echols
//CS-320
//Module 3 Milestone 1
//05.26.2024

package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	private static ContactService contactReference;
	
	@BeforeAll
	static void setUp() {
		contactReference = ContactService.getInstance();
	}

	//Test valid input
	//Add contact
	@Test
	void testContactServiceAddContact() {
		Contact contactTest1 = new Contact("1", "Chelaine", "Echols", "3605551234", "123 South Blvd"); 
		assertTrue(contactReference.addContact(contactTest1));
	}
	
	//Invalid add contact
	@Test
	void testContactServiceAddContactInvalid() {
		Contact contactTest2 = new Contact("2", "Bob", "Smith", "1234567890", "4 NE");
		contactReference.addContact(contactTest2);
		Contact contactTest3 = new Contact("2", "Charlie", "Jones", "9876543210", "5 SW");
		assertThrows(IllegalArgumentException.class, () -> {
			contactReference.addContact(contactTest3);});	
	}
	
	//Test delete contact
	@Test
	void testContactServiceDeleteContact() {
		Contact contactTest4 = new Contact("4", "James", "White", "5554443333", "567 South");
		contactReference.addContact(contactTest4);
		assertTrue(contactReference.deleteContact("4"));
	}
	
	//Test delete contact empty list
	@Test
	void testDeleteContactEmptyList() {
		ContactService.contactMap.clear();
		assertThrows(IllegalArgumentException.class, () -> {
			contactReference.deleteContact("12345");});				
	}

	//Test update first name 
	@Test
	void testContactServiceUpdateFirstName() {
		Contact contactTest5 = new Contact("5", "Josh", "Black", "7778889999", "8978 Lane");
		contactReference.addContact(contactTest5);
		assertTrue(contactReference.updateFirstName("5", "Ashley"));
	}
	
	//Test update first name empty list
	@Test
	void testUpdateFirstNameEmptyList() {
		ContactService.contactMap.clear();
		Contact contactTest6 = new Contact("6", "David", "Jack", "1114446666", "1234 South");
		assertThrows(IllegalArgumentException.class, () -> {
			contactReference.updateFirstName("6", "Dave");});
		}
		
	
	//Test update last name
	@Test
	void testContactServiceUpdateLastName() {
		Contact contactTest7 = new Contact("7", "Samantha", "Best", "7895559874", "1736 North");
		contactReference.addContact(contactTest7);
		assertTrue(contactReference.updateLastName("7", "Worst"));	
	}
	
	//Test update last name empty list
	@Test
	void testUpdateLastNameEmptyList() {
		ContactService.contactMap.clear();
		Contact contactTest8 = new Contact("8", "Nicole", "Cool", "6665557777", "9218 NW");
		assertThrows(IllegalArgumentException.class, () -> {
			contactReference.updateLastName("8", "Uncool");});
		}
		
	//Test update phone
	@Test
	void testContactServiceUpdatePhone() {
		Contact contactTest9 = new Contact("9", "Jack", "Smithton", "4567891234", "PO Box 4");
		contactReference.addContact(contactTest9);
		assertTrue(contactReference.updatePhone("9", "3601234567"));	
	}
	
	//Test update phone empty list
	@Test
	void testUpdatePhoneEmptyList() {
		ContactService.contactMap.clear();
		Contact contactTest10 = new Contact("10", "Leo", "Lion", "7893331212", "17 Fairway");
		assertThrows(IllegalArgumentException.class, () -> {
			contactReference.updatePhone("10", "7893331222");});
	}
	
	//Test update address
	@Test
	void testContactServiceUpdateAddress() {
		Contact contactTest11 = new Contact("11", "Jeremy", "Baker", "6238984444", "999 Northview");
		contactReference.addContact(contactTest11);
		assertTrue(contactReference.updateAddress("11", "1000 Northview"));	
	}
	
	//Test update address empty list
	@Test
	void testUpdateAddressEmptyList() {
		ContactService.contactMap.clear();
		Contact contactTest12 = new Contact("12", "George", "Curious", "7777777777", "777 First");
		assertThrows(IllegalArgumentException.class, () -> {
			contactReference.updateAddress("12", "777 Second");});
	}
	
}

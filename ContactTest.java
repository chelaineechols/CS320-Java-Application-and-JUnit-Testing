//Chelaine Echols
//CS-320
//Module 3 Milestone 1
//05.26.2024

package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//Test valid input
	@Test
	void testContact() {
		Contact contactTest1 = new Contact("1", "Chelaine", "Echols", "3605551234", "123 South Blvd");
		assertTrue(contactTest1.getId().equals("1"));
		assertTrue(contactTest1.getFirstName().equals("Chelaine"));
		assertTrue(contactTest1.getLastName().equals("Echols"));
		assertTrue(contactTest1.getPhone().equals("3605551234"));
		assertTrue(contactTest1.getAddress().equals("123 South Blvd"));		
	}
	
	//Invalid input for ID
	@Test
	void testContactIdInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Chelaine", "Echols", "3605551234", "123 South Blvd");});	//ID too long
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Chelaine", "Echols", "3605551234", "123 South Blvd");});				//ID null
		}
	
	//Invalid input for first name
	@Test
	void testContactFirstNameInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Razzamatazz", "Echols", "3605551234", "123 South Blvd");});			//First name too long
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Echols", "3605551234", "123 South Blvd");});					//First name null
	}
	
	//Invalid input for last name
	@Test
	void testContactLastNameInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Smithtonshire", "3605551234", "123 South Blvd");});		//Last name too long
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", null, "3605551234", "123 South Blvd");});					//Last name null
	}
	
	//Invalid input for phone
	@Test
	void testContactPhoneInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Echols", "360555123", "123 South Blvd");});				//Phone too short
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Echols", "36055512345", "123 South Blvd");});				//Phone too long
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Echols", null, "123 South Blvd");});						//Phone null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Echols", "555abc1234", "123 South Blvd");});				//Phone has letters
	}
	
	//Invalid input for address
	@Test
	void testContactAddressInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Echols", "3605551234", "123 South Blvd Smalltown, Anywhere, USA");});	//Address too long
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Chelaine", "Echols", "3605551234", null);});							//Address null
	}
	
	//Test Contact setFirstName
	@Test
	void testContactSetFirstName() {
		Contact contactTest2 = new Contact();
		contactTest2.setFirstName("Ashley");
		assertTrue(contactTest2.getFirstName().equals("Ashley"));		
	}
	
	//Test Contact setLastName
	@Test
	void testContactSetLastName() {
		Contact contactTest3 = new Contact();
		contactTest3.setLastName("Smith");
		assertTrue(contactTest3.getLastName().equals("Smith"));		
	}
	
	//Test Contact setPhone
	@Test
	void testContactSetPhone() {
		Contact contactTest4 = new Contact();
		contactTest4.setPhone("6235559876");
		assertTrue(contactTest4.getPhone().equals("6235559876"));		
	}
	
	//Test Contact setAddress
	@Test
	void testContactSetAddress() {
		Contact contactTest5 = new Contact();
		contactTest5.setAddress("456 North Street");
		assertTrue(contactTest5.getAddress().equals("456 North Street"));		
	}
	
	//Test invalid setFirstName
	@Test
	void testContactInvalidSetFirstName() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest6 = new Contact();
			contactTest6.setFirstName("Razzamatazz");});									//First name too long
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest6 = new Contact();
			contactTest6.setFirstName(null);});												//First name null
	}
	
	//Test invalid setLastName
	@Test
	void testContactInvalidSetLastName() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest7 = new Contact();
			contactTest7.setLastName("Smithtonshire");});									//Last name too long
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest7 = new Contact();
			contactTest7.setLastName(null);});												//Last name null
	}	
	
	//Test invalid setPhone
	@Test
	void testContactInvalidSetPhone() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest8 = new Contact();
			contactTest8.setPhone("123");});												//Phone number too short
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest8 = new Contact();
			contactTest8.setPhone("12345678910");});										//Phone number too long
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest8 = new Contact();
			contactTest8.setPhone(null);});													//Phone number null
	}
	
	//Test invalid setAddress
	@Test
	void testContactInvalidSetAddress() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest9 = new Contact();
			contactTest9.setAddress("123456 Northwest Boulevard, Anywhere, USA");});			//Address too long
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contactTest9 = new Contact();
			contactTest9.setAddress(null);});													//Address null
	}
}

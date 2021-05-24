package com.AddressBook_CSV_JSON;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookCsvTest {

	@Test
	public void givenThreeContacts_WhenWrittenIn_CSVFileShouldPassTheTest() 
    {
		AddressBookCSV addressBookCSVobject=new AddressBookCSV("C:\\Users\\Mr_Robot\\Desktop\\Fellowship\\AddressBook_CSV_JSON\\lib\\src\\main\\resources\\AddressBookCSVTesting.csv");
		int readCSVContacts=addressBookCSVobject.readAddressBookFromCSVFile();
		Assert.assertEquals(3,readCSVContacts);
	} 
	
	 @Test
	    public void givenThreeContacts_WhenWrittenAs_JSONFileShouldPassTheTest()
	    {
	    		AddressBookJSON addressBookJSON=new AddressBookJSON();
	    		int numberOfContacts = addressBookJSON.readAddressBookFromAJSONFile("C:\\Users\\Mr_Robot\\Desktop\\Fellowship\\AddressBook_CSV_JSON\\lib\\src\\main\\resources\\AddressBookJSONTesting.json");
	    		Assert.assertEquals(3, numberOfContacts);
	    }
}

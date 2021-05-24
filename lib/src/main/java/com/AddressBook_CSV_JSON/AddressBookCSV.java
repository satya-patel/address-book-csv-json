package com.AddressBook_CSV_JSON;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;


public class AddressBookCSV 
{
	public String addressBookCSV;
	public AddressBookCSV(String addressBookCSV)
	{
		super();
		this.addressBookCSV = addressBookCSV;
	}
	
	public void writeContactDetailsToAFile(List<Contacts> contact) 
	{
		try (Writer filewrite = Files.newBufferedWriter(Paths.get(this.addressBookCSV));) 
		{
			StatefulBeanToCsv<Contacts> beanToCSV = new StatefulBeanToCsvBuilder(filewrite)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();
					
			beanToCSV.write(contact);
		} 
		catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException | IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}

	public int readAddressBookFromCSVFile() 
	{
		List<Contacts> contactList = new ArrayList<>();
		try (Reader reader = Files.newBufferedReader(Paths.get(this.addressBookCSV));) 
		{
			CSVReader csvReader = new CSVReader(reader);
			List<String[]> contactStringsInFile = csvReader.readAll();
			contactStringsInFile.remove(0);
			contactStringsInFile.stream().forEach(contactsArray -> {
			String firstName = contactsArray[0];
			String lastName = contactsArray[1];
			long phoneNumber = Long.parseLong(contactsArray[2]);
			String email = contactsArray[3];
			String address = contactsArray[4];
			int zip = Integer.parseInt(contactsArray[5]);
			String city = contactsArray[6];
			String state = contactsArray[7];
			
			
			Contacts contactObj = new Contacts(firstName, lastName,phoneNumber,email, address,zip,city,state);
			contactList.add(contactObj);
			});
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return contactList.size();
	}
}

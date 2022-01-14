package com.bridgelabz;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AddressBookSystemFileIOService {
	public static String contacts_FILE_NAME="AddressBookSystem-file.txt";
	
	public void writeData(List<AddressBookSystem> addressBookSystemList) {
	StringBuffer abcBuffer = new StringBuffer();
	addressBookSystemList.forEach(abc-> {
		String AddressBookSystemString = abc.toString().concat("\n");
		abcBuffer.append(AddressBookSystemString);
	});
	try {
		Files.write(Paths.get(contacts_FILE_NAME), abcBuffer, toString(), getBytes());
	}catch (IOException e) {
		e.printStackTrace();
	}
}
	public void printData() {
		try {
			Files.lines(new File (AddressBookSystem_FILE_NAME).topath())
			.forEach(System.out::println);
		}catch (IOException e) {
			
		}
	}
}


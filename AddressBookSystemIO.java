package com.bridgelabz;

import java.util.List;

public class AddressBookSystemIO {

	private static List<AddressBookSystem> AddressBookSystemList;
	
public void writeAddressBookSystem(IOService ioService) {
	if(ioService.equals(IOService.CONSOLE_IO))
		System.out.println("\nWriting Contacts to Console\n" +AddressBookSystemList);
	else if(ioService.equals(IOService.CONSOLE_IO))
		new AddressBookSystemFileIOService().writeData(AddressBookSystemList); 
}	
}

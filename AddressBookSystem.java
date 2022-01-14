package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;  

public class AddressBookSystem {
	String Personname,address,city,state,email;
	int zip_code,phone_number;
	
	public void Contacts() {
		ArrayList al = new ArrayList();		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter Personname");
		Personname= sc.nextLine();
		System.out.println("enter phone number");
		int phone_number= sc.nextInt();
		System.out.println("enter zip_code");
		int zip= sc.nextInt();
		System.out.println("enter address");
		String address= sc.nextLine();
		System.out.println("enter city");
		String city = sc.nextLine();
		System.out.println("enter state");
		String state= sc.nextLine();
		System.out.println("enter email");
		String email = sc.nextLine();
		al.add(Personname);
		al.add(phone_number);
		al.add(zip_code);
		al.add(address);
		al.add(city);
		al.add(state);
		al.add(email);		
		System.out.println(Personname);
		System.out.println(phone_number);
		System.out.println(zip_code);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
		System.out.println(email);
	}	 
	public void addContacts() {
		ArrayList a = new ArrayList();
		Contacts();
		
	}
	public static void main(String args[]) {
		AddressBookSystemIO absf = new AddressBookSystemIO();
		absf.writeAddressBookSystem();
		}
	}


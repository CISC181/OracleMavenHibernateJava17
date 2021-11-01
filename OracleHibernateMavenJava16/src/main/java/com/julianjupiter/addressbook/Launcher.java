package com.julianjupiter.addressbook;

import com.julianjupiter.addressbook.controller.ContactMapper;
import com.julianjupiter.addressbook.service.ContactService;

public class Launcher {
	
    private static  ContactService contactService = null;
    private static  ContactMapper contactMapper = new ContactMapper();
    
    public static void main(String[] args) {
    	try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        contactService = ContactService.create();
        contactMapper = new ContactMapper();
        
    	var x = contactService.findAll();
    	
    	System.out.println(x.get(0).getAddress());
    }
}

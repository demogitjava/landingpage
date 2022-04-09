package de.jgsoftware.landingpage.service.interfaces;


import javax.mail.internet.AddressException;

public interface i_contact_service
{

    String sendEmail(String stmessage, String name, String email) throws AddressException;
}

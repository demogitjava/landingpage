package de.jgsoftware.landingpage.service;


import de.jgsoftware.landingpage.service.interfaces.i_contact_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class contact_service implements i_contact_service
{

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Override
    public String sendEmail(String stmessage, String name, String email) throws AddressException {


        String sender = "jgsoftwares@gmx.net";
        String password = "mvpr52k1";
        String receiver = email;

        Properties properties = new Properties();

        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.host", "mail.gmx.net");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.user", sender);
        properties.put("mail.smtp.password", password);
        properties.put("mail.smtp.starttls.enable", "true");

        Session mailSession = Session.getInstance(properties, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(properties.getProperty("mail.smtp.user"),
                        properties.getProperty("mail.smtp.password"));
            }
        });


        try
        {
            Message message = new MimeMessage(mailSession);
            InternetAddress addressTo = new InternetAddress(receiver);
            message.setRecipient(Message.RecipientType.TO, addressTo);
            //message.setFrom(new InternetAddress(sender));
            message.setFrom(new InternetAddress("jgsoftwares@gmx.net"));
            message.setSubject(name + " _ " + email + sender);
            message.setContent(stmessage, "text/plain");
            Transport.send(message);
        } catch(Exception e)
        {
            System.out.print("Fehler send Email over smtp" + e);
        }


        return "send";
    }




}

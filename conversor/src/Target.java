import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Target { 
    

    public  void EnvioDeEmail(String para, String de){

        String host = "smtp.office365.com";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        new javax.mail.Authenticator() {
         protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
           return new javax.mail.PasswordAuthentication("saramiranda201814@gmail.com", "S@ra2004");
             }
         };

        Session session = Session.getDefaultInstance(properties);
    
        try{

        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(de));

        message.addRecipient(Message.RecipientType.TO, new InternetAddress(para));

        message.setSubject("Teste de envio de e-mail");

        message.setText("Testando o envio de e-mail por um programa java usando smtp do Google");

        Transport.send(message); System.out.println("Email Sent successfully....");

        }catch (MessagingException mex){ mex.printStackTrace(); }
    }

    
}

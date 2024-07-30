
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;



public class SendAttachment
{
    
    public static void main(String[] args)
    {
        String host="mail.yahoo.com";
        String userid="sahilsuman735@yahoo.com";
        String pass="";
        String to="sahilsuman123@gmail.com";



      Properties p=new Properties();
        p.put("mail.smtp.host", host);
        p.put("mail.smtp.auth", "true");
        
        Session s=Session.getDefaultInstance(p, new Authenticator()
                {
            protected PasswordAuthentication getAuthenticator()
            {
                return new PasswordAuthentication(userid, pass);
                
            }
                });
        
        try
        {
            MimeMessage msg=new MimeMessage(s);
            msg.setFrom(new InternetAddress(userid));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            msg.setSubject("Java Mail");



           BodyPart msg1=new MimeBodyPart();
            msg.setText("Mail Body with an attachment");



           BodyPart msg2=new MimeBodyPart();
            String fnm="ann1.java";
            DataSource src=new FileDataSource(fnm);
            msg2.setDataHandler(new DataHandler(src));
            msg2.setFileName(fnm);



           Multipart mp= new MimeMultipart();
            mp.addBodyPart(msg1);
            mp.addBodyPart(msg2);
            msg.setContent(mp);



           Transport.send(msg);
            System.out.println("Mail Send");
        }
          catch(MessagingException e)
        {
            System.err.println(e);  
          }
    }
    
            
                }

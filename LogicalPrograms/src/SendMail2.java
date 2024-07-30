import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
public class SendMail2 {

	public static void main(String[] args) {
		Properties p=new Properties();
		p.put("mail.stmp.host","stmp.gmail.com");
		p.put("mail.stmp.socketFactory.port","465");
			p.put("mail.stmp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			p.put("mail.stmp.auth","true");
			p.put("mail.stmp.port","465");
			String userid="tajuddinshaik239@gmail.com";
			String pass="";
			String to="tajuddin.shaik4786@gmail.com";
			
			Session s=Session.getDefaultInstance(p,new Authenticator()
            {
            protected PasswordAuthentication getAuthentication()
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
        msg.setText("Our First Mail using Java API");

        Transport.send(msg);
        System.out.println("Mail Send");
    }
    catch(MessagingException e)
    {
        System.err.println(e);
    }

	}
	

}

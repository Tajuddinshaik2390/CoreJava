import java.util.*;
import javax.mail.*;
import java.io.*;
import com.sun.mail.pop3.*;



public class RecieveMail {



  public static void main(String[] args)
    {
        String userid="";
        String pass="";
        String pop3Host="mail.google.com";
        String mailStoreType="pop3";
        try
        {
         Properties p=new Properties();
         p.put("mail.pop3.host", pop3Host);
         Session s=Session.getDefaultInstance(p);
         POP3Store ps=(POP3Store) s.getStore(mailStoreType);
         ps.connect(userid, pass);



        Folder f=ps.getFolder("INBOX");
         f.open (Folder.READ_ONLY);



        Message []msg=f.getMessages();
         for(int i=0; i<msg.length;i++) {




        Message m=msg[i];
        System.out.println("From :" + m.getFrom() [0]);
        System.out.println("Subject : " + m.getSubject());
        System.out.println("Mail Body: " + m.getContent());
        System.out.println();



   }
    f.close(false);
    ps.close();
}
catch(Exception e) {



   System.err.println(e);



  }
}



}
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.io.*;
public class RecieveAttachment {

	public static void main(String[] args) throws Exception {
		
String host="mail.yahoo.com";
String userid="tajuddinshaik239@gmail.com";
String pass="";
Properties p=new Properties();
p.put("mal.stmp.host",host);
p.put("mail.stmp.auth","true");
Session s=Session.getDefaultInstance(p,new Authenticator() {
	protected PasswordAuthentication getAuthentication() {
		return new PasswordAuthentication(userid,pass);
		
	}
});

Store st = s.getStore("pop3");
 st.connect(host, userid, pass);
 Folder f = st.getFolder("INBOX");
 f.open(Folder.READ_WRITE);
 Message []m=f.getMessages();
 for(int i=0; i<m.length; i++) {
Multipart mp =(Multipart) m[i].getContent();
for(int j=0; j<mp.getCount(); j++) {
BodyPart bp = mp.getBodyPart(j);
InputStream is = bp.getInputStream();
InputStreamReader isr = new InputStreamReader(is);
BufferedReader br = new BufferedReader(isr);
while(br.ready()) {
System.out.println(br.readLine());
}
System.out.println();  
}
System.out.println();
}
f.close(true);
st.close();
    }
}





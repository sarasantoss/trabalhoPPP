import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Adapter extends Target{
    private Adaptee adaptee;

    public Adapter(Adaptee tomadaDeTresPinos){
        this.adaptee = tomadaDeTresPinos;
    }

  //  @Override
  //  public void EnvioDeEmail("saramiranda2004@gmail.com", "saramiranda201814@gmail.com"){
   //     adaptee.ligarNaTomadaDeTresPinos();
   // }
}

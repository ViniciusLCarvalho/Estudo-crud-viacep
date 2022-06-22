package pkgCepBuscar;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Emails {
	SimpleEmail email;
	String textoEmail;
	
	public boolean enviarEmail() {
		email = new SimpleEmail();
		
		textoEmail = "Prezados,\n	"
						+ "		GitHub: https://github.com/ViniciusLCarvalho/crud-viacep.git \n\n"
						+ "Atenciosamente,\n"
						+ "Vinicius L Carvalho";
		
		
		try {
			email.setHostName("smtp.googlemail.com"); //servidor SMTP
			email.setSmtpPort(587);
			email.setAuthentication("vinnykarvalho93@gmail.com", "zekpam-hyzkek-wEqra5"); 
			email.setSSLOnConnect(true);
			email.setFrom("vinnykarvalho93@gmail.com"); //remetente
			email.setSubject("TESTE - CEP - Seleção DEV Java - Vinicius Lopes Carvalho"); //assunto
			email.setMsg(textoEmail);
			email.addTo("vinnykarvalho@hotmail.com"); //destinatario
			//email.addTo("contato@integralys.com.br"); //destinatario
			email.send();
		}catch(EmailException ex) {
			ex.printStackTrace();
			return false;
		}
		
		return true;
	}
}

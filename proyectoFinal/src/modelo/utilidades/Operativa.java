package modelo.utilidades;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;


public class Operativa {

		public static String encriptarSha256(String texto) {
			byte[] sha=DigestUtils.sha256(texto);
			String resultado=new String(Base64.encodeBase64String(sha));
			return resultado;
			
		}
		public static String encriptarSha256Hexadecimal(String texto) {
			return DigestUtils.sha256Hex(texto);
		}
	
}

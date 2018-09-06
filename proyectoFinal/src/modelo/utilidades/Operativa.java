package modelo.utilidades;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import bean.Coordenadas;


public class Operativa {

		public static String encriptarSha256(String texto) {
			byte[] sha=DigestUtils.sha256(texto);
			String resultado=new String(Base64.encodeBase64String(sha));
			return resultado;
			
		}
		public static String encriptarSha256Hexadecimal(String texto) {
			return DigestUtils.sha256Hex(texto);
		}
		
		public static double dameDistancia(Coordenadas c1, Coordenadas c2) {
		double distancia;
		distancia=Math.sqrt((Math.pow((c1.getLatitud()-c2.getLatitud()),2)+Math.pow((c1.getLongitud()-c2.getLongitud()),2)));
		return distancia;
		}
	
}

package UsuarioIphone;

import AplicativosNewIphone.Musica.Musica;
import AplicativosNewIphone.Internet.Internet;
import AplicativosNewIphone.Telefone.Telefone;
import AplicativosNewIphone.IphoneMultiApps.IphoneMultiApps;


public class UsuarioIphone {
	public static void main(String[] args) {
		IphoneMultiApps multiapps = new IphoneMultiApps();
		
		Internet internet = multiapps;
		Musica musica = multiapps;
		Telefone telefone = multiapps;
		
		
		musica.tocar();
		musica.selecionarMusica("Deus é Fiel");
		
		
		telefone.ligar("84 99176-9679");
		internet.exibirPagina("www.dio.me");
		
	}
	
}

package AplicativosNewIphone.IphoneMultiApps;

import AplicativosNewIphone.Internet.Internet;
import AplicativosNewIphone.Telefone.Telefone;
import AplicativosNewIphone.Musica.Musica;

public class IphoneMultiApps implements Internet, Musica, Telefone{

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando usando meu Iphone Multi Aplicativos.");
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo usando meu Iphone Multi Aplicativos.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz usando meu Iphone Multi Aplicativos.");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica usando meu Iphone Multi Aplicativos.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica usando meu Iphone Multi Aplicativos.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica usando meu Iphone Multi Aplicativos.");
		System.out.println("Musica escolhida: " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina no navegador da internet usando meu Iphone Multi Aplicativos.");
		System.out.println("Site: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador usando meu Iphone Multi Aplicativos.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando paragina do navegador usando meu Iphone Multi Aplicativos.");
		
	}

	
}

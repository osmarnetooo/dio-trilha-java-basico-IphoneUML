package AplicativosNewIphone.Internet;

public class NavegadorInternet implements Internet{
	
	public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

}

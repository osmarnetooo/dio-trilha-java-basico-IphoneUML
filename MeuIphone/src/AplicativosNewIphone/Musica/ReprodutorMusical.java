package AplicativosNewIphone.Musica;

public class ReprodutorMusical implements Musica {

	public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
    
}

import com.bruno.iphone.Iphone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("Iphone xr", "12221234144");

        // Aparelho Telefônico
        meuIphone.atender();
        meuIphone.ligar("40028922");
        meuIphone.iniciarCorreioVoz();

        // Navegador de Internet
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        meuIphone.exibirPagina();

        //Reprodutor de Musicas
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Iron Maiden - The Trooper");
    }
}
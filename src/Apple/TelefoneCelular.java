package Apple;

import Aparelho.Iphone;

public class TelefoneCelular {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Funções do Ipod: ");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.proximaMusica();
        iphone.voltarUmaMusica();

        System.out.println("");

        System.out.println("Funções do aparelho telefonico: ");
        iphone.fazerLigacao();
        iphone.adicionarNovoContato();
        iphone.abrirCorreioDeVoz();
        iphone.sincronizarContatos();

        System.out.println("");


        System.out.println("Funções do navegador da Internet: ");
        iphone.exibirPagina();
        iphone.adiconarNovaAba();
        iphone.atualizarPagina();
    }
}

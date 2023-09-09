package Aparelho;

import Aplicativos.AparelhoTelefonico;
import Aplicativos.NavegadorInternet;
import Aplicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void proximaMusica() {
        System.out.println("Passando para próxima música");
    }

    public void voltarUmaMusica() {
        System.out.println("Voltando uma música.");
    }

    public void fazerLigacao() {
        System.out.println("Ligando para .......");
    }

    public void sincronizarContatos() {
        System.out.println("Sincronizando contatos");
    }

    public void abrirCorreioDeVoz() {
        System.out.println("Vizualizando todas as mensagens de correio de voz.");
    }

    public void adicionarNovoContato() {
        System.out.println("Novo contato adicionado.");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da Internet.");
    }

    public void adiconarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");

    }
}


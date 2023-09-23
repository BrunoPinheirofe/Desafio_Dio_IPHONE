package com.bruno.iphone;

import com.bruno.interfaces.AparelhoTelefone;
import com.bruno.interfaces.NavegadorInternet;
import com.bruno.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical {

    //atributos
    private String modelo;
    private String numeroTelefone;

    public Iphone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA: " + numero + "...");

    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO TELEFONE...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo pagina web...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado mais uma aba...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando aba...");
    }

    @Override
    public void tocar() {
        System.out.println("play na musica...");
    }

    @Override
    public void pausar() {
        System.out.println("pausando a musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecinado musdica: " + musica + "...");
    }
}

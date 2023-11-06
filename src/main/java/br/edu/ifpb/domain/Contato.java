package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


// Em resumo, a importação import java.io.Serializable; não é usada diretamente no código, mas a implementação da interface Serializable na classe 
// Contato permite que os objetos dessa classe sejam serializados.

public class Contato implements Serializable{
    private String nome;
    private String sobrenome;
    private boolean ligacao;
    private boolean chamadaVideo;
    private String categoria;
    private String tipoDeEntrada;
    private String valorDaEntrada;
    

    // construtor
    public Contato(String nome,String sobrenome, boolean ligacao, boolean chamadaVideo, String categoria, String tipoDeEntrada, String valorDaEntrada){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ligacao = ligacao;
        this.chamadaVideo = chamadaVideo;
        this.categoria = categoria;
        this.tipoDeEntrada = tipoDeEntrada;
        this.valorDaEntrada = valorDaEntrada;
    }

    //@Override
    //public boolean equals(Object obj) {
        //if (this == obj) return true;
        //if (obj == null || getClass() != obj.getClass()) return false;
        //Contato contato = (Contato) obj;
        //return this.contato == contato.contato;
    //}

    // setters e getters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public boolean getLigacao(){
        return ligacao;
    }

    public void setLigacao(boolean ligacao){
        this.ligacao = ligacao;
    }

    public boolean isChamadaVideo() {
        return chamadaVideo;
    }

    public void setChamadaVideo(boolean chamadaVideo) {
        this.chamadaVideo = chamadaVideo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getValorDaEntrada() {
        return valorDaEntrada;
    }

    public void setValorDaEntrada(String valorDaEntrada) {
        this.valorDaEntrada = valorDaEntrada;
    }

    public void redeSocial(){
        List<String> aplicativos = new ArrayList<>();

        aplicativos.add("Email");        
        aplicativos.add("WhatsApp");
        aplicativos.add("Instagram");
        aplicativos.add("Telegram");

    }

    // sobrescrita

    @Override
    public String hashCode() {
        return Objects.hash(getValorDeEntrada());
    }

    // Este método está calculando o código hash (um valor numérico) com base apenas no atributo número 
    // do objeto Contato. Isso significa que, se dois Contatos tiverem o mesmo número, 
    // eles terão o mesmo código hash, o que é desejável para garantir que objetos com o 
    // mesmo número sejam considerados iguais ao serem inseridos em estruturas de dados que dependem 
    // do código hash, como HashSetouHashMap`.
}



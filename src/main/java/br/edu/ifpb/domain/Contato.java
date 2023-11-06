package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.Objects;

// Em resumo, a importação import java.io.Serializable; não é usada diretamente no código, mas a implementação da interface Serializable na classe 
// Contato permite que os objetos dessa classe sejam serializados.

public class Contato implements Serializable{
    private String nome;
    private String sobrenome;
    private int contato;
    private boolean chamadaVideo;
    private String categoria;

    // construtor
    public Contato(String nome,String sobrenome, int contato, boolean chamadaVideo, String categoria){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
        this.chamadaVideo = chamadaVideo;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contato contato = (Contato) obj;
        return this.contato == contato.contato;
    }

    // setters e getters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public boolean isChamadaVideo() {
        return chamadaVideo;
    }

    public void setChamadaVideo(boolean chamadaVideo) {
        this.chamadaVideo = chamadaVideo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // sobrescrita

    @Override
    public int hashCode() {
        return Objects.hash(getContato());
    }

    // Este método está calculando o código hash (um valor numérico) com base apenas no atributo número 
    // do objeto Contato. Isso significa que, se dois Contatos tiverem o mesmo número, 
    // eles terão o mesmo código hash, o que é desejável para garantir que objetos com o 
    // mesmo número sejam considerados iguais ao serem inseridos em estruturas de dados que dependem 
    // do código hash, como HashSetouHashMap`.
}



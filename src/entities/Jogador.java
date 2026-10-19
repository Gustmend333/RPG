package entities;

import java.util.ArrayList;

public class Jogador {

    private String nome;
    private Integer nivel;
    private Classe classe;

    public Jogador(String nome, Integer nivel, Classe classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}

package entities;

import entities.Classes.Classe;

public class Jogador {

    private String nome;
    private Integer nivel = 1;
    private Classe classe;

    public Jogador(String nome, Classe classe) {
        this.nome = nome;
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

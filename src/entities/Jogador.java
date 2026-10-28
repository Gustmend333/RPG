package entities;

import entities.Classes.Classe;

public class Jogador {

    private String nome;
    private Integer nivel = 1;
    private Classe classe;
    private Atributos atributos;
    private Integer vida;
    private Integer classeArmadura;

    public Jogador(String nome, Classe classe, Atributos atributos) {
        this.nome = nome;
        this.classe = classe;
        this.atributos = atributos;
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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(Integer classeArmadura) {
        this.classeArmadura = classeArmadura;
    }
}

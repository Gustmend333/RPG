package entities;

public class Atributos {

    private Integer forca;
    private Integer destreza;
    private Integer carisma;
    private Integer inteligencia;
    private Integer sabedoria;
    private Integer constituicao;

    public Atributos(Integer forca, Integer destreza, Integer carisma, Integer inteligencia, Integer sabedoria, Integer constituicao) {
        this.forca = forca;
        this.destreza = destreza;
        this.carisma = carisma;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.constituicao = constituicao;
    }

    public Integer getForca() {
        return forca;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public Integer getCarisma() {
        return carisma;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public Integer getSabedoria() {
        return sabedoria;
    }

    public Integer getConstituicao() {
        return constituicao;
    }
}

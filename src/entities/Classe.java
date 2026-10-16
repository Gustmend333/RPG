package entities;

public abstract class Classe {

    private Integer forca;
    private Integer destreza;
    private Integer carisma;
    private Integer inteligencia;
    private Integer sabedoria;
    private Integer constituicao;

    public Classe(Integer forca, Integer destreza, Integer carisma, Integer inteligencia, Integer sabedoria, Integer constituicao) {
        this.forca = forca;
        this.destreza = destreza;
        this.carisma = carisma;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.constituicao = constituicao;
    }

    public Classe() {
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public Integer getCarisma() {
        return carisma;
    }

    public void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(Integer sabedoria) {
        this.sabedoria = sabedoria;
    }

    public Integer getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(Integer constituicao) {
        this.constituicao = constituicao;
    }
}

package entities.Classes;

public abstract class Classe {

    public int GerarModificador(Integer atributo){
        return Math.floorDiv(atributo - 10, 2);
    }


    public abstract String apresentacao();


}

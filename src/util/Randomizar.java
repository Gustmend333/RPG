package util;

import java.util.Random;

public class Randomizar {

    private static Random aleatorio = new Random();

    public static int gerarAtributos(){
        return aleatorio.nextInt(3, 19);
    }


}

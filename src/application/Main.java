import entities.Atributos;
import entities.Enums.AtributosEnum;
import entities.Enums.ClassesEnum;
import util.Cores;
import util.Randomizar;

void main() {

    Scanner sc = new Scanner(System.in);

    IO.println("-------------------------(NOME DO RPG)-------------------------");
    IO.println(Cores.AMARELO + "Bem vindo ao RPG (Nome do RPG), aqui você encontrará um mundo de aventuras e irá colocar seu nome nos livros de história dessa terra." + Cores.RESET);
    IO.println("Iremos começar criando seu personagem, então nos diga, herói, qual o seu nome: ");

    String nomeJogador = sc.nextLine();

    IO.println("Agora, como você irá enfrentar as aventuras e perigos que esse mundo oferece? Nos diga a sua classe: ");

    for (ClassesEnum classesEnum : ClassesEnum.values()) {
        IO.print((classesEnum.ordinal() + 1) + " - " + classesEnum.name() + "\n");
    }


    IO.print("\nEscolha sua classe: ");

    int classe = 0;

    while (true) {
        if (!sc.hasNextInt()) {
            IO.print("Valor inválido, por favor, insira uma opção válida: ");
            sc.nextLine();
            continue;
        }

        classe = sc.nextInt();
        sc.nextLine();

        if (classe < 1 || classe > ClassesEnum.values().length) {
            IO.print("Valor inválido, por favor, insira uma opção válida: ");
            continue;
        }
        break;

    }

    ClassesEnum classeEscolhida = ClassesEnum.values()[classe - 1];

    IO.println();
    IO.println("Perfeito, " + nomeJogador + ". Você é o mais novo " + nomeClasse(classeEscolhida).toLowerCase() +"! \n" + classeEscolhida.getClasse().apresentacao());

    IO.println("-------------------------------------------------------------------------------------------");

    IO.println("\nAgora que você já decidiu como será conhecido no nosso mundo, iremos adicionar os valores de status para os seus atributos!\n");
    IO.println("Você poderá separar seus status em 6 atributos: ");

    for (AtributosEnum atributos : AtributosEnum.values()){
        IO.println((atributos.ordinal() + 1) + " - " + atributos.name());
    }

    for(AtributosEnum atributos : AtributosEnum.values()){
        int x = Randomizar.gerarAtributos();
        IO.println(x);
    }

}//Final do Main

public static String nomeClasse(ClassesEnum classe){
    return classe.getClasse().getClass().getSimpleName();
}

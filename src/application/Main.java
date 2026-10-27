import entities.Classes.*;
import entities.ClassesEnum;
import entities.Jogador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

 Scanner sc = new Scanner(System.in);

 IO.println("-------------------------(NOME DO RPG)-------------------------");
 IO.println("Bem vindo ao RPG (Nome do RPG), aqui você encontrará um mundo de aventuras e irá colocar seu nome nos livros de história dessa terra.");
 IO.println("Iremos começar criando seu personagem, então nos diga, herói, qual o seu nome: ");

 String nomeJogador = sc.nextLine();

 IO.println("Agora, como você irá enfrentar as aventuras e perigos que esse mundo oferece? Nos diga a sua classe: ");

 for(ClassesEnum classesEnum : ClassesEnum.values()){
  IO.print((classesEnum.ordinal()+1) + " - " + classesEnum.name() + "\n");
 }


 IO.print("\nEscolha sua classe: ");

 int classe = 0;

 while(true) {
  if (!sc.hasNextInt()) {
   IO.print("Valor inválido, por favor, insira uma opção válida: ");
   sc.nextLine();
   continue;
  }

  classe = sc.nextInt();
  sc.nextLine();

  if(classe < 1 || classe > 5){
   IO.print("Valor inválido, por favor, insira uma opção válida: ");
   continue;
  }
   break;

 }

 ClassesEnum numeroClasse = ClassesEnum.values()[classe - 1];

 Jogador jogador = new Jogador(nomeJogador, numeroClasse.getClasse());
 IO.print(jogador.getClasse().getClass().getSimpleName());

}

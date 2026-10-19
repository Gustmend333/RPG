import entities.Classe;
import entities.Jogador;
import entities.Mago;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

 Jogador player1 = new Jogador("Mendonça", 2, new Mago(8, 15, 18, 20, 13, 10));

 IO.print(player1.getClasse().GerarModificador(player1.getClasse().getForca()));



}

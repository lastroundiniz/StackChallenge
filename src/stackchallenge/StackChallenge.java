/* GUSTAVO DINIZ TARGINO */

/*Trabalho Estrutura de Dados (Pilha)*/

/*
Dada uma pilha de n cartas enumeradas de 1 até n com a carta 1 no topo e a carta n na base.
A seguinte operação é ralizada enquanto tiver 2 ou mais cartas na pilha.
Jogue fora a carta do topo e mova a próxima carta (a que ficou no topo) para a base da pilha.
Sua tarefa é encontrar a sequência de cartas descartadas e a última carta remanescente.
Cada linha de entrada (com exceção da última) contém um número n ≤ 50.
A última linha contém 0 e não deve ser processada.
Cada número de entrada produz duas linhas de saída.
A primeira linha apresenta a sequência de cartas descartadas e a segunda linha apresenta a carta remanescente.
*/

package stackchallenge;

public class StackChallenge {
    public static void main(String[] args) {
        StackDeck s = new StackDeck();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        
        s.moveDeck();
        s.printDiscarded();
        s.printStack();
    }    
}

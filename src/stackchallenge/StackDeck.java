package stackchallenge;

public class StackDeck {
    int[] stack;
    int[] discarded;
    int topStack;
    int topDiscarded;
    int firstElement;
    
    public StackDeck() {
        topStack = -1;
        topDiscarded = 0;
        stack = new int[15];
        discarded = new int[15];
        firstElement = 0;
    }
    
    public boolean isEmpty() {
        if (topStack == -1) {
            return true;
        }
        return false;
    }
    
    public int size() {
        if (isEmpty() == true) {
            return 0;
        }
        else {
            return topStack + 1;
        }
    }
    
    public void push(int value) {
        if (topStack < stack.length - 1) {
            stack[++topStack] = value;
            System.out.println(value + " has been inserted");
        }
        else {
            System.out.println(value + " was not inserted, reason: 'StackOverFlow'");
        }
    }
        
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int valueRemoved = stack[topStack--];
        return valueRemoved;
    }
    
    public void moveDeck() {
        while (topStack >= 1) {
            discarded[topDiscarded] = this.pop();
            topDiscarded++;
            //criar algoritmmo que deixe o ultimo elemento da pilha vazio e reposicione os demais para o topo
            for (int i = 0; i < stack.length; i ++) {
                
            }
        }
    }    
        
    public String popAll() {
        while (!isEmpty()) {
            int valueRemoved = stack[topStack--];
        }
        return "stack has been emptied";
    }
    
}
package stackchallenge;

public class StackDeck {
    int[] stack;
    int[] discarded;
    int topStack;
    
    public StackDeck() {
        topStack = -1;
        stack = new int[5];
        discarded = new int[5];
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
    
    /*
    public void moveDeck() {
        while (cartas > 2) {
            discarded[] = this.pop();
            stack[topStack] = 
        }
    }
    */
    public String popAll() {
        while (!isEmpty()) {
            int valueRemoved = stack[topStack--];
        }
        return "stack has been emptied";
    }
    
}
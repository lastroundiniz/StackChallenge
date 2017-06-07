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
        stack = new int[10];
        discarded = new int[10];
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
    
    public void printStack() {
        System.out.println(" ");
        for (int i = 0; i <= topStack; i++) {
            System.out.println("Remaining card: " + stack[i] + " ");
        }
    }
    
    public void printDiscarded() {
        System.out.print("Dicarded: ");
        for (int i = 0; i < topDiscarded; i++) {
            System.out.print(discarded[i] + " ");
        }
    }
    
    public void moveDeck() {
        System.out.println(" ");
        while (topStack >= 1) {
            discarded[topDiscarded] = this.pop();
            topDiscarded++;
            int temp_top = stack[topStack];
            for (int i = topStack; i >= 1; i--) {
                stack[i] = stack[i-1];
            }
            stack[0] = temp_top;
        }
    }
        
    public String popAll() {
        while (!isEmpty()) {
            int valueRemoved = stack[topStack--];
        }
        return "stack has been emptied";
    }
    
}
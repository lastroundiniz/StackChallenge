package stackchallenge;

public class StackChallenge {
    public static void main(String[] args) {
        StackDeck s = new StackDeck();
        s.push(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        s.moveDeck();
        s.printDiscarded();
    }    
}

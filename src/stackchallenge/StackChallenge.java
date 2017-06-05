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
    }    
}

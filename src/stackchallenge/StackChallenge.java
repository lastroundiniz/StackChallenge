package stackchallenge;

public class StackChallenge {
    public static void main(String[] args) {
        StackDeck s = new StackDeck();
        s.push(10);
        s.push(20);
        s.push(40);
        
        int a;
        a = s.pop();
        System.out.println(a);
    }
    
}

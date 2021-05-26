import java.util.Stack;
public class stack {
    public static void main(String[] args) {
       Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("1");
        stackOfCards.pop();
        stackOfCards.push("2");
        stackOfCards.push("3");
        stackOfCards.pop();
        stackOfCards.push("4");
        stackOfCards.pop();
        stackOfCards.pop();
        stackOfCards.push("5");
        System.out.println(stackOfCards);
      
       
    }
}
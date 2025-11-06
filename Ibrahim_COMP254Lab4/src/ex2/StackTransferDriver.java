package ex2;
import java.util.Stack;

public class StackTransferDriver {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        Stack<Integer> T = new Stack<>();

        S.push(1);
        S.push(2);
        S.push(3);

        StackTransfer.transfer(S, T);

        System.out.println("Stack T after transfer: " + T);
    }
}

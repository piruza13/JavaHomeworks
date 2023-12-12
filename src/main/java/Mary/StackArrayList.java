package Mary;
import java.util.ArrayList;
import java.util.LinkedList;

public class StackArrayList {
    public static void main(String[] args){
        ArrayList<LinkedList<Integer>> stackArrayList = new ArrayList<>();

        stackArrayList.add(new LinkedList<>());
        stackArrayList.add(new LinkedList<>());

        stackArrayList.get(0).push(5);
        stackArrayList.get(0).push(10);
        stackArrayList.get(1).push(7);

        int poppedElement1 = stackArrayList.get(0).pop();
        int poppedElement2 = stackArrayList.get(1).pop();

        System.out.println("Popped element from Stack1: " + poppedElement1);
        System.out.println("Popped element from Stack2: " + poppedElement2);
    }

}
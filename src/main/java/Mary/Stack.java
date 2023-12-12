package Mary;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full.Cannot push");
        }else{
            top++;
            stackArray[top] = value;
            System.out.println(value + " pushed into the stack");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }else{
            int value = stackArray[top];
            top--;
            System.out.println(value + " popped from the stack");
            return value;
        }
    }
    private boolean isFull(){
        return(top == maxSize - 1);
    }
    private boolean isEmpty(){
        return (top == -1);
    }
    public static void main(String[] args){
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
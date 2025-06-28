public class Stack {
    int[] myStack;
    int top;
    int capacity;
    public Stack(int size){
        myStack= new int[size];
        capacity=size;
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push (int value) {
        myStack[top]=value;
            System.out.println(value+"pushed to stack");
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            int value= myStack[top];

            top--;
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            int value=myStack[top];
            return value;
        }
    }
    public int size() {
        return top + 1;
    }
}


class UsingStack {
    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        System.out.println(stack.size());
    }
}

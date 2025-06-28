

public class CustomStack {
    int [] myStack;
    int top;
    int capacity;
    public CustomStack(int size) {
        myStack = new int[size];
        capacity=size;
        top=-1;

    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top ==capacity-1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack Overflow");
        } else{
            top++;
            myStack[top]=value;
            System.out.println(value+"pushed to stack");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -9999;
        } else{
            int value = myStack[top];
            top--;
            return value;
        }
    }
    public int peek() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -9999;
        }
        else{
            int value=myStack[top];
            return value;
        }
    }
}

class Customstack {
    public static void main(String[] args) {
        CustomStack customstack = new CustomStack(5);
        customstack.push(10);
        customstack.push(20);
        System.out.println(customstack.peek());
        System.out.println(customstack.pop());
        System.out.println(customstack.pop());
        System.out.println(customstack.isEmpty());
        System.out.println(customstack.isFull());
    }
}
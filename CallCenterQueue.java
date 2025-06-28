import java.util.Scanner;

public class CallCenterQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;

    public CallCenterQueue(int size) {
        capacity = size;
        queue = new String[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void addCall(String call) {
        if (isFull()) {
            System.out.println("Call queue is full. Cannot add call: " + call);
        } else {
            rear++;
            queue[rear] = call;
            System.out.println("Incoming call from " + call + " added to the queue.");
        }
    }

    public void handleCall() {
        if (isEmpty()) {
            System.out.println("No pending calls to handle.");
        } else {
            String call = queue[front];
            System.out.println("Handling call from: " + call);
            front++;
        }
    }

    public void displayCalls() {
        if (isEmpty()) {
            System.out.println("Call queue is empty.");
        } else {
            System.out.println("Pending Calls:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + queue[i]);
            }
        }
    }

    public int countCalls() {
        return isEmpty() ? 0 : rear - front + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallCenterQueue queue = new CallCenterQueue(10);

        while (true) {
            System.out.println("\n=== Call Center Queue System ===");
            System.out.println("1. Add incoming call");
            System.out.println("2. Handle next call");
            System.out.println("3. Display current call queue");
            System.out.println("4. Display number of pending calls");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter caller ID/name: ");
                    String caller = scanner.nextLine();
                    queue.addCall(caller);
                    break;
                case 2:
                    queue.handleCall();
                    break;
                case 3:
                    queue.displayCalls();
                    break;
                case 4:
                    System.out.println("Number of pending calls: " + queue.countCalls());
                    break;
                case 5:
                    System.out.println("Exiting call center system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

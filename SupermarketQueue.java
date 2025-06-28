import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SupermarketQueue(int size) {
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

    public void enqueue(String customer) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add customer: " + customer);
        } else {
            rear++;
            queue[rear] = customer;
            System.out.println(customer + " added to the queue.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No customer to serve.");
        } else {
            String servedCustomer = queue[front];
            System.out.println("Serving customer: " + servedCustomer);
            front++;
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current Queue:");
            for (int i = front; i <= rear; i++) {
                System.out.println((i - front + 1) + ". " + queue[i]);
            }
        }
    }

    public int size() {
        return isEmpty() ? 0 : rear - front + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SupermarketQueue queue = new SupermarketQueue(10);

        while (true) {
            System.out.println("\n=== Supermarket Queue System ===");
            System.out.println("1. Add customer to the queue");
            System.out.println("2. Serve next customer");
            System.out.println("3. Display current queue");
            System.out.println("4. Display number of customers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.enqueue(name);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Number of customers in queue: " + queue.size());
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

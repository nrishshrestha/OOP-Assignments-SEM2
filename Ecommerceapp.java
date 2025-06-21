abstract class PaymentMethod {
    abstract void Validation();
    abstract void TransactionProcess();

}

class CreditCard extends PaymentMethod {
    void Validation() {
        System.out.println("Validating Credit card...");
    }
    void TransactionProcess() {
        System.out.println("Processing Transaction");
    }
}

class Paypal extends PaymentMethod {
    void Validation() {
        System.out.println("Validating Paypal ID");
    }
    void TransactionProcess() {
        System.out.println("Processing Transaction");
    }
}

class BankTransfer extends PaymentMethod {
    void Validation() {
        System.out.println("Validation Bank ID Number");
    }
    void TransactionProcess() {
        System.out.println("Processing Transaction");
    }
}
public class Ecommerceapp {
    public static void main(String[] args) {
        PaymentMethod[] payment = {
            new CreditCard(),
            new Paypal(),
            new BankTransfer(),
        };
        for (PaymentMethod m : payment){
            m.Validation();
            m.TransactionProcess();
        }
    }
}

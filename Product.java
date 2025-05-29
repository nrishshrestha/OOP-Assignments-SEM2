public class Product {
    private String productName;
    private int productId;
    private float price;
    private int stockQuantity;

    public Product(String productName, int productId, float price, int stockQuantity) {
        this.productName = productName;
        this.productId = productId;
        setPrice(price);
        this.stockQuantity = stockQuantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
    }

    public boolean purchase(int quantity) {
        if (quantity > 0 && stockQuantity >= quantity) {
            stockQuantity -= quantity;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 101, 799.99f, 10);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Stock: " + product.getStockQuantity());

        product.restock(5);
        System.out.println("Stock after restocking: " + product.getStockQuantity());

        boolean success = product.purchase(3);
        System.out.println("Purchase 3 units: " + (success ? "Successful" : "Failed"));
        System.out.println("Stock after purchase: " + product.getStockQuantity());
    }
}

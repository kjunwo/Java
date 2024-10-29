package P1029;

public class Product {
    String productId; // 제품아이디
    String name; // 제품명
    double price; // 가격
    int stock; // 재고수량

    public Product(String productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public double setPrice(double newPrice) {
        this.price = newPrice;
        return this.price;
    }
    public int setStock(int newStock) {
        this.stock = newStock;
        return this.stock;
    }
}

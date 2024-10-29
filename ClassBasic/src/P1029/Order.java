package P1029;

import java.util.Date;

public class Order {
    String orderId; // 주문번호
    User user; // 주문한 사람 클래스!!
    Product product; // 주문한 제품 클래스!!
    Date orderDate; // 주문날짜
    double totalAmount; // 주문수량

    public Order(String orderId, User user, Product product, Date orderDate, double totalAmount) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }
}

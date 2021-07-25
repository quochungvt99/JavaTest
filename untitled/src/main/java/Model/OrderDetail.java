package Model;

public class OrderDetail {
    int orderDetailID;
    int orderID;
    int productID;
    int quantity;

    public OrderDetail(int orderDetailID, int orderID, int productID, int quantity) {
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailID=" + orderDetailID +
                ", orderID=" + orderID +
                ", productID=" + productID +
                ", quantily=" + quantity +
                '}';
    }
}

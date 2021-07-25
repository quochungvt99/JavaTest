package Model;

public class Orders {
    int orderID;
    int customerID;
    int employeeID;
    String orderDate;
    int shipperID;

    public Orders(int orderID, int customerID, int employeeID, String orderDate, int shipperID) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.orderDate = orderDate;
        this.shipperID = shipperID;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", employeeID=" + employeeID +
                ", orderDate='" + orderDate + '\'' +
                ", shipperID=" + shipperID +
                '}';
    }
}

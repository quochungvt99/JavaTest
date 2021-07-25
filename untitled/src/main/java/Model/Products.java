package Model;

public class Products {
    int productID;
    String productName;
    int supplierID;
    int categoryID;
    String unit;
    float price;

    public Products(int productID, String productName, int supplierID, int categoryID, String unit, float price) {
        this.productID = productID;
        this.productName = productName;
        this.supplierID = supplierID;
        this.categoryID = categoryID;
        this.unit = unit;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", supplierID=" + supplierID +
                ", categoryID=" + categoryID +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}

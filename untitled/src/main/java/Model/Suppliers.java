package Model;

public class Suppliers {
    int supplierID;
    String supplierName;
    String contactName;
    String address;
    String city;
    String postalCode;
    String country;
    String phone;

    public Suppliers(int supplierID, String supplierName, String contactName, String address, String city, String postalCode, String country, String phone) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.contactName = contactName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "supplierID=" + supplierID +
                ", supplierName='" + supplierName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

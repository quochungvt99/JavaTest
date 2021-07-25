import Model.*;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Factory {
    public static String getCategories() {
        ArrayList<Categories> arrayCategories = new ArrayList<>();

        ResultSet result;
        try {
            Connection connection = JDBCConnection.getConnection();
            String query = "SELECT * FROM categories";
            System.out.println(query);
            Statement statement = connection.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                String id = result.getString("CategoryID");
                String name = result.getString("CategoryName");
                String des = result.getString("Description");
                Categories categories = new Categories(id, name, des);
                arrayCategories.add(categories);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayCategories);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getCustomers() {
        ArrayList<Customers> arrayCustomer = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM customers";
            System.out.println(query);
            result = statement.executeQuery(query);
            while (result.next()) {
                int id = result.getInt("customerID");
                String name = result.getString("customerName");
                String contact = result.getString("contactName");
                String address = result.getString("address");
                String city = result.getString("city");
                String Code = result.getString("postalCode");
                String country = result.getString("country");
                Customers customers = new Customers(id, name, contact, address, city, Code, country);
                arrayCustomer.add(customers);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayCustomer);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getEmployees() {
        ArrayList<Employees> arrayListEmployee = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM employees";
            result = statement.executeQuery(query);
            System.out.println(query);
            while (result.next()) {
                int id = result.getInt("employeeID");
                String lName = result.getString("lastName");
                String fName = result.getString("firstName");
                String birthDate = result.getString("birthDate");
                String photo = result.getString("photo");
                String notes = result.getString("notes");
                Employees employees = new Employees(id, lName, fName, birthDate, photo, notes);
                arrayListEmployee.add(employees);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayListEmployee);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getOrders() {
        ArrayList<Orders> arrayOrders = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM orders";
            result = statement.executeQuery(query);
            System.out.println(query);
            while (result.next()) {
                int orderID = result.getInt("orderID");
                int customerID = result.getInt("customerID");
                int employeeID = result.getInt("employeeID");
                String orderDate = result.getString("orderDate");
                int shipperID = result.getInt("shipperID");
                Orders orders = new Orders(orderID, customerID, employeeID, orderDate, shipperID);
                arrayOrders.add(orders);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayOrders);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getOrderDetail() {
        ArrayList<OrderDetail> arrayOrderDetail = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM order_details";
            System.out.println(query);
            result = statement.executeQuery(query);
            while (result.next()) {
                int detailID = result.getInt("orderDetailID");
                int orderID = result.getInt("orderID");
                int productID = result.getInt("productID");
                int quantity = result.getInt("quantity");
                OrderDetail orderDetail = new OrderDetail(detailID, orderID, productID, quantity);
                arrayOrderDetail.add(orderDetail);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayOrderDetail);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getProducts() {
        ArrayList<Products> arrayProduct = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM products";
            result = statement.executeQuery(query);
            System.out.println(query);
            while (result.next()) {
                int productID = result.getInt("productID");
                String name = result.getString("productName");
                int supplierID = result.getInt("supplierID");
                int categoryID = result.getInt("categoryID");
                String unit = result.getString("unit");
                float price = result.getFloat("price");
                Products products = new Products(productID, name, supplierID, categoryID, unit, price);
                arrayProduct.add(products);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayProduct);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getShipper() {
        ArrayList<Shippers> arrayShippers = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM shippers";
            result = statement.executeQuery(query);
            System.out.println(query);
            while (result.next()) {
                int id = result.getInt("shipperID");
                String name = result.getString("shipperName");
                String phone = result.getString("phone");
                Shippers shippers = new Shippers(id, name, phone);
                arrayShippers.add(shippers);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayShippers);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getSuppliers() {
        ArrayList<Suppliers> arraySuppliers = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM suppliers";
            result = statement.executeQuery(query);
            System.out.println(query);
            while (result.next()) {
                int supplierID = result.getInt("supplierID");
                String supplierName = result.getString("supplierName");
                String contactName = result.getString("contactName");
                String address = result.getString("address");
                String city = result.getString("city");
                String postalCode = result.getString("postalCode");
                String country = result.getString("country");
                String phone = result.getString("phone");
                Suppliers suppliers = new Suppliers(supplierID, supplierName, contactName, address, city, postalCode, country, phone);
                arraySuppliers.add(suppliers);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arraySuppliers);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getCategoriesByID(int ID) {
        ArrayList<Categories> arrayCategories = new ArrayList<>();

        ResultSet result;
        try {
            Connection connection = JDBCConnection.getConnection();
            String query = "SELECT * FROM categories WHERE CategoryID = " + ID;
            System.out.println(query);
            Statement statement = connection.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                String id = result.getString("CategoryID");
                String name = result.getString("CategoryName");
                String des = result.getString("Description");
                Categories categories = new Categories(id, name, des);
                arrayCategories.add(categories);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayCategories);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String getEmployeeByName(String lastName) {
        ArrayList<Employees> arrayListEmployee = new ArrayList<>();
        ResultSet result;

        try {
            Connection connection = JDBCConnection.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM employees WHERE lastName = " + "'" + lastName + "'";
            result = statement.executeQuery(query);
            System.out.println(query);
            while (result.next()) {
                int id = result.getInt("employeeID");
                String lName = result.getString("lastName");
                String fName = result.getString("firstName");
                String birthDate = result.getString("birthDate");
                String photo = result.getString("photo");
                String notes = result.getString("notes");
                Employees employees = new Employees(id, lName, fName, birthDate, photo, notes);
                arrayListEmployee.add(employees);
            }
            Gson gson = new Gson();
            String jison = gson.toJson(arrayListEmployee);
            System.out.println(jison);
            return jison;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static String insertCategories(String CategoryName, String Description) {
        Connection connection = JDBCConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO categories(CategoryName, Description) VALUES" +
                    "(" + "'" + CategoryName + "'" + "," + "'" + Description + "'" + ")";
            System.out.println(query);
            int result = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        String s = "Insert thanh cong";
        return s;
    }

    public static String updateCategories(String CategoryID, String CategoryName, String Description) {
        Connection connection = JDBCConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "UPDATE categories SET " +
                    "CategoryName = " + "'" + CategoryName + "'," + "Description = " + "'" + Description + "'" +
                    "WHERE CategoryID = " + "'" + CategoryID + "'";
            System.out.println(query);
            int result = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        String s = "Update thanh cong";
        return s;
    }

    public static String deleteCategories(String CategoryID) {
        Connection connection = JDBCConnection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = "DELETE FROM categories WHERE categoryID = " + CategoryID;
            int result = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        String s = "Delete thanh cong";
        return s;
    }


//    public static void main(String[] args) {
//        getCategories();
//        getCustomers();
//        getEmployees();
//        getOrders();
//        getOrderDetail();
//        getProducts();
//        getShipper();
//        getSuppliers();
//        getCategoriesByID(1);
//        getEmployeeByName("Davolio");
//
//    }
}

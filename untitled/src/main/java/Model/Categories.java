package Model;

public class Categories {
    public String CategoryID;
    public String CategoryName;
    public String Description;

    public Categories(String categoryID, String categoryName, String description) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        Description = description;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "CategoryID='" + CategoryID + '\'' +
                ", CategoryName='" + CategoryName + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}

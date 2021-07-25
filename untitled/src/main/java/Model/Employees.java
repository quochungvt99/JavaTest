package Model;

public class Employees {
    int employeeID;
    String lastName;
    String firstName;
    String birthDate;
    String photo;
    String notes;

    public Employees(int employeeID, String lastName, String firstName, String birthDate, String photo, String notes) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.photo = photo;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeID=" + employeeID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", photo='" + photo + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}

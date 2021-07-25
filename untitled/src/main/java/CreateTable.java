import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public static void createTable(){
        Connection con = JDBCConnection.getConnection();

        try {
            Statement st = con.createStatement();
            String sql = "create table Person(id INT, name CHAR)";
            int rs = st.executeUpdate(sql);
            System.out.println(rs);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void deleteTable(){
        Connection connection = JDBCConnection.getConnection();
        try{
            Statement st2 = connection.createStatement();
            String sql = "drop table Person";
            int result = st2.executeUpdate(sql);
            System.out.println(result);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
//        createTable();
        deleteTable();
    }


}

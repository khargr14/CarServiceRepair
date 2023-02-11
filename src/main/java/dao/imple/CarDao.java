package dao.imple;
import binary.CarDetails;
import interfaces.IDelete_Data;
import interfaces.IGetAllData;
import interfaces.Insert_Car_Data;
import interfaces.Insert_User_Data;


import java.sql.*;

public class CarDao implements Insert_Car_Data<CarDetails>, Insert_User_Data, IDelete_Data, IGetAllData {

    public static void main(String args[]) {

    }

    @Override
    public void Insert_Car(CarDetails data) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/carrepairservice", "root", "hargrove150!!!");



            int year = data.years;
            String modelnumber = data.carmodel;
            String manufacturing = data.manufacturingNumber;
            System.out.println(modelnumber);
            System.out.println("Connection is created successfully:");
            //Statement st= con.createStatement();
            // the mysql Insert_Car_Data statement
            PreparedStatement stmt=con.prepareStatement("insert into cardata values(?,?,?)");
            stmt.setInt(1,year);//1 specifies the first parameter in the query
            stmt.setString(2,modelnumber);
            stmt.setString(3,manufacturing);

            stmt.execute();

            System.out.println("Data Added successfully to database");
            // create the mysql Insert_Car_Data preparedstatement
            ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public void Insert_User_Details(int id, String name, int age) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/carrepairservice", "root", "hargrove150!!!");
            int uid=id;
            String uname=name;
            int uage=age;


            //Statement st= con.createStatement();
            // the mysql Insert_Car_Data statement
            PreparedStatement stmt=con.prepareStatement("insert into userdetails values(?,?,?)");
            stmt.setInt(1,uid);//1 specifies the first parameter in the query
            stmt.setString(2,uname);
            stmt.setInt(3,uage);

            stmt.execute();

            System.out.println("User Data Added successfully to database");
            // create the mysql Insert_Car_Data preparedstatement
            ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void delete(int id) {

        int uid=id;
        System.out.println("uid==="+uid);
        Connection conn = null;
        Statement stmt = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrepairservice", "root", "hargrove150!!!");


            String query1 = "delete from userdetails where id = ?";


            PreparedStatement preparedStmt = conn.prepareStatement(query1);
            preparedStmt.setInt(1, uid);

            // execute the preparedstatement
            preparedStmt.execute();
            System.out.println("Record is deleted from the table successfully..................");
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void getAlldat() {

        Connection conn = null;
        Statement stmt = null;
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrepairservice", "root", "usman7866228");
            System.out.println("This is Your Complete Data From Mysql which you have stored");
            stmt = conn.createStatement();
            String sql = "SELECT id,name,age " +
                    "FROM userdetails";

            ResultSet rs    = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("This is a User Details");
                System.out.println(rs.getString("id") + "\t" +
                        rs.getString("name")  + "\t" +
                        rs.getString("age")+"\t");


            }
        }catch (Exception e)
        {
            System.out.println("Error occur");
        }
    }
}

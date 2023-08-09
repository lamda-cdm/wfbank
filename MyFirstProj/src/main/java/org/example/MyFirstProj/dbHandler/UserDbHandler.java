package org.example.MyFirstProj.dbHandler;

import java.sql.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.MyFirstProj.model.*;

public class UserDbHandler {
    public void registerUser(int account_no, String username, String password, String pin){
        try(
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", "root", "Password@1");
                Statement stat = conn.createStatement();
        )
        {
//            String salt = Utils.genRandomSalt();
//            String encPass = Utils.encryptPassword(password,salt);
            String sqlInsert = "INSERT INTO user (account_no,username, password, pin) VALUES (" + account_no + ",'" + username + "','" + password + "','" + pin + "')";
            int countInserted = stat.executeUpdate(sqlInsert);
            if(countInserted != 0)
                System.out.println("User successfully added");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }

    public boolean loginuser(String username, String password){
        boolean status = false;

        try(
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", "root", "Password@1");
                Statement stmt = conn.createStatement();
        )
        {
            String sql = "SELECT password FROM user WHERE username = '" + username + "'";
            ResultSet rSet = stmt.executeQuery(sql);
            rSet.next();
//            String dbSalt;
//            dbSalt = rSet.getString("salt");
            String dbPassword = rSet.getString("password");
//            String pass = Utils.encryptPassword(password,dbSalt);

            if(dbPassword.equals(password)){
                status =true;
            }

        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        return status;
    }

    public void deleteuser(String username)
    {
        try
                (
                        Connection conn =DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", "root", "Password@1");
                        Statement stmt = conn.createStatement();
                )
        {
            String sqlDelete = "DELETE FROM user WHERE username = '" + username + "'";
            int countDeleted = stmt.executeUpdate(sqlDelete);
            if(countDeleted != 0)
                System.out.println("User member record deleted");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
//    public ArrayList getUserList(){
//        ArrayList<User> userList = new ArrayList();
//        try
//                (
//                        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", "root", "Password@1");
//                        Statement stmt = conn.createStatement();
//                ){
//            String str = "SELECT username,age,salary FROM user";
//            ResultSet rSet = stmt.executeQuery(str);
//
//            while(rSet.next()){
//                String name = rSet.getString("name");
//                int age = rSet.getInt("age");
//                double salary = rSet.getDouble("salary");
//
//                userList.add(new User(username,account_no));
//            }
//
//        }
//        catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return userList;
//    }

//    public void displayuserInfo(){
//        try(
//                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", "root", "Password@1");
//                Statement stmt = conn.createStatement();
//        ){
//            String strSelect = "SELECT name,age,salary FROM user";
//            ResultSet rSet = stmt.executeQuery(strSelect);
//
//            System.out.printf("%-20s%-10s%-10s\n","Name","Age","Salary");
//            while(rSet.next()){
//                String name = rSet.getString("name");
//                int age = rSet.getInt("age");
//                double salary = rSet.getDouble("salary");
//                System.out.printf("%-20s%-10d%-10.2f\n",name,age,salary);
//            }
//        }
//        catch (SQLException ex) {
//            System.out.println(ex);
//        }
//    }

//    public user usermember(String name){
//        user status = null;
//
//        try(
//                Connection conn = DriverManager.getConnection(StringConstants.DB_URL,StringConstants.USER,StringConstants.PASS);
//                Statement stmt = conn.createStatement();
//        )
//        {
//            String sql = "SELECT salary,age FROM user WHERE name = '" + name + "'";
//            ResultSet rSet = stmt.executeQuery(sql);
//            rSet.next();
//            int age = rSet.getInt("age");
//            int salary = rSet.getInt("salary");
//            status = new user(name,age,salary);
//        }
//        catch(SQLException ex){
//            System.out.println(ex);
//        }
//        return status;
//    }
}

package org.example.MyFirstProj.dbHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author Aditya
 */
public class DbHandler {

    public boolean connection(){
        boolean status = false;

        try(
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", "root", "Password@1");
                Statement stat = conn.createStatement();
        )
        {
            status = true;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return status;
    }
}
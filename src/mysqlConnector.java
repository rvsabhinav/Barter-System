/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author meetmate
 */
public class mysqlConnector { 
   
public ResultSet getResultSetFor(String query){
ResultSet rs = null;
try {
Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bs","root","0p3nmysql");
Statement stmt=con.createStatement();
rs=stmt.executeQuery(query);
}
catch(Exception e)
{
    System.out.println(e);
}
return rs;
}

public void setSQLUpdate(String query){
try {
Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/bs","root","0p3nmysql");
Statement stmt=con.createStatement();
stmt.executeUpdate(query);
}
catch(Exception e)
{
    System.out.println(e);
}

}
}

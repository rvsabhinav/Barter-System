
import java.sql.ResultSet;
import java.sql.SQLException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meetm
 */
public class uNameTransfer {

mysqlConnector my = new mysqlConnector();
public void sendUName(String a){
try 
{
my.setSQLUpdate("insert into whoisonline values ('"+a+"');");   
}
catch (Exception e){
   System.out.println(e);
   }
}
public String getUName() throws SQLException{
ResultSet rs = my.getResultSetFor("select * from whoisonline;");
String a="";
if(rs.next()){a = rs.getString("online_user");  }      
return a;
}

    
    public uNameTransfer(){}
  

}

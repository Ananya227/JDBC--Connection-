// program for jdbc

import java.sql.*;
class FirstJDBC{
public static void main(String args[])
{

  try{ 

    //load the driver
   Class.forName("com.mysql.cj.jdbc.Driver");
   
   //Creating a connection
    String url="idbc:mysql://localhost:3306/Ananya";
    String username="root";
   String password="root";


   Connection con = DriverManager.getConnection(url , username , password);
    
   if(con.isClosed())
    {
       System.out.println("Connection is closed");
     } else
      {
       System.out.println("Connection Created......");
   
    }

  

    }catch(Exception e)
   {
          e.printStackTrace();

   }


}


}



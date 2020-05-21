/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.movie.booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author prana
 */
public class OnlineMovieBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/OMB","root","root123");
            Statement st =conn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select*from viewer");
        }
        catch(Exception e)
                {
                    System.out.println("Error");
                }*/
       Moviebooking mb=new Moviebooking();
       mb.setVisible(true);
     
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan901;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Sri Andayani
 * TGL : 17/05/2025   
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           dbkoneksi dbk = new dbkoneksi();
           Statement stm = dbk.koneksi().createStatement();
           String sql="SELECT * FROM data_teman;";
           ResultSet rs = stm.executeQuery(sql);
           
           while(rs.next()){
               System.out.println("Nama : "+ rs.getString("nama_teman"));
           }
       }catch(SQLException err){
           System.out.println("Error akses data teman");
       }
    }
    
}

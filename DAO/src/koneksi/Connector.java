/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class Connector {
    static Connection con;
    
    public static void connection(){
    if(con==null){
    MysqlDataSource data = new MysqlDataSource();
    data.setDatabaseName("dataperpus");
    data.setUser("root");
    data.setPassword("");

    try{
    con = data.getConnection();
        System.out.println("Koneksi Berhasil");}
    catch(SQLException ex){
    ex.printStackTrace();
        System.out.println("Koneksi Gagal");}
    }
    }
} 

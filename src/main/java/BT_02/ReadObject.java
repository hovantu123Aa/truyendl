/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import BT_01.SanPham;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {
    public static void main(String[] args) {
         ArrayList<SanPham> ds = null;
        try {
            FileInputStream fis=new FileInputStream("sanpham.bin");
            ObjectInputStream ojos=new ObjectInputStream(fis);
            ds=(ArrayList<SanPham>)ojos.readObject();
            ojos.close();
        } catch (Exception ex) {
            System.out.println("loi"+ex.toString());
            
        }
        for(SanPham s:ds){
            System.out.println(s);
        }
    }
}

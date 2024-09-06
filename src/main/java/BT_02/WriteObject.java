/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_02;

import BT_01.SanPham;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class WriteObject {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
         ds.add(new SanPham("01", "lua", 20000));
        ds.add(new SanPham("04", "gao", 200000));
        ds.add(new SanPham("03", "cafe", 10000));
        
        
        
        try {
            FileOutputStream fos =new FileOutputStream("sanpham.bin");
            ObjectOutputStream oost=new ObjectOutputStream(fos);
            oost.writeObject(ds);
            oost.close();   
            System.out.println("xong");
        } catch (Exception ex) {
            System.out.println("loi"+ex.toString());
            System.out.println("that bai");
        }
    }
}

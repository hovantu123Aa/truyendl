/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_01;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("01", "lua", 20000));
        ds.add(new SanPham("04", "gao", 200000));
        ds.add(new SanPham("03", "cafe", 10000));
                 
        try {
            FileWriter fw = new FileWriter("sanpham.txt");
               for (SanPham s : ds) {
                fw.write(s.getMaso()+";"+ s.getTen()+";"+ s.getGia()+"\n");
                fw.close();
                   System.out.println("da ghi xong");
            }
        } catch (Exception ex) {
            System.out.println("loi"+ex.toString());
            System.out.println("thanh cong");
        }
         
   
    }

}

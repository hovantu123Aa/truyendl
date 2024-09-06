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
public class Readtextfile {

    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[]arr =line.split(";");
                SanPham s=new SanPham(arr[0], arr[1], Float.parseFloat(arr[2]));
                ds.add(s);
                
            }
            fr.close();
        } catch (Exception ex) {
            System.out.println("bi loi "+ex.toString());
            System.out.println("thanh cong tot dep");
        }
        for(SanPham s:ds){
            System.out.println(s);
        }
    }
}

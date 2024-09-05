/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_01;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for (int i = 0; i < 3; i++) {
                System.out.println("nhap thong tin san phan thu nhat " + (i + 1) + ":");
                System.out.print("Ma so: ");
                String maso = sc.nextLine();
                System.out.print("Ten: ");
                String ten = sc.nextLine();
                System.out.print("Gia: ");
                float gia = sc.nextFloat();
                sc.nextLine(); 
                SanPham sp = new SanPham(maso, ten, gia);
                fw.write(sp.toString() + "\n");
            }
            fw.close();
            System.out.println("nhap du lieu thanh cong");

        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("nhap thông tin thất bại");
        }
    }
}

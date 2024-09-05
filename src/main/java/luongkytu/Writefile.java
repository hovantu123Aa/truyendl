/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luongkytu;

import java.io.*;

public class Writefile {
    public static void main(String[] args) {
        String str="Tôi là một anh hùng bàn phím";
        System.out.println(str);
        try {
            FileWriter fr=new FileWriter("baihich.txt");//tạo đối tượng để kết nối với dữ liệu
            fr.write(str);//ghi dữ liệu
            fr.close(); //đóng file
            System.out.println("da ghi xong");
        } catch (Exception ex) {
            System.out.println("loi xay ra"+ex.toString());
            System.out.println("thao tác ghi file thất bại");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal2;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab5soal2 {

       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan nilai Tinggi: ");
        double Tinggi = input.nextDouble();
        double tinggi = 0;
        
        //Menghitung luas segitiga
        double luas = (alas * tinggi) / 2; 
        
        System.out.println("Luas Segitiga : " + luas);
       input.close();
        
    }
    
}

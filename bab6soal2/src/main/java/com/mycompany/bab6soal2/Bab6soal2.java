/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal2;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab6soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();

        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();

        // Menentukan grade dan keterangan
        String grade;
        String keterangan;

        if (nilai >= 85) {
            grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 75) {
            grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 60) {
            grade = "C";
            keterangan = "Lulus";
        } else {
            grade = "D";
            keterangan = "Tidak Lulus";
        }

        // Output
    }
}

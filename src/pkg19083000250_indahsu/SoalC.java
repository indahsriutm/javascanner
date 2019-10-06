/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg19083000250_indahsu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SoalC {
    private int upah= 2500;
    private int jam, total;
    
    public void masukkanJumlahJam()
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah jam kerja : ");
    jam = input.nextInt();
    total = upah * jam;
    System.out.println("Upah Kerja : "+total);
    }
}

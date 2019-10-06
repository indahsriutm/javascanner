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
public class SoalD {
    private double upah= 2500;
    private double jam, total, potongan, totalUpah;
    
    public void inputJumlahJam()
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah jam kerja : ");
    jam = input.nextDouble();
    potongan = upah * jam * 0.15;
    total = (upah * jam)- potongan;
    System.out.println("Potongan Upah : "+potongan);
    System.out.println("Upah Kerja : "+total);
    }
}

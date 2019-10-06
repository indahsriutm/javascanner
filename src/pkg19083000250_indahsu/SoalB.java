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
public class SoalB {
    private double printer = 660000;
    private double beli, total, totalAkhir, diskon;
    
    public void masukkanJumlah()
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah printer : ");
    beli = input.nextDouble();
    total = printer * beli;
    System.out.println("Total harga : "+total);
    
    if(total > 1500000)
    {
        diskon = total * 0.15;
        System.out.println("Diskon : "+diskon);
        total = total - diskon;
        System.out.println("Total Akhir : " +total);
    }else{
        System.out.println("Diskon : 0");
    }
    }
}

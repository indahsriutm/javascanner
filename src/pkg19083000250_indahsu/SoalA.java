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
public class SoalA {
    private int printer= 660000;
    private int beli, total;
    
    public void inputJumlah()
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah printer : ");
    beli = input.nextInt();
    total = printer * beli;
    System.out.println("Total harga : "+total);
    }
}

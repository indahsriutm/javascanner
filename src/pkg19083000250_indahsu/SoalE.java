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
public class SoalE {
    private int ongkir;
    
    public void inputJarak(){
    Scanner input = new Scanner(System.in);
    
	System.out.print("Pilih Kota Tujuan : \n 1. Surabaya \n 2. Bandung \n\n Masukkan Pilihan : ");
        int tujuan = input.nextInt();
	switch(tujuan) 
            {
            case 1 : ongkir = 2500 * 169;
                System.out.println("Ongkos Kirim : "+ongkir);
                break;
            case 2 : ongkir = 4000 * 452;
                System.out.println("Ongkos Kirim : "+ongkir);
                break;
            }
        
    }
}

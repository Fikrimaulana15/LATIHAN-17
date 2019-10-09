/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan17.tunjangan;

import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN17TUNJANGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tunjangan = 0;
        System.out.println("==========PROGRAM TUNJANGAN==============");
        System.out.println("Berapa gaji pokok anda perbulan?: Rp.|");
        Scanner scanner = new Scanner (System.in);
        double gaji = scanner .nextDouble(); 
        
        System.out.println("Status anda ? (Menikah/Belum)\t: " );
        String status = scanner.next ();
        
        System.out.println("==========Hasil Perhitungan gaji anda======");
        System.out.println("Gaji POkok/t  :" + gaji);
        if (status.equalsIgnoreCase("menikah"))(tunjangan = (int)(0.35*gaji);
    } else{
        tunjangan=0;

            System.out.println("Tunjangan\t " + tunjangan);
            System.out.println("Total Gaji\t " + (gaji+ tunjangan));
            System.out.println("Develoved by : Fikri Maulana)");
    } 
    
}

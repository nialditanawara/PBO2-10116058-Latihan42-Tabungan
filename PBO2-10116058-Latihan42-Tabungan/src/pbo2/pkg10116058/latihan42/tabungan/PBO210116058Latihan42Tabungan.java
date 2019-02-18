/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan42.tabungan;

import java.util.Scanner;

public class PBO210116058Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("========Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo anda sekarang : "
                + tabungan.ambilUang(scan.nextInt()) + "\n");
    }

}
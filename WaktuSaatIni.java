/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class WaktuSaatIni {
    public static void main(String[] args) {
        // Membuat objek Date untuk mendapatkan waktu saat ini
        Date waktuSekarang = new Date();
        
        // Membuat format waktu yang diinginkan
        SimpleDateFormat formatWaktu = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        
        // Menampilkan waktu dengan format yang sudah ditentukan
        System.out.println("Hari ini adalah hari : " + formatWaktu.format(waktuSekarang));
    }
}

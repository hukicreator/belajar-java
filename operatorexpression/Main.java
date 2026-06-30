package operatorexpression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== SOAL 1: Operator Aritmatika =====
        // Buat program kalkulator sederhana.
        // Minta user input 2 angka (a dan b),
        // lalu tampilkan hasil dari: penjumlahan, pengurangan,
        // perkalian, pembagian, dan sisa bagi (modulus).


        // ===== SOAL 2: Operator Penugasan =====
        // Buat variabel int nilai = 10
        // Lakukan operasi berikut secara berurutan dan print hasilnya tiap langkah:
        // nilai += 5
        // nilai -= 3
        // nilai *= 2
        // nilai /= 4


        // ===== SOAL 3: Operator Perbandingan =====
        // Minta user input umur (int).
        // Cek dan tampilkan (pakai println, true/false aja dulu, belum pakai if):
        // - apakah umur >= 17
        // - apakah umur == 20
        // - apakah umur != 0


        // ===== SOAL 4: Operator Logika =====
        // Minta user input 2 angka: nilaiUjian dan kehadiran (dalam persen)
        // Tentukan (true/false) apakah siswa LULUS, dengan syarat:
        // nilaiUjian >= 75 DAN kehadiran >= 80
        // Gunakan operator &&


        // ===== SOAL 5: Increment/Decrement =====
        // Buat variabel int counter = 0
        // Print nilainya, lalu increment 3 kali (counter++)
        // Print lagi nilai akhirnya
        // Lalu decrement 2 kali (counter--)
        // Print lagi nilai akhirnya

        // jawaban soal nomor 1
        int a, b;
        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();
        System.out.println("Hasil penjumlahan: " + (a + b));
        System.out.println("Hasil pengurangan: " + (a - b));
        System.out.println("Hasil perkalian: " + (a * b));
        System.out.println("Hasil pembagian: " + (a / b));
        System.out.println("Hasil sisa bagi: " + (a % b));

        //jawaban soal nomor 2
        int nilai = 10;
        nilai += 5;
        System.out.println("Hasil nilai += 5: " + nilai);
        nilai -= 3;
        System.out.println("Hasil nilai -= 3: " + nilai);
        nilai *= 2;
        System.out.println("Hasil nilai *= 2: " + nilai);
        nilai /= 4;
        System.out.println("Hasil nilai /= 4: " + nilai);

        //jawaban soal nomor 3
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        System.out.println("Apakah umur >= 17? " + (umur >= 17));
        System.out.println("Apakah umur == 20? " + (umur == 20));
        System.out.println("Apakah umur != 0? " + (umur != 0));

        //jawaban soal nomor 4
        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = input.nextInt();
        System.out.print("Masukkan kehadiran (dalam persen): ");
        int kehadiran = input.nextInt();
        boolean lulus = (nilaiUjian >= 75) && (kehadiran >= 80);
        System.out.println("Apakah siswa LULUS? " + lulus);


        //jawaban soal nomor 5
        int counter = 0;
        System.out.println("Nilai awal counter: " + counter); 
        counter++;
        System.out.println("Nilai setelah increment pertama: " + counter);
        counter++;
        System.out.println("Nilai setelah increment kedua: " + counter);
        counter++;
        System.out.println("Nilai setelah increment ketiga: " + counter);
        counter--;
        System.out.println("Nilai setelah decrement pertama: " + counter);
        counter--;
        System.out.println("Nilai setelah decrement kedua: " + counter);



        
        input.close();
    }
}
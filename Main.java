

// struktur program java
public class Main{
    public static void main(String[] args) {
        System.out.println("hello world!");

//variabel dan deklarasi


        int umur = 20;
        String nama = "Katohuki";
        double nilai = 90.5;
        boolean status = true;


        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Nilai : " + nilai);
        System.out.println("Status : " + status);

// operator dasar

        int a = 10, b = 3;
        System.out.println( a + b);  //13
        System.out.println( a - b);  //7
        System.out.println( a * b); //30
        System.out.println( a / b); //3
        System.out.println( a % b); //1(sisa bagi)
        System.out.println( a > b); //true
        System.out.println( a < b); //false

        //pertanyaannya 10 % 3 berapa
        System.out.println( "10 % 3 = " + (10 % 3) ); //1


//tipe data primitif

//tipe data primitif adalah tipe data yang sudah disediakan oleh bahasa pemrograman java, tipe data primitif terdiri dari 8 jenis yaitu :
        //int - bila
        int umur2 = 20; //bilangan bulat
        //double - bilangan desimal
        double ipk = 3.5; //bilangan desimal
        //boolean - true/false
        boolean status2 = true; //true/false
        //char - karakter
        char grade = 'A'; //karakter

// String - bukan tipe data primitif, tapi sering digunakan
        String nama2 = "Katohuki"; //string
        String jurusan = "Sistem Informasi"; //string


        System.out.println(nama2 + "-" + jurusan);
        System.out.println(nama.length()); //4 
        System.out.println(nama.toUpperCase()); //KATOHUKI
        System.out.println(nama.charAt(0)); //K
    }
    
}
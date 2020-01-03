# FungsiRekursif__JV
Bahan Ajar Fundamental Pemrograman Java: Pembuatan Fungsi Rekursif (Recursion) Pada Pemrograman Java Dengan Contoh: Faktorial dan Fibonacci.<br><br>
<img src="https://github.com/RizkyKhapidsyah/FungsiRekursif__JV/blob/master/results/001.PNG">
<img src="https://github.com/RizkyKhapidsyah/FungsiRekursif__JV/blob/master/results/002.PNG">
<img src="https://github.com/RizkyKhapidsyah/FungsiRekursif__JV/blob/master/results/003.PNG">
<img src="https://github.com/RizkyKhapidsyah/FungsiRekursif__JV/blob/master/results/004.PNG"><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/FungsiRekursif__JV/tree/master/src/com/rizkykhapidsyah/rekursif">Source Code.</a><br><br>

-----

Algoritma Rekursif jarang dugunakan oleh seorang programmer untuk kondisi perulangan karena sulit dan juga ribet dibandingkan dengan syntax perulangan seperti while, do-while dan for loops. Tetapi walaupun sulit, kita sebagai seorang programmer harus terus belajar dan belajar dengan begitu semakin banyak masalah/problem yang kita terima, semakin mudah juga kita untuk mencari solusinya.

Materi Yang Harus Kalian Pelajari Sebelumnya:
- Apa Itu Method Void, Return, dan Static pada Java
- Penggunaan Parameter Pada Java
- Statement if dan else pada Pemrograman Java

# Belajar Algoritma Rekursif pada Java

Sebenarnya untuk belajar algoritma Rekursif tidaklah sulit, kita hanya perlu memahami sedikit demi sedikit cara kerjanya dengan begitu pasti kita bisa menerapkannya pada program yang kita buat, walaupun algoritma tersebut masih jarang digunakan. Selanjutnya kita akan membuat program sederhana yang menimgilkan beberapa deret angka dari 1 simgai 10, serta jangan lupa untuk menggunakan sifat/kata kunci static pada variable atau method.

Contoh sederhana penggunaanRekursif:

      package com.rizkykhapidsyah.rekursif;

      public class belajar_rekursif {

          public static void main(String[] args){
              //Memanggil Method Static cetakAngka
              cetakAngka(1); //Nilai Defaultnya 1
          }

          static void cetakAngka(int angka){
              if(angka <=10){ //Kondisi Dimana Program Akan Berhenti
                  System.out.println(angka);
                  //Nilai Pada Parameter Angka Akan Bertambah 1 Setiap Looping
                  cetakAngka(++angka);
              }
          }
      }

Pada contoh program tersebut, setelah fungsi System.out.println(angka); dijalankan, method tersebut akan mengulang kembali statement sebelumnya dengan parameter didalamnya bertambah 1 setiap perulangan itu terjadi simgai kondisi menjadi false dan program berhenti. Mudah bukan, jika kalian sudah memahaminya, kita lanjut pada contoh berikutnya, selanjutnya kita akan mencoba menggunakan Array, didalam array tersebut terdapat beberapa data yang akan kita timgilkan pada layar.

      package com.rizkykhapidsyah.rekursif;

      public class belajar_rekursif {

          static String[] mahasiswa = {"Wildan", "Taufan", "Adibil", "Adam"};

          public static void main(String[] args){
              getMahasiswa(0);
          }

          static void getMahasiswa(int absensi){
              if(absensi < mahasiswa.length){
                  System.out.println("Absensi No-" + absensi + " Bernama: " + mahasiswa[absensi]);
                  getMahasiswa(++absensi);
              }
          }
      }

Jika kalian sudah mulai paham mengenai pengertian serta fungsi Rekursif pada java, pada contoh terakhir ini kita akan membuat program yang lebih kompleks, yaitu menimgilkan Segitiga/Piramid dengan simbol (*). Biasanya untuk membuat program tersebut menggunakan syntax perulangan seperti for loops, tapi kali ini kita akan mencoba menggunakan Rekusif, pada class java kalian, masukan souce code berikut ini:

      package com.rizkykhapidsyah.rekursif;

      import java.util.Scanner;

      public class belajar_rekursif {

          static int baris = 5;

          public static void main(String[] args){
              Scanner input = new Scanner(System.in);
              System.out.print("Masukan Jumlah Baris: ");
              baris = input.nextInt();
              printPyramid(0);
          }

          static void printPyramid(int i) {
              printSpasi(0, i);
              printBintang(baris, i);
              System.out.println();

              if (++i < baris)
                  printPyramid(i);
          }

          static void printSpasi(int j, int i) {
              if (j < baris - i - 1) {
                  System.out.print(" ");
                  printSpasi(j + 1, i);
              }
          }

          static void printBintang(int k, int i) {
              if (k > baris - i - 1) {
                  System.out.print("* ");
                  printBintang(k - 1, i);
              }
          } 
      }

# Contoh Lainnya

Rekursif adalah proses memanggil dirinya sendiri yang biasa dilakukan oleh fungsi atau prosedur pada pemrograman prosedural. Rekursif akan terus berjalan sampai kondisi berhenti terpenuhi.

Pada fungsi rekursif terdapat blok kode:

- Basis –> kode yang menjadi titik berhenti dari proses rekursif
- Rekursif –> kode dimana sebuah blok program memanggil dirinya sendiri
- Berikut ini contoh kode yang menggunakan teknik rekursif :

Menampilkan Deret Bilangan

      public class DeretBilangan {
          static void deret(int i){ 
              if(i<10){ 
                  System.out.print(i+ " "); 
                  deret(++i); 
              } 
          } 
          public static void main(String[] args) {
              // TODO Auto-generated method stub
               int i=0; 
               deret(i); 
          }
      }

Menghitung Faktorial

      public class HitungFaktorial {
          static int faktorial(int i){ 
              if(i==0 || i==1) return 1; 
              return i*faktorial(i-1); 
          }
          public static void main(String[] args) {
              // TODO Auto-generated method stub
              System.out.print(faktorial(6)); 
          }
      }

Menampilkan Deret Bilangan Genap

      public class DeretBilanganGenap {

          static void deretGenap(int i){ 
              if(i<=20) {
                  System.out.print(i +" ");
                  deretGenap(i+=2);
              }         
          } 
          public static void main(String[] args) {
              // TODO Auto-generated method stub
              deretGenap(0); 
          }
      }

-----
Referensi:<br>
- <a href="https://www.wildantechnoart.net">Wildan Techno Art.</a>. Thanks to: <a href="">Wildan Techno Art.</a><br>
- <a href="onestringlab.com">OneStringLab</a>. Thanks to: <a href="">OneStringLab</a><br>

<a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.

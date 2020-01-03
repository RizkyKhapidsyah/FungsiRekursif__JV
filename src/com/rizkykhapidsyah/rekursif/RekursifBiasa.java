package com.rizkykhapidsyah.rekursif;

import java.util.Scanner;

public class RekursifBiasa {
    public static void main(String[] args) {
        Scanner InputUSer = new Scanner(System.in);

        System.out.print("Masukkan Nilai          : ");
        int Nilai = InputUSer.nextInt();

        System.out.println("Anda Memasukkan Nilai   : " + Nilai);

        printNilai(Nilai);
        int Jumlah = jumlahNilai(Nilai);

        System.out.println("Jumlah                  = " + Jumlah);

        int Faktorial = hitungFactorial(Nilai);
        System.out.println("Hasil Faktorial         = " + Faktorial);
    }

    //Fungsi Rekursif Sederhana
    private static int jumlahNilai(int Param) {
        System.out.println("Parameter               = " + Param);

        if (Param == 0) {
            return Param;
        }

        return Param + jumlahNilai(Param - 1);
    }

    //Fungsi Rekursif Sederhana
    private static int hitungFactorial(int Param) {
        System.out.println("Parameter               = " + Param);

        if (Param == 1) {
            return Param;
        }

        return Param + hitungFactorial(Param - 1);
    }

    private static void printNilai(int Param) {
        System.out.println("Nilai                   = " + Param);

        if (Param == 0) {
            return;
        }
    }

}

package com.rizkykhapidsyah.rekursif;

import java.util.Scanner;

public class RekursifBercabang {
    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Masukkan Nilai n  = ");

        int Nilai = InputUser.nextInt();
        int NilaiFibonacci = Fibonacci(Nilai, "Atas");

        System.out.println("Nilai Fibonacci ke - " + Nilai + " Adalah " + NilaiFibonacci);
    }

    private static int Fibonacci(int N, String D) {
        System.out.println("Daun           " + D);
        System.out.println("Fibonacci Ke - " + N);

        if (N == 1 || N == 0) {
            return N;
        } else {
            return Fibonacci(N - 1, "Kiri") + Fibonacci(N - 2, "Kanan");
        }
    }

}

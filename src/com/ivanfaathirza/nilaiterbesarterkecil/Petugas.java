package com.ivanfaathirza.nilaiterbesarterkecil;

import java.util.Scanner;

public class Petugas {
    Scanner scan = new Scanner(System.in);
    private String namaPetugas;
    private int[] arrNilai;

    public void masukkanNama(){
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.next();
    }

    public void masukkanNilai(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlah = scan.nextInt();
        arrNilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            arrNilai[i] = scan.nextInt();
        }
        menentukanNilai(arrNilai);
    }

    private void menentukanNilai(int[] nilaiMhs){
        Nilai nilai = new Nilai();
        nilai.penentuanNilai(nilaiMhs, namaPetugas);
    }
}

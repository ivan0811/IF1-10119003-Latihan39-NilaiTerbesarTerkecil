package com.ivanfaathirza.nilaiterbesarterkecil;

public class Nilai {
    private int terbesar, terkecil;

    private int menentukanNilaiTerkecil(int[] nilaiMhs){
        int nilaiTerkecil = nilaiMhs[0];
        for(int x : nilaiMhs){
            if(nilaiTerkecil > x){
                nilaiTerkecil = x;
            }
        }
        return nilaiTerkecil;
    }

    private int menentukanNilaiTerbesar(int[] nilaiMhs){
        int nilaiTerbesar = nilaiMhs[0];
        for(int x : nilaiMhs){
            if(nilaiTerbesar < x){
                nilaiTerbesar = x;
            }
        }
        return nilaiTerbesar;
    }

    private void tampil(int terbesar, int terkecil, int[] nilaiMhs, String petugas){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        int num = 1;
        for(int x : nilaiMhs){
            System.out.println("Nilai Mahasiswa ke-"+num+" = "+x);
            num++;
        }
        System.out.println("\nNilai Terbesar adalah "+terbesar);
        System.out.println("Nilai Terkecil adalah "+terkecil);
        System.out.println("\nPetugas : "+petugas);
    }

    public void penentuanNilai(int[] nilaiMhs, String petugas){
        terbesar = menentukanNilaiTerbesar(nilaiMhs);
        terkecil = menentukanNilaiTerkecil(nilaiMhs);
        tampil(terbesar, terkecil, nilaiMhs, petugas);
    }
}

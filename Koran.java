package com.company;

public class Koran extends Koleksi {
    private String jenisTerbit;

    public Koran(int noKoleksi, String judulKoleksi, String penerbit, String tglTerbit, String jenisKoleksi, String status, String jenisTerbit) {
        super(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status);
        this.jenisTerbit = jenisTerbit;
    }

    public void displayKoleksi(){
        System.out.println("===Koleksi Koran===");
        System.out.println("Nomor Koleksi : "+noKoleksi);;
        System.out.println("Judul Buku : "+judulKoleksi);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tanggal Terbit : "+tglTerbit);
        System.out.println("Jenis Koleksi : "+jenisKoleksi);
        System.out.println("Jenis Terbit : "+jenisTerbit);
        System.out.println("Status : "+status);
        System.out.println();

    }
}

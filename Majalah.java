package com.company;

public class Majalah extends Koleksi {
    private String noEdisi;
    private String jenisTerbit;

    public Majalah(int noKoleksi, String judulKoleksi, String penerbit, String tglTerbit, String jenisKoleksi, String status, String noEdisi, String jenisTerbit) {
        super(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status);
        this.noEdisi = noEdisi;
        this.jenisTerbit = jenisTerbit;
    }

    public void displayKoleksi(){
        System.out.println("===Koleksi Majalah===");
        System.out.println("Nomor Koleksi : "+noKoleksi);;
        System.out.println("Judul Buku : "+judulKoleksi);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tanggal Terbit : "+tglTerbit);
        System.out.println("Jenis Koleksi : "+jenisKoleksi);
        System.out.println("Nomor Edisi : "+noEdisi);
        System.out.println("Jenis Terbit : "+jenisTerbit);
        System.out.println("Status : "+status);
        System.out.println();

    }
}

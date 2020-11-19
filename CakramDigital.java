package com.company;

public class CakramDigital extends Koleksi {
    private String jenisMedia;

    public CakramDigital(int noKoleksi, String judulKoleksi, String penerbit, String tglTerbit, String jenisKoleksi, String status, String jenisMedia) {
        super(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status);
        this.jenisMedia = jenisMedia;
    }
    public void displayKoleksi(){
        System.out.println("===Koleksi Cakram Digital===");
        System.out.println("Nomor Koleksi : "+noKoleksi);;
        System.out.println("Judul Buku : "+judulKoleksi);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tanggal Terbit : "+tglTerbit);
        System.out.println("Jenis Koleksi : "+jenisKoleksi);
        System.out.println("Jenis Media : "+jenisMedia);
        System.out.println("Status : "+status);
        System.out.println();

    }
}

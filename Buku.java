package com.company;

public class Buku extends Koleksi{

    private String pengarang;
    private String tahunMasuk;
    private String issn;
    private String isbn;
    private String doi;
    private String arxivId;

    public Buku(int noKoleksi, String judulKoleksi, String penerbit, String tglTerbit, String jenisKoleksi, String status, String pengarang, String tahunMasuk, String issn, String isbn, String doi, String arxivId) {
        super(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status);
        this.pengarang = pengarang;
        this.tahunMasuk = tahunMasuk;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivId = arxivId;
    }
    public void displayKoleksi(){
        System.out.println("===Koleksi Buku===");
        System.out.println("Nomor Koleksi : "+noKoleksi);;
        System.out.println("Judul Buku : "+judulKoleksi);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tanggal Terbit : "+tglTerbit);
        System.out.println("Jenis Koleksi : "+jenisKoleksi);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Tahun Masuk : "+tahunMasuk);
        System.out.println("ISSN : "+issn);
        System.out.println("ISBN : "+isbn);
        System.out.println("Doi : "+doi);
        System.out.println("ArxivId : "+arxivId);
        System.out.println("Status : "+status);
        System.out.println();
    }
}

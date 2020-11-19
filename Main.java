package com.company;

import java.util.Scanner;

public class Main {
    static Koleksi buku;
    static Koleksi majalah;
    static Koleksi koran;
    static Koleksi cakram;

    public static void main(String[] args) {
	    OpenLibrary openLibrary = new OpenLibrary();
        Scanner scanner = new Scanner(System.in);

        int masukan;
        String judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status, pengarang, tahunMasuk, issn, isbn, doi, arxivId, jenisTerbit, noEdisi, jenisMedia;
        int noKoleksi;

        do {
            System.out.println("===Masukan Menu===");
            System.out.println("1. Input Koleksi Baru");
            System.out.println("2. Tampilkan Koleksi");
            System.out.println();
            masukan = scanner.nextInt();

            if (masukan == 1){
                System.out.println("Pilih Jenis Koleksi : ");
                System.out.println("1.Buku");
                System.out.println("2.Majalah");
                System.out.println("3.Koran");
                System.out.println("4.Cakram Digital");
                int pilih = scanner.nextInt();

                if (pilih == 1){
                    System.out.println("Masukan Data Buku!");
                    System.out.println("Masukan nomor koleksi : ");
                    noKoleksi = scanner.nextInt();
                    System.out.println("Masukan judul buku : ");
                    judulKoleksi = scanner.nextLine();
                    System.out.println("Masukan penerbit : ");
                    penerbit = scanner.nextLine();
                    System.out.println("Masukan tanggal terbit : ");
                    tglTerbit = scanner.nextLine();
                    System.out.println("Masukan jenis koleksi : ");
                    jenisKoleksi = scanner.nextLine();
                    System.out.println("Masukan status buku : ");
                    status = scanner.next();
                    System.out.println("Masukan pengarang : ");
                    pengarang = scanner.nextLine();
                    System.out.println("Masukan tahun masuk : ");
                    tahunMasuk = scanner.nextLine();
                    System.out.println("Masukan issn : ");
                    issn = scanner.nextLine();
                    System.out.println("Masukan isbn : ");
                    isbn = scanner.nextLine();
                    System.out.println("Masukan doi : ");
                    doi = scanner.nextLine();
                    System.out.println("Masukan arxivId : ");
                    arxivId = scanner.nextLine();

                    buku = new Buku(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status, pengarang, tahunMasuk, issn, isbn, doi, arxivId);
                    openLibrary.tambahKoleksi(buku);

                    System.out.println("Koleksi Berhasil Ditambahkan!!!");
                    System.out.println();

                }if (pilih == 2){
                    System.out.println("Masukan Data Majalah!");
                    System.out.println("Masukan nomor koleksi : ");
                    noKoleksi = scanner.nextInt();
                    System.out.println("Masukan judul buku : ");
                    judulKoleksi = scanner.nextLine();
                    System.out.println("Masukan penerbit : ");
                    penerbit = scanner.nextLine();
                    System.out.println("Masukan tanggal terbit : ");
                    tglTerbit = scanner.nextLine();
                    System.out.println("Masukan jenis koleksi : ");
                    jenisKoleksi = scanner.nextLine();
                    System.out.println("Masukan nomor edisi : ");
                    noEdisi = scanner.nextLine();
                    System.out.println("Masukan jenis terbit : ");
                    jenisTerbit = scanner.nextLine();
                    System.out.println("Masukan status buku : ");
                    status = scanner.nextLine();

                    majalah = new Majalah(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status,noEdisi, jenisTerbit);
                    openLibrary.tambahKoleksi(majalah);

                    System.out.println("Koleksi Berhasil Ditambahkan!!!");
                    System.out.println();


                }if (pilih == 3){
                    System.out.println("Masukan Data Koran!");
                    System.out.println("Masukan nomor koleksi : ");
                    noKoleksi = scanner.nextInt();
                    System.out.println("Masukan judul buku : ");
                    judulKoleksi = scanner.nextLine();
                    System.out.println("Masukan penerbit : ");
                    penerbit = scanner.nextLine();
                    System.out.println("Masukan tanggal terbit : ");
                    tglTerbit = scanner.nextLine();
                    System.out.println("Masukan jenis koleksi : ");
                    jenisKoleksi = scanner.nextLine();
                    System.out.println("Masukan status buku : ");
                    status = scanner.nextLine();
                    System.out.println("Masukan jenis terbit : ");
                    jenisTerbit = scanner.nextLine();

                    koran = new Koran(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status, jenisTerbit);
                    openLibrary.tambahKoleksi(koran);

                    System.out.println("Koleksi Berhasil Ditambahkan!!!");
                    System.out.println();

                }if (pilih == 4){
                    System.out.println("Masukan Data Koran!");
                    System.out.println("Masukan nomor koleksi : ");
                    noKoleksi = scanner.nextInt();
                    System.out.println("Masukan judul buku : ");
                    judulKoleksi = scanner.nextLine();
                    System.out.println("Masukan penerbit : ");
                    penerbit = scanner.nextLine();
                    System.out.println("Masukan tanggal terbit : ");
                    tglTerbit = scanner.nextLine();
                    System.out.println("Masukan jenis koleksi : ");
                    jenisKoleksi = scanner.nextLine();
                    System.out.println("Masukan status buku : ");
                    status = scanner.nextLine();
                    System.out.println("Masukan jenis media : ");
                    jenisMedia = scanner.nextLine();

                    cakram = new CakramDigital(noKoleksi, judulKoleksi, penerbit, tglTerbit, jenisKoleksi, status, jenisMedia);
                    openLibrary.tambahKoleksi(cakram);

                    System.out.println("Koleksi Berhasil Ditambahkan!!!");
                    System.out.println();

                }
            }

            if (masukan == 2){

                ////tampil koleksi
                openLibrary.displayAll();
            }


        }while (masukan !=3);
        System.out.println("Menu tidak ada!");
    }
}

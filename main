package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Lapangan;
import model.Pelanggan;
import model.Reservasi;

public class app {
    private static final List<Lapangan> lapanganList = new ArrayList<>();
    private static final List<Pelanggan> pelangganList = new ArrayList<>();
    private static final List<Reservasi> reservasiList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data contoh
        lapanganList.add(new Lapangan("L1", "Lapangan A", 100000));
        lapanganList.add(new Lapangan("L2", "Lapangan B", 120000));

        int pilihan;
        do {
            System.out.println("\n=== MENU RESERVASI FUTSAL ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Buat Reservasi");
            System.out.println("3. Lihat Semua Reservasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> tambahPelanggan(sc);
                case 2 -> buatReservasi(sc);
                case 3 -> tampilReservasi();
                case 4 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        sc.close();
    }

    private static void tambahPelanggan(Scanner sc) {
        System.out.print("ID Pelanggan: ");
        String id = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("No HP: ");
        String hp = sc.nextLine();
        pelangganList.add(new Pelanggan(id, nama, hp));
        System.out.println("Pelanggan ditambahkan!");
    }

    private static void buatReservasi(Scanner sc) {
        if (pelangganList.isEmpty()) {
            System.out.println("Tambahkan pelanggan dulu!");
            return;
        }

        System.out.print("ID Reservasi: ");
        String idRes = sc.nextLine();
        System.out.print("Pilih ID Pelanggan: ");
        pelangganList.forEach(p -> System.out.println(p));
        String idPel = sc.nextLine();
        Pelanggan p = pelangganList.stream()
                .filter(x -> x.getIdPelanggan().equals(idPel))
                .findFirst()
                .orElse(null);
        if (p == null) {
            System.out.println("Pelanggan tidak ditemukan!");
            return;
        }

        System.out.print("Pilih Lapangan: ");
        lapanganList.forEach(l -> System.out.println(l));
        String idLap = sc.nextLine();
        Lapangan l = lapanganList.stream()
                .filter(x -> x.getIdLapangan().equals(idLap))
                .findFirst()
                .orElse(null);
        if (l == null) {
            System.out.println("Lapangan tidak ditemukan!");
            return;
        }

        System.out.print("Tanggal (dd-mm-yyyy): ");
        String tgl = sc.nextLine();
        System.out.print("Durasi (jam): ");
        int jam = sc.nextInt();
        sc.nextLine();

        Reservasi r = new Reservasi(idRes, p, l, tgl, jam);
        reservasiList.add(r);
        System.out.println("Reservasi berhasil dibuat!");
    }

    private static void tampilReservasi() {
        if (reservasiList.isEmpty()) {
            System.out.println("Belum ada reservasi.");
        } else {
            reservasiList.forEach(System.out::println);
        }
    }
}

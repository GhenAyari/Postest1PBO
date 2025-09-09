package Postest1PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarHewan = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("+======================================+");
            System.out.println("Manajemen Daftar Hewan Kebun Binatang");
            System.out.println("+======================================+");
            System.out.println("|    1. Tambah Hewan                   |");
            System.out.println("|    2. Lihat Daftar Hewan             |");
            System.out.println("|    3. Ubah Data Hewan                |");
            System.out.println("|    4. Hapus Hewan                    |");
            System.out.println("|    5. Keluar                         |");
            System.out.println("+======================================+");

            System.out.print("Pilih menu yang mana: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println(">> Tambah Hewan");
                    System.out.print("Nama Hewan   : ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Hewan  : ");
                    String jenis = input.nextLine();
                    System.out.print("Umur Hewan   : ");
                    String umur = input.nextLine();
                    System.out.print("Habitat Hewan: ");
                    String habitat = input.nextLine();

                    String data = nama + " - " + jenis + " - Umur: " + umur + " - Habitat: " + habitat;
                    daftarHewan.add(data);
                    System.out.println("Mantap, hewan berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println(">> Lihat Daftar Hewan");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data hewan :(");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarHewan.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println(">> Ubah Data Hewan");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data hewan :(");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarHewan.get(i));
                        }
                        System.out.print("Pilih nomor hewan yang mau diubah: ");
                        int indexUpdate = input.nextInt();
                        input.nextLine();

                        if (indexUpdate > 0 && indexUpdate <= daftarHewan.size()) {
                            System.out.print("Nama Hewan Baru   : ");
                            String namaBaru = input.nextLine();
                            System.out.print("Jenis Hewan Baru  : ");
                            String jenisBaru = input.nextLine();
                            System.out.print("Umur Hewan Baru   : ");
                            String umurBaru = input.nextLine();
                            System.out.print("Habitat Hewan Baru: ");
                            String habitatBaru = input.nextLine();

                            String dataBaru = namaBaru + " - " + jenisBaru + " - Umur: " + umurBaru + " - Habitat: " + habitatBaru;
                            daftarHewan.set(indexUpdate - 1, dataBaru);
                            System.out.println("Data hewan berhasil diubah!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    System.out.println(">> Hapus Hewan");
                    if (daftarHewan.isEmpty()) {
                        System.out.println("Belum ada data hewan :(");
                    } else {
                        for (int i = 0; i < daftarHewan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarHewan.get(i));
                        }
                        System.out.print("Pilih nomor hewan yang ingin dihapus: ");
                        int indexHapus = input.nextInt();
                        input.nextLine();

                        if (indexHapus > 0 && indexHapus <= daftarHewan.size()) {
                            daftarHewan.remove(indexHapus - 1);
                            System.out.println("Data hewan berhasil dihapus!");
                        } else {
                            System.out.println("Nomor engga valid");
                        }
                    }
                    break;

                case 5:
                    System.out.println(">> Terima kasih, program selesai");
                    break;

                default:
                    System.out.println("Pilihan engga valid!");
            }
        } while (pilihan != 5);

    }
}


